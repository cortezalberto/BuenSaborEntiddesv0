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
public class ArticuloInsumo extends Base{

    private String denominacion;
    private Double precioCompra;
    private Double precioVenta;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;

    @ManyToOne
    private UnidadMedida unidadMedida;

    @OneToOne
    private Imagen imagen;

    @ManyToMany(mappedBy = "articulosInsumos")
    private Set<Promocion> estaEnPromociones = new HashSet<>();
}
