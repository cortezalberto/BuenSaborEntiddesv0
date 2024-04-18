package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
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


    @ManyToMany
    //SE AGREGA EL JOIN TABLE PARA QUE JPA CREE LA TABLA INTERMEDIA EN UNA RELACION MANY TO MANY
    @JoinTable(name = "articuloManufacturado_articuloInsumo",
            joinColumns = @JoinColumn(name = "articuloManufacturado_id"),
            inverseJoinColumns = @JoinColumn(name = "articuloInsumo_id"))
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<ArticuloInsumo> articulosInsumos = new HashSet<>();

    @ManyToMany(mappedBy = "articuloManufacturados")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Promocion> estaEnPromociones = new HashSet<>();
}
