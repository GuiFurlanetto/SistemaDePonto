package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Departamento;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.DepartamentoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor <<<  não consegui descobrir pq ta dando erro(Gui)
public class DepartamentoServiceImpl implements DepartamentoService {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoServiceImpl(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }


    @Override
    public List<Departamento> list(String nomeDepartamento) {
        return IterableUtils.toList(departamentoRepository.findAll());
    }

    @Override
    public Departamento save(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Optional<Departamento> getById(Long id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public Departamento update(Long id, Departamento departamento) {
        departamento.setId(id);
        return departamentoRepository.save(departamento);
    }

    @Override
    public void delete(Long id) {
        departamentoRepository.deleteById(id);
    }
}
