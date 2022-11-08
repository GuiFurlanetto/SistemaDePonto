package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Departamento;

import java.util.List;
import java.util.Optional;

public interface DepartamentoService {
    List<Departamento> list (String nomeDepartamento);
    Departamento save (Departamento departamento);
    Optional<Departamento> getById (Long id);
    Departamento update (Long id, Departamento departamento);
    void delete (Long id);
}
