package com.fiap58.pedidos.core.domain.dto;

public record ProdutoCarrinho(
        Long idProduto,
        int quantidade,
        String observacao
) {
}
