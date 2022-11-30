package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table
@Setter
@Getter
public class Justificativa {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    private Long Id;
    private String tipoJustificativa;
    private LocalDateTime dataJustificativa;

    @OneToOne(cascade = CascadeType.MERGE)
    @JsonIgnoreProperties({"dado","justificativa"})
    private Arquivo arquivo;
}
