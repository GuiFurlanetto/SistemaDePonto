package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface HistoricoPontoService {

    List<HistoricoPonto> list (LocalDateTime dataMarcacao);
    HistoricoPonto save (HistoricoPonto historicoPonto);
    Optional<HistoricoPonto> getById (Long id);
    HistoricoPonto update (Long id, HistoricoPonto historicoPonto);
    void delete (Long id);

}
