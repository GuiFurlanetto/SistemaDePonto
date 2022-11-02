package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

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
    private String anexarDocumento;
}
