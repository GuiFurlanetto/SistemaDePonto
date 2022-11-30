package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends CrudRepository<Funcionario, Long> {

    List<Funcionario> findAllByCodigoFuncional(Long codigoFuncional);

}
