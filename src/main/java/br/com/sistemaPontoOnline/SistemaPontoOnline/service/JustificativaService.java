package br.com.sistemaPontoOnline.SistemaPontoOnline.service;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Justificativa;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface JustificativaService {

    List<Justificativa> list (String tipoMarcacao);
    Justificativa save (Justificativa justificativa);
    Optional<Justificativa> getById (Long id);
    Justificativa update (Long id, Justificativa justificativa);
    void delete (Long id);
}
