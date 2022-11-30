package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Arquivo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ArquivoService {
    Arquivo getById (Long id);

    Arquivo save (MultipartFile arquivo, Long justificativaId) throws IOException;

}
