package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter

public class HistoricoPonto {

    @Id
    //Faltou questionarmos se criamos um ID aqui (João)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private LocalDateTime dataMarcacao;

    @Enumerated(EnumType.STRING)
    private TipoMarcacao tipoMarcacao;

    @ManyToOne
    private Funcionario funcionario;

    @OneToOne
    private Justificativa justificativa;
}

