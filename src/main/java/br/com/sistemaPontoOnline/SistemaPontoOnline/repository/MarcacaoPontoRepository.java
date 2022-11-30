package br.com.sistemaPontoOnline.SistemaPontoOnline.repository;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MarcacaoPontoRepository extends CrudRepository<MarcacaoPonto, LocalDateTime> {


    @Query(value = "select * from Marcacao_Ponto, Funcionario where Funcionario_id = Funcionario.id and Funcionario.id = ?1", nativeQuery = true)
    List<MarcacaoPonto> findIdByIdFuncionario(@Param("id") Long id);

    @Query(value = "select * from Marcacao_Ponto, Funcionario where Funcionario_id = Funcionario.id and Funcionario.id = ?1 order by marcacao_Ponto desc limit 1", nativeQuery = true)
    Optional<MarcacaoPonto> findByUltimaMarcacao(@Param("id") Long id);

//    duvida: Qual parametro usar para Data?
//    @Query(value = "select marcacao_ponto from Marcacao_Ponto, Funcionario where Funcionario_id = Funcionario.id and Funcionario.id = ?1 and marcacao_ponto between ?2 and ?3", nativeQuery = true)
//    List<MarcacaoPonto> filterByData(@Param("id") Long id);

}
