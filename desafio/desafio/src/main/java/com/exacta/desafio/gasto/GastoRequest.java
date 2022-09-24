package com.exacta.desafio.gasto;

import java.time.LocalDateTime;
import java.util.Date;

public class GastoRequest {

    private String nomePessoa;
    private String descricao;
    private Double valor;
    private String tags;

    //Constructors
    public GastoRequest() {
    }

    public GastoRequest(String nomePessoa, String descricao, Double valor, String tags) {
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.valor = valor;
        this.tags = tags;
    }

    //Getters
    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }

    public String getTags() {
        return tags;
    }

    public Gasto toGasto(){
        return new Gasto(nomePessoa, descricao, valor, tags);
    }
}
