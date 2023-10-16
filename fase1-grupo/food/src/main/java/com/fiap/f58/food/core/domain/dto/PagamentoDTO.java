package com.fiap.f58.food.core.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
public class PagamentoDTO {
    private Long id;
    private BigDecimal valor;
    private LocalDateTime dataPagamento;
}
