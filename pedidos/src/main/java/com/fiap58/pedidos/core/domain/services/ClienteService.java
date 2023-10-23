package com.fiap58.pedidos.core.domain.services;

import com.fiap58.pedidos.adapter.repository.ClienteRepository;
import com.fiap58.pedidos.adapter.specifications.ClienteEspecification;
import com.fiap58.pedidos.core.domain.dto.DadosClienteDto;
import com.fiap58.pedidos.core.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> listarClientes() {
        return repository.findAll();
    }

    public DadosClienteDto inserirCliente(@RequestBody DadosClienteDto dados) {
        Cliente cliente = this.buscarPorCpf(dados.cpf());
        if (cliente != null){
            throw new IllegalArgumentException("Ja existe um cliente com o CPF informado.");
        }
        cliente = new Cliente(dados);
        repository.save(cliente);
        return dados;
    }

    public Cliente buscarPorCpf(String cpf){
        Specification<Cliente> clienteSpecification = Specification.where(ClienteEspecification.cpf(cpf));

        List<Cliente> clientes = repository.findAll(clienteSpecification);
        if(clientes.isEmpty()){
            throw new IllegalArgumentException("Nao foi encontrado nenhum cliente com o CPF informado.");
        }
        if(clientes.size()>1) {
            throw new IllegalArgumentException("Foi encontrado mais de um registro com o CPF informado. Favor reportar ao administrador.");
        }
        return clientes.get(0);
    }
}
