package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.HistoricoPontoService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("historicoponto")
public class HistoricoPontoController {

        private final HistoricoPontoService historicoPontoService;

        public HistoricoPontoController(HistoricoPontoService historicoPontoService) {
        this.historicoPontoService = historicoPontoService;
        }


    @GetMapping("{id}")
        Optional<HistoricoPonto> getById(@PathVariable Long id) {
            return historicoPontoService.getById(id);
        }

        @GetMapping
        List<HistoricoPonto> list(LocalDateTime dataMarcacao) {
            return historicoPontoService.list(dataMarcacao);
        }

        @PostMapping
        HistoricoPonto save (@RequestBody HistoricoPonto historicoPonto){
            return historicoPontoService.save(historicoPonto);
        }

        @PutMapping("{id}")
        HistoricoPonto update(@PathVariable Long id, @RequestBody HistoricoPonto historicoPonto) {
            return historicoPontoService.update(id, historicoPonto);
        }

        @DeleteMapping("{id}")
        void delete(@PathVariable Long id){
            historicoPontoService.delete(id);
        }

    }

