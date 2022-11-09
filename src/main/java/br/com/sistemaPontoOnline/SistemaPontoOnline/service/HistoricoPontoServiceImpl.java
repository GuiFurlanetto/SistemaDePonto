package br.com.sistemaPontoOnline.SistemaPontoOnline.service;

import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.Cargo;
import br.com.sistemaPontoOnline.SistemaPontoOnline.domain.HistoricoPonto;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.CargoRepository;
import br.com.sistemaPontoOnline.SistemaPontoOnline.repository.HistoricoPontoRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HistoricoPontoServiceImpl implements HistoricoPontoService {

    private final HistoricoPontoRepository historicoPontoRepository;


    @Override
    public List<HistoricoPonto> list (LocalDateTime dataMarcacao){
        if (dataMarcacao == null) {
            return IterableUtils.toList(historicoPontoRepository.findAll());
        }
        return IterableUtils.toList(historicoPontoRepository.findAllBydataMarcacao(dataMarcacao));

    }

    @Override
    public HistoricoPonto save (HistoricoPonto historicoPonto){
        historicoPonto.setDataMarcacao(LocalDateTime.now());
        return historicoPontoRepository.save(historicoPonto);}

    @Override
    public Optional<HistoricoPonto> getById(Long id) {return historicoPontoRepository.findById(id);}


    @Override
    public HistoricoPonto update (Long id, HistoricoPonto historicoPonto){
        historicoPonto.setId(id);
        historicoPonto.setDataMarcacao(LocalDateTime.now());
        return historicoPontoRepository.save(historicoPonto);}

    @Override
    public void delete(Long id){historicoPontoRepository.deleteById(id);};

//buscar a ultima marcação e ver se o tipo é igual se for dar uma mensagem


}
