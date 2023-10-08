package com.fiap.postech.food58.app.domain.entities;

import com.fiap.postech.food58.common.form.PedidoFormDto;
import com.fiap.postech.food58.common.list.StatusPedidoEnum;

import java.time.LocalDateTime;
import java.util.List;

public class Pedido {
    private LocalDateTime dataPedido;
    private List<Produto> produtos;
    private Cliente cliente;
    private StatusPedidoEnum statusPedidoEnum;

    public Pedido() {
    }

    public Pedido(PedidoFormDto pedidoFormDto) {
        this.dataPedido = LocalDateTime.now();
        this.produtos = pedidoFormDto.getProdutoList();
        if (pedidoFormDto.getCliente().getDocumento() == null) {
            this.cliente = new Cliente();
        } else {
            this.cliente = pedidoFormDto.getCliente();
        }

    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public StatusPedidoEnum getStatusPedidoEnum() {
        return statusPedidoEnum;
    }
}
