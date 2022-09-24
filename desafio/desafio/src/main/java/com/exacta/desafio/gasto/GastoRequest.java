package com.exacta.desafio.gasto;

import java.time.LocalDateTime;

public class GastoRequest {

    private String nomePessoa;
    private String descricao;
    private LocalDateTime dataHora;
    private Double valor;
    private String tags;

    //Constructors
    public GastoRequest() {
    }

    public GastoRequest(String nomePessoa, String descricao, LocalDateTime dataHora, Double valor, String tags) {
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.dataHora = dataHora;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public String getTags() {
        return tags;
    }

    public Gasto toGasto(){
        return new Gasto(nomePessoa, descricao, dataHora, valor, tags);
    }
}
