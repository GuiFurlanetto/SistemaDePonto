package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MarcacaoPontoService {

    MarcacaoPonto save(MarcacaoPonto marcacaoPonto, Funcionario funcionario);

    List<MarcacaoPonto> list (MarcacaoPonto marcacaoPonto);

    List<MarcacaoPonto> listFuncionario (MarcacaoPonto marcacaoPonto, Long id);


}
