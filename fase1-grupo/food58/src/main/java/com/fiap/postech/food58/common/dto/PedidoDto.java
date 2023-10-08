package com.fiap.postech.food58.common.dto;

import com.fiap.postech.food58.app.domain.entities.Cliente;
import com.fiap.postech.food58.app.domain.entities.Pedido;
import com.fiap.postech.food58.app.domain.entities.Produto;
import com.fiap.postech.food58.common.form.PedidoFormDto;

import java.time.LocalDateTime;
import java.util.List;

public class PedidoDto {
    private LocalDateTime dataPedido;
    private List<Produto> produtoList;
    private Cliente cliente;

    public PedidoDto(Pedido pedido){
        this.dataPedido = pedido.getDataPedido();
        this.produtoList = pedido.getProdutos();
        this.cliente = pedido.getCliente();
    }
    public PedidoDto(PedidoFormDto pedidoFormDto){
        this.cliente = pedidoFormDto.getCliente();
        this.produtoList = pedidoFormDto.getProdutoList();
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
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
}
