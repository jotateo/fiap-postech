package com.fiap58.pedidos.core.domain.dto;

import com.fiap58.pedidos.core.domain.entity.Cliente;
import jakarta.validation.constraints.NotBlank;

import java.time.Instant;

public record DadosEndecoDto(
        Long idEndereco,
        @NotBlank
        Cliente cliente,
        @NotBlank
        String rua,
        String numero,
        @NotBlank
        String cidade,
        @NotBlank
        String estado,
        String complemento,
        Instant criadoEm,
        Instant atualizadoEm,
        Instant deletadoEm) {
}
