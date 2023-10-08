package com.fiap.postech.food58.core.domain.entities;

import lombok.Getter;

@Getter
public class Pagamento {
    private Long id;
    private StatusPagamento status;

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
}
