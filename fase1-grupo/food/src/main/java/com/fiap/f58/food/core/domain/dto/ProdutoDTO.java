package com.fiap.f58.food.core.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProdutoDTO {
    private Long id;
    private String nome;
    private CategoriaDTO categoria;
    private BigDecimal valor;
    private String descricao;
}
