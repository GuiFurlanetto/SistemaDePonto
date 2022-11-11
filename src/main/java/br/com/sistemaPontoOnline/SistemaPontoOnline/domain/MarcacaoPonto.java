package br.com.sistemaPontoOnline.SistemaPontoOnline.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter

public class MarcacaoPonto {
   // duvida: deve ser uma classe ou interface?
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   @ManyToOne
   private Funcionario funcionario;
   @Enumerated(EnumType.STRING)
   private TipoMarcacao tipoMarcacao;
   private LocalDateTime marcacaoPonto;



}
