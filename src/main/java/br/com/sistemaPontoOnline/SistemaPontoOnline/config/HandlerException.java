package br.com.sistemaPontoOnline.SistemaPontoOnline.config;

import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.FuncionarioNotFound;
import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.JustificativaNotFound;
import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.MarcacaoMenorQue6Min;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.multipart.MaxUploadSizeExceededException;


import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler({FuncionarioNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIError handlerExceptionNotFound(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("ERROR.FCO.001")
                .build();
        return apiError;
    }

    @ExceptionHandler({MarcacaoMenorQue6Min.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public APIError handlerException6Min(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("ERROR.MAR.001")
                .build();
        return apiError;
    }

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public APIError handleMaxSizeException(MaxUploadSizeExceededException exc) {
        return APIError.builder().message("Arquivo acima do tamanho permitido!").build();
    }

    @ExceptionHandler({JustificativaNotFound.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIError handlerExceptionJustificativa(Exception exception) {
        APIError apiError = APIError.builder()
                .message(exception.getMessage())
                .code("ERROR.JUS.001")
                .build();
        return apiError;
    }



}
