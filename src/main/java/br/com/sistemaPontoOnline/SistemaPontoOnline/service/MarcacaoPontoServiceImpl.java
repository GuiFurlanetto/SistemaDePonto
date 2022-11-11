package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.MarcacaoPontoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@RequiredArgsConstructor
public class MarcacaoPontoServiceImpl implements MarcacaoPontoService {

    private final MarcacaoPontoRepository marcacaoPontoRepository;

    @Override
    public MarcacaoPonto save(MarcacaoPonto marcacaoPonto, Funcionario funcionario) {
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        return marcacaoPontoRepository.save(marcacaoPonto);
    }

}
