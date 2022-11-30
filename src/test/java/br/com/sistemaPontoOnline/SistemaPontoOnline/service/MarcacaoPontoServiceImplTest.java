package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.MarcacaoPontoRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class MarcacaoPontoServiceImplTest {


    @Mock
    private MarcacaoPontoRepository marcacaoPontoRepository;

    @InjectMocks
    private MarcacaoPontoServiceImpl marcacaoPontoServiceImpl;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void  testeListarTodasMarcacoes() {

        MarcacaoPonto marcacaoPonto = new MarcacaoPonto();
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());


        List<MarcacaoPonto> mockListar = new ArrayList<>();
        mockListar.add(marcacaoPonto);

        Mockito.when(marcacaoPontoRepository.findAll()).thenReturn(mockListar);
        List<MarcacaoPonto> listar = marcacaoPontoServiceImpl.list();

        Assertions.assertNotNull(listar);

    }

    @Test
    public void testeSalvarMarcacao(){


        Funcionario funcionario = new Funcionario();
        funcionario.setId(8L);
        MarcacaoPonto marcacaoPonto = new MarcacaoPonto();
        marcacaoPonto.setFuncionario(funcionario);
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        List<MarcacaoPonto> mockListar = new ArrayList<>();
        mockListar.add(marcacaoPonto);

        Mockito.when(marcacaoPontoRepository.findAll()).thenReturn(mockListar);
        Mockito.when(marcacaoPontoRepository.save(marcacaoPonto)).thenReturn(marcacaoPonto);
        MarcacaoPonto salvarMarcacao = marcacaoPontoServiceImpl.save(marcacaoPonto);

        Assertions.assertNotNull(salvarMarcacao);
        Assertions.assertEquals(salvarMarcacao, marcacaoPonto);

    }

    @Test
    public void  testeListarPorId() {

        Funcionario funcionario = new Funcionario();
        funcionario.setId(8L);

        MarcacaoPonto marcacaoPonto = new MarcacaoPonto();
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        marcacaoPonto.setFuncionario(funcionario);


        List<MarcacaoPonto> mockListar = new ArrayList<>();
        mockListar.add(marcacaoPonto);

        Mockito.when(marcacaoPontoRepository.findIdByIdFuncionario(8L)).thenReturn(mockListar);
        List<MarcacaoPonto> listar = marcacaoPontoServiceImpl.listFuncionario(8L);

        Assertions.assertEquals(listar.size(),1);

    }

}
