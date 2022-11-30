package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.exceptions.FuncionarioNotFound;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.FuncionarioRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository funcionarioRepository;

    @Override
    public List<Funcionario> list(Long codigoFuncional) {
        if (codigoFuncional == null) {
            return IterableUtils.toList(funcionarioRepository.findAll());
        }
        return IterableUtils.toList(funcionarioRepository.findAllByCodigoFuncional(codigoFuncional));
    }

    @Override
    public Funcionario getById(Long id) {
        return funcionarioRepository.findById(id).orElseThrow(FuncionarioNotFound::new);
    }

    @Override
    public Funcionario save(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public Funcionario update(Long id, Funcionario funcionario) {
        funcionario.setId(id);
        return funcionarioRepository.save(funcionario);
    }

    @Override
    public void delete(Long id) {
        funcionarioRepository.deleteById(id);

    }
}
