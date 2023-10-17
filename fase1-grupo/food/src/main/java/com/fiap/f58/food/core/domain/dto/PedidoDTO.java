package com.fiap.f58.food.core.domain.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class PedidoDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Long idPagamento;
    private List<ItemPedidoDTO> itens;
    private BigDecimal valor;
    private TipoPagamentoDTO tipoPagamento;
    private StatusPedidoEnum status;
    private ClienteDTO cliente;
    private StatusPagamentoEnum statusPagamento;
    private LocalDateTime dataSolicitacao;
    private LocalDateTime dataCancelamento;
    private LocalDateTime dataFinalizacao;
}
