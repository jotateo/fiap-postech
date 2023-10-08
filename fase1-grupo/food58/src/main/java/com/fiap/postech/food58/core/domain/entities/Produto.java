package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private Categoria categoria;
    private BigDecimal valor;

    public Produto(Long id, String nome, String descricao, Categoria categoria, BigDecimal valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
