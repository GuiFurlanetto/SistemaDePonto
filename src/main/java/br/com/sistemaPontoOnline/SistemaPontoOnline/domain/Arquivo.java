package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;


import lombok.*;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Arquivo {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private String tipo;

    @Lob
    private byte[] dado;

    @OneToOne
    @JoinColumn(name = "justificativa_id")
    private Justificativa justificativa;
}
