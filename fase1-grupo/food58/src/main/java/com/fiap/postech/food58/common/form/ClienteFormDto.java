package com.fiap.postech.food58.common.form;

public class ClienteFormDto {
    private String nome;
    private int idade;
    private String endereco;
    private String documento;

    public ClienteFormDto(String nome, int idade, String endereco, String documento) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDocumento() {
        return documento;
    }
}
