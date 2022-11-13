package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
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
        return marcacaoPontoRepository.save(marcacaoPonto);
    }

    @Override
    public List<MarcacaoPonto> list(MarcacaoPonto marcacaoPonto) {
        return IterableUtils.toList(marcacaoPontoRepository.findAll());
    }

    @Override
    public List<MarcacaoPonto> listFuncionario(MarcacaoPonto marcacaoPonto, Long id){
        return IterableUtils.toList(marcacaoPontoRepository.findId_byIdFuncionario(id));
    }






}
