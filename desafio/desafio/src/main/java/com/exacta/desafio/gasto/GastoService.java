package com.exacta.desafio.gasto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    //Busca lista de dados na tabela
    public List<Gasto> getAll(){
        return gastoRepository.findAll();
    }

    //Busca lista de dados através do id
    public GastoResponse getById(Long id){
        Optional<Gasto> gastoObjeto = gastoRepository.findById(id);
        Gasto gasto = gastoObjeto.orElseThrow(() -> new ResourceNotFoundExeception("Parâmetro não encontrado!"));
        return new GastoResponse(gasto);
    }

    //Cadastra o gasto
    public GastoResponse post(Gasto gasto){
       return new GastoResponse(gastoRepository.save(gasto));
    }
}
