package br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions;

public class FuncionarioNotFound extends RuntimeException{
    public FuncionarioNotFound(){
        super("Funcionario não existe");
    }
}
