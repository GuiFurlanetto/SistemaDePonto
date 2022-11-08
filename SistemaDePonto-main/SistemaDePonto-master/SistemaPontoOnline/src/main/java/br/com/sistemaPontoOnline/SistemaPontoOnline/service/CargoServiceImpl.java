package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.CargoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CargoServiceImpl implements CargoService {

    private final CargoRepository cargoRepository;

    @Override
    public List<Cargo> list(String descricaoCargo) {
        if (descricaoCargo == null) {
            return IterableUtils.toList(cargoRepository.findAll());
        }
        return IterableUtils.toList(cargoRepository.findAllByDescricaoCargoContains(descricaoCargo));
    }

    @Override
    public Cargo save(Cargo cargo) { return cargoRepository.save(cargo);}

    @Override
    public Optional<Cargo> getById(Long id) {
        return cargoRepository.findById(id);
    }

    @Override
    public Cargo update(Long id, Cargo cargo) {
        cargo.setId(id);
        return cargoRepository.save(cargo);
    }

    @Override
    public void delete(Long id) {
        cargoRepository.deleteById(id);
    }
}
