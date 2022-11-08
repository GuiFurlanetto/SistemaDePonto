package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Departamento;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.DepartamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("departamentos")
public class DepartamentoController {

    private final DepartamentoService departamentoService;

    public DepartamentoController(DepartamentoService departamentoService){
        this.departamentoService = departamentoService;
    }
    @GetMapping("{id}")
    Optional<Departamento> getById(@PathVariable Long id) {
        return departamentoService.getById(id);
    }

    @GetMapping
    List<Departamento> list(String nomeDepartamento) {
        return departamentoService.list(nomeDepartamento);
    }

    @PostMapping
    Departamento save (@RequestBody Departamento departamento){
        return departamentoService.save(departamento);
    }

    @PutMapping("{id}")
    Departamento update(@PathVariable Long id, @RequestBody Departamento departamento) {
        return departamentoService.update(id, departamento);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id){
        departamentoService.delete(id);
    }

}
