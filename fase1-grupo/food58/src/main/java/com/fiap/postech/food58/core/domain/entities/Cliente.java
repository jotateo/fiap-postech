package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

import java.util.Date;

@Getter
public class Cliente {
    private Long id;
    private String nome;
    private Date dataNascimento;
    private String email;
    private String cpf;

    public Cliente(Long id, String nome, Date dataNascimento, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
