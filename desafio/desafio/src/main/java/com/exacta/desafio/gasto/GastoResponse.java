package com.exacta.desafio.gasto;

import java.time.LocalDateTime;

public class GastoResponse {

    private Long id;
    private String nomePessoa;
    private String descricao;
    private LocalDateTime dataHora;
    private Double valor;
    private String tags;

    //Constructors
    public GastoResponse() {
    }

    public GastoResponse(Long id, String nomePessoa, String descricao, LocalDateTime dataHora, Double valor, String tags) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.valor = valor;
        this.tags = tags;
    }

    public GastoResponse(Gasto gasto) {
        this.id = gasto.getId();
        this.nomePessoa = gasto.getNomePessoa();
        this.descricao = gasto.getDescricao();
        this.dataHora = gasto.getDataHora();
        this.valor = gasto.getValor();
        this.tags = gasto.getTags();
    }

    //Getters
    public Long getId() {
        return id;
    }

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
}
