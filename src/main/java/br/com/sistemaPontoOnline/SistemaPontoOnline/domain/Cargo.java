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
    private Time cargaHoraria;
    @ManyToOne
    private Departamento departamento;

}
