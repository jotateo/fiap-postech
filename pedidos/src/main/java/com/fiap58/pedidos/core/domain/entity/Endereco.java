package com.fiap58.pedidos.core.domain.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fiap58.pedidos.core.domain.dto.DadosEndecoDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "Enderecos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Long idEndereco;
    @JsonIgnoreProperties("endereco")
    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    @Column(name = "RUA", nullable = false, length = 200)
    private String rua;

    @Column(name = "NUMERO", nullable = false, length = 10)
    private String numero;

    @Column(name = "CIDADE", nullable = false, length = 20)
    private String cidade;

    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Column(name = "COMPLEMENTO", nullable = false, length = 20)
    private String complemento;

    @Column(name = "CRIADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant criadoEm;

    @Column(name = "ATUALIZADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant atualizadoEm;

    @Column(name = "DELETADO_EM")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant deletadoEm;

    public Endereco(DadosEndecoDto dados) {
        this.idEndereco = dados.idEndereco();
        this.cliente = dados.cliente();
        this.rua = dados.rua();
        this.numero = dados.numero();
        this.cidade = dados.cidade();
        this.estado = dados.estado();
        this.complemento = dados.complemento();
        this.criadoEm = dados.criadoEm();
        this.atualizadoEm = dados.atualizadoEm();
        this.deletadoEm = dados.deletadoEm();
    }
}
