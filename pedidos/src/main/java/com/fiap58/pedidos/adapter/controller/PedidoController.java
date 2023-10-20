package com.fiap58.pedidos.adapter.controller;

import com.fiap58.pedidos.core.domain.dto.DadosPedidosDto;
import com.fiap58.pedidos.core.domain.dto.DadosPedidosEntrada;
import com.fiap58.pedidos.core.domain.entity.Pedido;
import com.fiap58.pedidos.core.domain.services.PedidoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    @Transactional
    public ResponseEntity<DadosPedidosDto> incluirPedido(@RequestBody @Valid DadosPedidosEntrada dto){
        DadosPedidosDto dadosPedidosDto = service.inserirPedidoFila(dto);

        return ResponseEntity.ok(dadosPedidosDto);
    }
}

