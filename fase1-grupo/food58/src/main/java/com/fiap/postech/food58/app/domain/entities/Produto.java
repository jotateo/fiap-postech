package com.fiap.postech.food58.app.domain.entities;

import com.fiap.postech.food58.common.form.ProdutoFormDto;
import com.fiap.postech.food58.common.list.CategoriaEnum;

import java.math.BigDecimal;

public class Produto {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private BigDecimal valor;

    public Produto() {
    }

    public Produto(ProdutoFormDto produtoFormDto) {
        this.nome = produtoFormDto.getNome();
        this.descricao = produtoFormDto.getDescricao();
        this.categoria = produtoFormDto.getCategoria();
        this.valor = produtoFormDto.getValor();
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public BigDecimal getValor() {
        return valor;
    }
}
