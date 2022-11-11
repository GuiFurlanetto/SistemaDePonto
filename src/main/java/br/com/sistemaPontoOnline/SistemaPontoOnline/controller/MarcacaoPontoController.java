package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.MarcacaoPontoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("marcacaoponto")
public class MarcacaoPontoController {

    private final MarcacaoPontoService marcacaoPontoService;

    public MarcacaoPontoController(MarcacaoPontoService marcacaoPontoService) {
        this.marcacaoPontoService = marcacaoPontoService;
    }


    @PostMapping
    MarcacaoPonto save (@RequestBody MarcacaoPonto marcacaoPonto, Funcionario funcionario){
        return marcacaoPontoService.save(marcacaoPonto, funcionario);
    }
}
