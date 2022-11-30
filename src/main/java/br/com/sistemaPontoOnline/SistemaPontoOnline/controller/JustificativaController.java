package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;


import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Justificativa;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.JustificativaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("justificativas")
public class JustificativaController {

    private final JustificativaService justificativaService;


    public JustificativaController(JustificativaService justificativaService) {
        this.justificativaService = justificativaService;
    }

    @GetMapping("{id}")
    Optional<Justificativa> getById(@PathVariable Long id) {
        return justificativaService.getById(id);
    }

    @GetMapping
    List<Justificativa> list(String tipoJustificativa) {
        return justificativaService.list(tipoJustificativa);
    }

    @PostMapping
    Justificativa save (@RequestBody Justificativa justificativa){
        return justificativaService.save(justificativa);
    }

    @PutMapping("{id}")
    Justificativa update(@PathVariable Long id, @RequestBody Justificativa justificativa) {
        return justificativaService.update(id, justificativa);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id){
        justificativaService.delete(id);
    }


}
