package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;

import java.util.List;

public interface FuncionarioService {

    List<Funcionario> list (Long codigoFuncional);

    /** será que podemos ter os metodos "listByCodigoFuncional" e "listByNome" ou precisar ser apenas "list" pq ja é da biblioteca? (Gui) */
//    List<Funcionario> listByCodigoFuncional (Long codigoFuncional);
//    List<Funcionario> listByNome (String nome);


    Funcionario save (Funcionario funcionario);
    Funcionario getById (Long id);
    Funcionario update (Long codigoFuncional, Funcionario funcionario);
    void delete (Long id);

}
