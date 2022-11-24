package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Justificativa;
import org.springframework.data.repository.CrudRepository;


import java.util.List;

public interface JustificativaRepository extends CrudRepository<Justificativa, Long> {

    List<Justificativa> findAllBytipoJustificativaContains (String dataMarcacao);
}
