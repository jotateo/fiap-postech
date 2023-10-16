package com.fiap.f58.food.core.domain.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClienteDTO {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String email;

}
