package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;

import java.util.List;
import java.util.Optional;

public interface CargoService {

    List<Cargo> list (String descricaoCargo);
    Cargo save (Cargo cargo);
    Optional<Cargo> getById (Long id);
    Cargo update (Long id, Cargo cargo);
    void delete (Long id);
}
