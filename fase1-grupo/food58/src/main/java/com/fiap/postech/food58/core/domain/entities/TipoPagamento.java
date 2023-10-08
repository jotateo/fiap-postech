package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

@Getter
public class TipoPagamento {
    private Long id;
    private String nome;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
