package com.fiap58.pedidos.adapter.controller;

import com.fiap58.pedidos.core.domain.dto.DadosClienteDto;
import com.fiap58.pedidos.core.domain.dto.DadosProdutoDto;
import com.fiap58.pedidos.core.domain.entity.Cliente;
import com.fiap58.pedidos.core.domain.services.ClienteService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

//    @PostMapping
//    public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
//        Cliente novoCliente = service.cadastrarCliente(cliente);
//        return ResponseEntity.status(HttpStatus.CREATED).body(novoCliente);
//    }

    @GetMapping("/list")
    public ResponseEntity<List<DadosClienteDto>> listarClientes(){
        List<DadosClienteDto> clientes = service.listarClientes();
        return ResponseEntity.ok(clientes);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Cliente> buscarCliente(@PathVariable Long id) {
//        Cliente cliente = service.buscarClientePorId(id);
//        if (cliente != null){
//            return ResponseEntity.ok(cliente);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

}
