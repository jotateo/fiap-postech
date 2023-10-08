package com.fiap.postech.food58.adapter.gateway;

import com.fiap.postech.food58.core.domain.entities.Cliente;

public interface ClienteGateway {
    Cliente salvar(Cliente cliente);
    Cliente buscarPorCpf(Long cpf);
    Cliente buscarPorId(Long id);
    void excluir(Long clienteId);
    void atualizarDadosCliente(Long id, Cliente cliente);
}
