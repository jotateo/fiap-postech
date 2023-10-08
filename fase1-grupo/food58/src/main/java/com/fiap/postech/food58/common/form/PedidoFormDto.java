package com.fiap.postech.food58.common.form;

import com.fiap.postech.food58.app.domain.entities.Cliente;
import com.fiap.postech.food58.app.domain.entities.Produto;

import java.util.List;

public class PedidoFormDto {
    private List<Produto> produtoList;
    private Cliente cliente;

    public List<Produto> getProdutoList() {
        return produtoList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setProdutoList(List<Produto> produtoList) {
        this.produtoList = produtoList;
    }
}
