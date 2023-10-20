package com.fiap58.pedidos.core.domain.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Categorias")
@Getter
@Setter
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CATEGORIA")
    private Long idCategoria;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos;

}
