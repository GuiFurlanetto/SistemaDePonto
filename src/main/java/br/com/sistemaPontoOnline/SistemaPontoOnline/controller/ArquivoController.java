package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Arquivo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.dto.ArquivoDTO;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.ArquivoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
@RestController
@RequestMapping("justificativas/{justificativaId}/arquivos")

@RequiredArgsConstructor
public class ArquivoController {

    private final ArquivoService arquivoService;

    @PostMapping("/upload")
    @ResponseBody
    public ArquivoDTO uploadFile(@RequestParam("arquivo") MultipartFile arquivo, @PathVariable Long justificativaId) throws IOException {
        Arquivo novoArquivo = arquivoService.save(arquivo,justificativaId);
        return ArquivoDTO.builder()
                .nome(novoArquivo.getNome())
                .tipo(novoArquivo.getTipo())
                .tamanho(novoArquivo.getDado().length)
                .url("/arquivos/" + novoArquivo.getId())
                .build();
    }

    @GetMapping("{id}")
    public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
        Arquivo arquivo = arquivoService.getById(id);
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + arquivo.getNome() + "\"")
                .body(arquivo.getDado());
    }




}
