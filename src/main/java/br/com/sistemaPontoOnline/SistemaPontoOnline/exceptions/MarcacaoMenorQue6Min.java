package br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions;

public class MarcacaoMenorQue6Min extends RuntimeException {

    public MarcacaoMenorQue6Min(){super("Marcação menor que 6 minutos da anterior");}

}
