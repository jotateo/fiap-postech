package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Getter
public class Pedido {
    private Long id;
    private Long idPagamento;
    private List<PedidoItem> itens;
    private BigDecimal valor;
    private TipoPagamento tipoPagamento;
    private StatusPedido status;
    private Cliente cliente;
    private StatusPagamento statusPagamento;
    private LocalDateTime dataPedido;
    private LocalDateTime dataConcluido;
    private LocalDateTime dataCancelado;

    public void calcularValor() {
        boolean seen = false;
        BigDecimal acc = null;
        for (PedidoItem i : itens) {
            BigDecimal total = i.getValorTotal();
            if (!seen) {
                seen = true;
                acc = total;
            } else {
                acc = acc.add(total);
            }
        }
        Optional<BigDecimal> valorTotal = seen ? Optional.of(acc) : Optional.empty();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public void setItens(List<PedidoItem> itens) {
        this.itens = itens;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setStatusPagamento(StatusPagamento statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public void setDataConcluido(LocalDateTime dataConcluido) {
        this.dataConcluido = dataConcluido;
    }

    public void setDataCancelado(LocalDateTime dataCancelado) {
        this.dataCancelado = dataCancelado;
    }
}
