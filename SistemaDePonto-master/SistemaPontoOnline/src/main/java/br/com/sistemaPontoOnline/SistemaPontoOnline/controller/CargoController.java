package br.com.sistemaPontoOnline.SistemaPontoOnline.controller;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.service.CargoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("cargos")
public class CargoController {

    private final CargoService cargoService;

    public CargoController(CargoService cargoService) {
        this.cargoService = cargoService;
    }

    @GetMapping("{id}")
    Optional<Cargo> getById(@PathVariable Long id) {
        return cargoService.getById(id);
    }

    @GetMapping
    List<Cargo> list(String descricaoCargo) {
        return cargoService.list(descricaoCargo);
    }

    @PostMapping
    Cargo save (@RequestBody Cargo cargo){
        return cargoService.save(cargo);
    }

    @PutMapping("{id}")
    Cargo update(@PathVariable Long id, @RequestBody Cargo cargo) {
        return cargoService.update(id, cargo);
    }

    @DeleteMapping("{id}")
    void delete(@PathVariable Long id){
        cargoService.delete(id);
    }

}
