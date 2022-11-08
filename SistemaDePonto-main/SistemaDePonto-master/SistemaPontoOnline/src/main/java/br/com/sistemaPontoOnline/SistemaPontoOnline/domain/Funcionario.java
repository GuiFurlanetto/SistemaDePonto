package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table
@Setter
@Getter
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Long codigoFuncional;
    private String nome;
    @OneToOne
    private Cargo cargo;

    @Enumerated(EnumType.STRING)
    private SituacaoFuncionario situacaoFuncionario;
}
