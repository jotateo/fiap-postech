package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class PedidoItem {
    private Long id;
    private BigDecimal valorTotal;
    private Integer quantidade;
    private Pedido pedido;
    private Produto produto;

    public PedidoItem(Long id, BigDecimal valorTotal, Integer quantidade, Pedido pedido, Produto produto) {
        this.id = id;
        this.valorTotal = valorTotal;
        this.quantidade = quantidade;
        this.pedido = pedido;
        this.produto = produto;
    }

    public void calcularValorTotal() {
        BigDecimal valorUnitario = this.produto.getValor();
        Integer quantidade = this.getQuantidade();
        if (valorUnitario == null) {
            valorUnitario = BigDecimal.ZERO;
        }
        if (quantidade == null) {
            quantidade= 0;
        }
        this.setValorTotal(valorUnitario.multiply(new BigDecimal(quantidade)));
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
}
