package com.fiap.f58.food.core.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ItemPedidoDTO {
    private Long id;
    private BigDecimal valorTotal;
    private Integer quantidade;
    private PedidoDTO pedido;
    private ProdutoDTO produto;
    public void calculaValorTotal() {
        BigDecimal valorUnitario = this.produto.getValor();
        Integer quantidade = this.getQuantidade();
        if (valorUnitario ==null) {
            valorUnitario = BigDecimal.ZERO;
        }
        if (quantidade ==null) {
            quantidade = 0;
        }
        this.setValorTotal(valorUnitario.multiply(new BigDecimal(quantidade)));
    }
}
