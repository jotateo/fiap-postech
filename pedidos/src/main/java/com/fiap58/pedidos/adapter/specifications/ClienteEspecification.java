package com.fiap58.pedidos.adapter.specifications;

import com.fiap58.pedidos.core.domain.entity.Cliente;
import org.springframework.data.jpa.domain.Specification;

public class ClienteEspecification {
    public static Specification<Cliente> idCliente(Long idCliente) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("idCliente"),idCliente));
    }
    public static Specification<Cliente> cpf(String cpf) {
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("cpf"),cpf));
    }
}
