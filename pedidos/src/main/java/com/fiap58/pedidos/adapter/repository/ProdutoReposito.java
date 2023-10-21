package com.fiap58.pedidos.adapter.repository;

import com.fiap58.pedidos.core.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoReposito extends JpaRepository<Produto, Long> {
}
