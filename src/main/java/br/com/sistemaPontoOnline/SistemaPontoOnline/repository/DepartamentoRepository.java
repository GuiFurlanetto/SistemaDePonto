package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Departamento;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartamentoRepository extends CrudRepository<Departamento, Long> {
    List<Departamento> findAllBynomeDepartamentoContains (String nomeDepartamento);

}
