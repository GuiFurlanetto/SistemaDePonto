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
    private final MarcacaoPontoRepository marcacaoPontoRepository;

    public MarcacaoPontoController(MarcacaoPontoService marcacaoPontoService, MarcacaoPontoRepository marcacaoPontoRepository) {
        this.marcacaoPontoService = marcacaoPontoService;
        this.marcacaoPontoRepository = marcacaoPontoRepository;
    }


    @PostMapping
    MarcacaoPonto save (@RequestBody MarcacaoPonto marcacaoPonto, Funcionario funcionario){
        return marcacaoPontoService.save(marcacaoPonto, funcionario);
    }

    @GetMapping
    List<MarcacaoPonto> list(MarcacaoPonto marcacaoPonto) {
        return marcacaoPontoService.list(marcacaoPonto);
    }

    @GetMapping("{id}")
    List<MarcacaoPonto> listFuncionario (MarcacaoPonto marcacaoPonto, @PathVariable Long id) {
        return marcacaoPontoService.listFuncionario(marcacaoPonto,id);
    }
}
