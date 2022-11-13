package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface MarcacaoPontoRepository extends CrudRepository<MarcacaoPonto, LocalDateTime> {

    /*@Query("FROM MarcacaoPonto where id like '%:id%'")
    List<MarcacaoPonto> findId(Long id);*/

    @Query(value = "select * from Marcacao_Ponto, Funcionario where Funcionario_id = Funcionario.id and Funcionario.id = ?1", nativeQuery = true)
    List<MarcacaoPonto> findId_byIdFuncionario(@Param("id") Long id);



}
