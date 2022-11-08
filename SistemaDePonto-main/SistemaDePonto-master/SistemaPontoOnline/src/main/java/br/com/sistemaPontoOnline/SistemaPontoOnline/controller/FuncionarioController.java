package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("funcionarios")
public class FuncionarioController {

    private final FuncionarioService funcionarioService;

    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("{id}")
    Funcionario getById(@PathVariable Long id) {
        return funcionarioService.getById(id);
    }

    @GetMapping
    List<Funcionario> list(Long codigoFuncional) {
        return funcionarioService.list(codigoFuncional);
    }

    @PostMapping
    Funcionario save (@RequestBody Funcionario funcionario){
        return funcionarioService.save(funcionario);
    }

    @PutMapping("{codigoFuncional}")
    Funcionario update(@PathVariable Long codigoFuncional, @RequestBody Funcionario funcionario) {
        return funcionarioService.update(codigoFuncional, funcionario);
    }

    @DeleteMapping("{codigoFuncional}")
    void delete(@PathVariable Long codigoFuncional){
        funcionarioService.delete(codigoFuncional);
    }

}

