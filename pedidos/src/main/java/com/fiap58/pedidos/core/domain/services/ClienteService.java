package com.fiap58.pedidos.core.domain.services;

import com.fiap58.pedidos.adapter.repository.ClienteRepository;
import com.fiap58.pedidos.core.domain.dto.DadosClienteDto;
import com.fiap58.pedidos.core.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

//    public Cliente cadastrarCliente(Cliente cliente){
//        return repository.save(cliente);
//    }
//    public Cliente buscarClientePorId(Long id) {
//        return repository.findById(id).orElse(null);
//    }
    public List<DadosClienteDto> listarClientes() {
        return repository.findAll().stream().map(DadosClienteDto::new).toList();
    }

}
