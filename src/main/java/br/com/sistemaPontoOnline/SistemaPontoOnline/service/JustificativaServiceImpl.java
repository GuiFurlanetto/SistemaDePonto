package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Justificativa;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.JustificativaRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JustificativaServiceImpl implements JustificativaService {


    private final JustificativaRepository justificativaRepository;

    @Override
    public List<Justificativa> list(String tipoJustificativa) {
        if (tipoJustificativa == null) {
            return IterableUtils.toList(justificativaRepository.findAll());
        }
        return IterableUtils.toList(justificativaRepository.findAllBytipoJustificativaContains(tipoJustificativa));
    }


    @Override
    public Optional<Justificativa> getById(Long id) {
        return justificativaRepository.findById(id);
    }

    @Override
    public Justificativa save(Justificativa justificativa) {
        return justificativaRepository.save(justificativa);
    }

    @Override
    public Justificativa update(Long id, Justificativa justificativa) {
        justificativa.setId(id);
        return justificativaRepository.save(justificativa);
    }

    @Override
    public void delete(Long id) {
        justificativaRepository.deleteById(id);

    }









}
