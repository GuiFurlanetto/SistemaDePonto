package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MarcacaoPontoService {

    MarcacaoPonto save(MarcacaoPonto marcacaoPonto);

    List<MarcacaoPonto> list ();

    List<MarcacaoPonto> listFuncionario (Long id);

//    List<MarcacaoPonto> listByData(Long id);


}
