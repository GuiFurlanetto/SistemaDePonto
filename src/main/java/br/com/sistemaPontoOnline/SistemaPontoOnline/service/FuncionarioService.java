package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    List<Funcionario> list (Long codigoFuncional);
    Funcionario save (Funcionario funcionario);
    Funcionario getById (Long id);
    Funcionario update (Long id, Funcionario funcionario);
    void delete (Long id);

}
