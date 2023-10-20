package com.fiap58.pedidos.core.domain.services;

import com.fiap58.pedidos.adapter.repository.PedidoRepository;
import com.fiap58.pedidos.core.domain.dto.DadosPedidosDto;
import com.fiap58.pedidos.core.domain.dto.DadosPedidosEntrada;
import com.fiap58.pedidos.core.domain.entity.Pedido;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public DadosPedidosDto inserirPedidoFila(DadosPedidosEntrada dto) {
        Pedido pedido = new Pedido(null, dto.cliente());
        Pedido pedidoCriado = repository.save(pedido);

        return null;
    }
//    this.idPedido = idPedido;
//        this.cliente = cliente;
//        this.produtos = produtos;
//        this.quantidade = quantidade;
//        this.precoVenda = precoVenda;
//        this.observacao = observacao;
//        this.dataPedido = new Date();
}
