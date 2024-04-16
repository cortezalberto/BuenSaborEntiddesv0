package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class DetallePedido extends Base{

    private Integer cantidad;
    private Double subTotal;

    @OneToOne
    private ArticuloManufacturado articuloManufacturado;

    @OneToOne
    private ArticuloInsumo articuloInsumo;
}
