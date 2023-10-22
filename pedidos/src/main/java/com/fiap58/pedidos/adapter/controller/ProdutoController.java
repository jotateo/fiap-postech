package com.fiap58.pedidos.adapter.controller;

import com.fiap58.pedidos.core.domain.dto.DadosProdutoDto;
import com.fiap58.pedidos.core.domain.entity.Pedido;
import com.fiap58.pedidos.core.domain.entity.Produto;
import com.fiap58.pedidos.core.domain.services.ProdutoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping("/list")
    public List<Produto> listarProdutos(){
        return service.listarProdutos();
    }

    @GetMapping("/buscaPorCat/{nomeCategoria}")
    public List<Produto> listarProdutosPorCategoria(@PathVariable String nomeCategoria) {
        return service.buscarProdutoPorCategoria(nomeCategoria);
    }

    @PostMapping("/inserir")
    @Transactional
    public ResponseEntity<DadosProdutoDto> incluirProduto(@RequestBody @Valid DadosProdutoDto dto) {

        DadosProdutoDto dadosProdutoDto = service.inserirProduto(dto);
        return ResponseEntity.ok(dadosProdutoDto);
    }

    @PatchMapping("/{id}")
    @Transactional
    public void atualizarProduto(@PathVariable Long id, @RequestBody @Valid DadosProdutoDto dto) {

        service.updateProduto(id, dto);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteProduto(@PathVariable Long id) {

        service.deleteProduto(id);
    }



}
