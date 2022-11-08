package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;


@Entity
@Table
@Setter
@Getter

public class Cargo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String descricaoCargo;

    /** não aceita nenhum valor, não sei se pode ser o formato q o Json usa para inserir no postman... (Gui)*/
    private Time cargaHoraria;

    /** postman não aceita nenhum valor no Departamento, da o erro:
     * {
     *     "timestamp": "2022-11-02T16:14:30.023+00:00",
     *     "status": 400,
     *     "error": "Bad Request",
     *     "path": "/cargos"
     * }*/
    @ManyToOne
    private Departamento departamento;

}
