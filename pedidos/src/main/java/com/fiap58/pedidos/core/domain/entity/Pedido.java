package com.fiap58.pedidos.core.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Pedidos")
@Getter
@Setter
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PEDIDO")
    private Long idPedido;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE")
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<PedidoProduto> produtos;

    @Column(name = "DATA_PEDIDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataPedido;

    @Column(name = "DATA_FINALIZADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFinalizado;

    public Pedido(Long idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.dataPedido = new Date();
    }
}
