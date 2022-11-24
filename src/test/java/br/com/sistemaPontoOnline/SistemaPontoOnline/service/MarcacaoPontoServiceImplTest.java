package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Funcionario;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.MarcacaoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.TipoMarcacao;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.MarcacaoPontoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.util.Assert;

import javax.persistence.*;
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



//    /**@Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    private Long id;
//    @ManyToOne
//    private Funcionario funcionario;
//    @Enumerated(EnumType.STRING)
//    private TipoMarcacao tipoMarcacao;
//    private LocalDateTime marcacaoPonto;
//     */


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

        MarcacaoPonto marcacaoPonto = new MarcacaoPonto();
        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
        marcacaoPontoRepository.save(marcacaoPonto);
        Assertions.assertNotNull(marcacaoPonto);

    }

//    @Test
//    public void  testeListarPorId() {
//        /// mudar  para listar por ID
//
//        MarcacaoPonto marcacaoPonto = new MarcacaoPonto();
//        marcacaoPonto.setMarcacaoPonto(LocalDateTime.now());
//
//
//        List<MarcacaoPonto> mockListar = new ArrayList<>();
//        mockListar.add(marcacaoPonto);
//
//        Mockito.when(marcacaoPontoRepository.findAll()).thenReturn(mockListar);
//        List<MarcacaoPonto> listar = marcacaoPontoServiceImpl.list();
//
//        Assertions.assertNotNull(listar);
//
//    }

//        //dado
//        //uma lista marcoes com seus atributos
//
//        List<MarcacaoPonto> listaDeMarcacoes =
//
//        //quando
//        //listar todas as marcacoes
//          marcacaoPontoServiceImpl
//        //assim
//        //comprove com não é nulo
//
//        public List<MarcacaoPonto> list(MarcacaoPonto marcacaoPonto) {
//            return IterableUtils.toList(marcacaoPontoRepository.findAll());
//
//        Assertions.assertNotNull(IterableUtils.toList(marcacaoPontoRepository.findAll()), "");
//
//    }


}
