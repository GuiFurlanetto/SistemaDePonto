package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;

public interface MarcacaoPontoService {

    MarcacaoPonto save(MarcacaoPonto marcacaoPonto, Funcionario funcionario);


}
