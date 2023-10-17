package com.fiap.f58.food.core.domain.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TipoPagamentoDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nome;
}
