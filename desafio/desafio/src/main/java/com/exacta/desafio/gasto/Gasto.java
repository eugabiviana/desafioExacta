package com.exacta.desafio.gasto;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="Gastos")
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePessoa;
    private String descricao;
    private LocalDateTime dataHora;
    private Double valor;
    private String tags;

    //Constructors

    public Gasto() {
    }

    public Gasto(String nomePessoa, String descricao, Double valor, String tags) {
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.valor = valor;
        this.tags = tags;
        this.dataHora = LocalDateTime.now();
    }

    public Gasto(Long id, String nomePessoa, String descricao, LocalDateTime dataHora, Double valor, String tags) {
        this.id = id;
        this.nomePessoa = nomePessoa;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.valor = valor;
        this.tags = tags;
    }

    //Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}
