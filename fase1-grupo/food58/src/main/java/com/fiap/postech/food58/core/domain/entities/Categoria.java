package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

@Getter
public class Categoria {
    private Long id;
    private String nome;

    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
