package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ArticuloManufacturado extends Base{

    private String denominacion;
    private String descripcion;
    private Double precioVenta;
    private Integer tiempoEstimadoMinutos;

    @OneToOne
    private Imagen imagen;

    @ManyToOne
    private UnidadMedida unidadMedida;

    @ManyToMany(mappedBy = "articuloManufacturados")
    private Set<Promocion> estaEnPromociones = new HashSet<>();
}
