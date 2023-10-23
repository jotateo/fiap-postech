package com.fiap58.pedidos.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiap58.pedidos.core.domain.dto.DadosClienteDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.List;


@Entity
@Table(name = "Clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CLIENTE")
    private Long idCliente;

    @Column(name = "CPF", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "CRIADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant criadoEm;

    @Column(name = "ATUALIZADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant atualizadoEm;

    @Column(name = "DELETADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant deletadoEm;

    @JsonIgnoreProperties("cliente")
    @OneToMany(mappedBy = "cliente")
    private List<Endereco> enderecos;

    @JsonIgnoreProperties("cliente")
    @OneToMany(mappedBy = "cliente")
    private List<Telefone> telefones;

    public Cliente(DadosClienteDto dados) {
        this.idCliente = dados.idCliente();
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.criadoEm = dados.criadoEm();
        this.atualizadoEm = dados.atualizadoEm();
        this.deletadoEm = dados.deletadoEm();
        this.enderecos = dados.enderecos();
        this.telefones = dados.telefones();
    }
}
