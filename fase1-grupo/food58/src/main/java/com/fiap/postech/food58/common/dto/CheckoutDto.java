package com.fiap.postech.food58.common.dto;

import com.fiap.postech.food58.app.domain.entities.Cliente;
import com.fiap.postech.food58.app.domain.entities.Produto;

import java.math.BigDecimal;
import java.util.List;

public class CheckoutDto {
    private List<Produto> produtoList;
    private Cliente cliente;
    private BigDecimal valorTotalPedido;

    public CheckoutDto(List<Produto> produtoList, Cliente cliente, BigDecimal valorTotalPedido) {
        this.produtoList = produtoList;
        this.cliente = cliente;
        this.valorTotalPedido = valorTotalPedido;
    }

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(BigDecimal valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }
}
