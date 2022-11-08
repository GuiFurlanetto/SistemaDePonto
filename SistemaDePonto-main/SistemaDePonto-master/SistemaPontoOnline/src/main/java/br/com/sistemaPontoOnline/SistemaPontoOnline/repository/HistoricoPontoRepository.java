package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface HistoricoPontoRepository extends CrudRepository<HistoricoPonto, Long> {

    List<HistoricoPonto> findAllBydataMarcacao(LocalDateTime dataMarcacao);
}
