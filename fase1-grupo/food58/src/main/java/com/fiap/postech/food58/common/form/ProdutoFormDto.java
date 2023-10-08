package com.fiap.postech.food58.common.form;

import com.fiap.postech.food58.common.list.CategoriaEnum;

import java.math.BigDecimal;

public class ProdutoFormDto {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private BigDecimal valor;

    public ProdutoFormDto() {
    }

    public ProdutoFormDto(String nome, String descricao, CategoriaEnum categoria, BigDecimal valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
