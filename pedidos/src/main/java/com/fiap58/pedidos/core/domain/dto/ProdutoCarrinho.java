package com.fiap58.pedidos.core.domain.dto;

import com.fiap58.pedidos.core.domain.entity.Pedido;
import com.fiap58.pedidos.core.domain.entity.PedidoProduto;

public record ProdutoCarrinho(
        String nome,
        int quantidade,
        String observacao
) {
    public ProdutoCarrinho(PedidoProduto pedidoProduto){
        this(pedidoProduto.getProduto().getNome(),
                pedidoProduto.getQuantidade(),
                pedidoProduto.getObservacao());
    }
}
