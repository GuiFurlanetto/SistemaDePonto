package br.com.sistemaPontoOnline.SistemaPontoOnline.service;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Arquivo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Justificativa;
import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.ArquivoNotFound;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.ArquivoRepository;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.JustificativaRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ArquivoServiceImpl implements ArquivoService{

    private final ArquivoRepository arquivoRepository;
    private final JustificativaRepository justificativaRepository;

    @Override
    public Arquivo getById(Long id) {
        return arquivoRepository.findById(id).orElseThrow(ArquivoNotFound::new);
    }

    @Override
    public Arquivo save(MultipartFile arquivo, Long justificativaId) throws IOException {
        Arquivo arquivoDB = Arquivo.builder()
                .dado(arquivo.getBytes())
                .nome(arquivo.getOriginalFilename())
                .tipo(arquivo.getContentType())

                .build();
        if (justificativaRepository.existsById(justificativaId)){
            Justificativa justificativa = new Justificativa();
            justificativa.setId(justificativaId);
            arquivoDB.setJustificativa(justificativa);

            return arquivoRepository.save(arquivoDB);
        }
        return arquivoRepository.save(arquivoDB);
    }

    @Override
    public List<Arquivo> listAll() {
        return IterableUtils.toList(arquivoRepository.findAll());
    }
}
