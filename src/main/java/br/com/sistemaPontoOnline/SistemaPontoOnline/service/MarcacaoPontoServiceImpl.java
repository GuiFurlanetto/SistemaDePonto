package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.MarcacaoMenorQue6Min;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.MarcacaoPontoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarcacaoPontoServiceImpl implements MarcacaoPontoService {

    private final MarcacaoPontoRepository marcacaoPontoRepository;

    /*@Override <- FUNCIONANDO
    public MarcacaoPonto save(MarcacaoPonto marcacaoPonto, Funcionario funcionario) {
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        return marcacaoPontoRepository.save(marcacaoPonto);
    }*/

    @Override
    public MarcacaoPonto save(MarcacaoPonto marcacaoPonto, Funcionario funcionario) {

        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        Optional<MarcacaoPonto> ultimaMarcacao = marcacaoPontoRepository.findByUltimaMarcacao(marcacaoPonto.getFuncionario().getId());

        if (ultimaMarcacao.isPresent()) {
            Duration d1 = Duration.between(ultimaMarcacao.get().getMarcacaoPonto(), LocalDateTime.now());
            if (d1.toMinutes() >= 6) {
                return marcacaoPontoRepository.save(marcacaoPonto);
            }
            throw new MarcacaoMenorQue6Min();
        }
        return marcacaoPontoRepository.save(marcacaoPonto);
    }


    @Override
    public List<MarcacaoPonto> list() {
        return IterableUtils.toList(marcacaoPontoRepository.findAll());
    }

    @Override
    public List<MarcacaoPonto> listFuncionario(Long id){
        return IterableUtils.toList(marcacaoPontoRepository.findIdByIdFuncionario(id));
    }

}
