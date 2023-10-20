package com.fiap58.pedidos.core.domain.dto;

import java.util.List;

public record DadosPedidosDto (
        List<ProdutoCarrinho> carrinho
) {
}
