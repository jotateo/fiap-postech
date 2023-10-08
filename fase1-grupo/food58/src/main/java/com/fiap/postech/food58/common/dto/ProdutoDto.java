package com.fiap.postech.food58.common.dto;

import com.fiap.postech.food58.app.domain.entities.Produto;
import com.fiap.postech.food58.common.list.CategoriaEnum;

import java.math.BigDecimal;

public class ProdutoDto {
    private String nome;
    private String descricao;
    private CategoriaEnum categoria;
    private BigDecimal valor;

    public ProdutoDto(Produto produto) {
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.categoria = produto.getCategoria();
        this.valor = produto.getValor();
    }

    public ProdutoDto() {
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
