package br.com.sistemaPontoOnline.SistemaPontoOnline.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ArquivoDTO {

        private String nome;
        private String url;
        private String tipo;
        private long tamanho;
    }

