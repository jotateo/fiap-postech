package com.fiap58.pedidos.core.domain.services;

import com.fiap58.pedidos.adapter.repository.CategoriaRepository;
import com.fiap58.pedidos.adapter.repository.ProdutoRepository;
import com.fiap58.pedidos.core.domain.dto.DadosProdutoDto;
import com.fiap58.pedidos.core.domain.entity.Categoria;
import com.fiap58.pedidos.core.domain.entity.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public DadosProdutoDto inserirProduto(DadosProdutoDto dto) {
        Produto produto = new Produto(dto.nome(), dto.descricao(), dto.precoAtual());
        var categoria = categoriaRepository.findById(dto.idCategoria()).get();
        produto.setCategoria(categoria);

        repository.save(produto);

        return dto;
    }

    public void deleteProduto(Long id) {
        repository.deleteById(id);
    }

    public Produto updateProduto(Long id, DadosProdutoDto dto) {
        // Por enquanto, so atualiza nome e preço.
        Produto produto = repository.getReferenceById(id);
        produto.setNome(dto.nome().isEmpty()? produto.getNome(): dto.nome());
        produto.setPrecoAtual(dto.precoAtual() == null ? produto.getPrecoAtual(): dto.precoAtual());

        repository.save(produto);

        return produto;
    }
}
