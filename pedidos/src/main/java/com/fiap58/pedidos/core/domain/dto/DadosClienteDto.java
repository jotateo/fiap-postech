package com.fiap58.pedidos.core.domain.dto;

import com.fiap58.pedidos.core.domain.entity.Cliente;
import com.fiap58.pedidos.core.domain.entity.Endereco;
import com.fiap58.pedidos.core.domain.entity.Telefone;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.time.Instant;
import java.util.List;

public record DadosClienteDto (
        Long idCliente,
        @NotBlank @Pattern(regexp = "\\d{11}")
        String cpf,
        @NotBlank
        String nome,
        Instant criadoEm,
        Instant atualizadoEm,
        Instant deletadoEm,
        List<Endereco> enderecos,
        List<Telefone> telefones
){

}
