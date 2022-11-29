package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.MarcacaoPontoRepository;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.MarcacaoPontoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("marcacaoponto")
public class MarcacaoPontoController {

    private final MarcacaoPontoService marcacaoPontoService;


    public MarcacaoPontoController(MarcacaoPontoService marcacaoPontoService) {
        this.marcacaoPontoService = marcacaoPontoService;
    }


    @PostMapping
    MarcacaoPonto save (@RequestBody MarcacaoPonto marcacaoPonto){
        return marcacaoPontoService.save(marcacaoPonto);
    }

    @GetMapping
    List<MarcacaoPonto> list() {
        return marcacaoPontoService.list();
    }

    @GetMapping("{id}") // olhar se esta usando marcacção
    List<MarcacaoPonto> listFuncionario ( @PathVariable Long id) {
        return marcacaoPontoService.listFuncionario(id);
    }
}
