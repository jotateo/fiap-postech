package com.fiap58.pedidos.adapter.controller;

import com.fiap58.pedidos.core.domain.dto.DadosClienteDto;
import com.fiap58.pedidos.core.domain.entity.Cliente;
import com.fiap58.pedidos.core.domain.services.ClienteService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/list")
    private List<Cliente> listarClientes() {
        return service.listarClientes();
    }

    @GetMapping("/buscar/{cpf}")
    private Cliente buscarPorCpf(String cpf) { return service.buscarPorCpf(cpf); }

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<DadosClienteDto> inserirCliente(@RequestBody DadosClienteDto dados) {
        DadosClienteDto cliente = service.inserirCliente(dados);
        return ResponseEntity.ok(cliente);
    }

}
