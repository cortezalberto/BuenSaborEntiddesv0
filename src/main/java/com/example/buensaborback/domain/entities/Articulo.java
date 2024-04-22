package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
@Setter
@SuperBuilder
public class Articulo extends Base {

    protected String denominacion;
    protected Double precioVenta;

    @OneToMany
    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'cliente_id' EN LA TABLA DE LOS MANY
    @JoinColumn(name = "articulo_id")
    //SE AGREGA EL BUILDER.DEFAULT PARA QUE BUILDER NO SOBREESCRIBA LA INICIALIZACION DE LA LISTA
    @Builder.Default
    private Set<Imagen> imagenes = new HashSet<>();

    @ManyToOne
    private UnidadMedida unidadMedida;

    public Articulo(String denominacion, Double precioVenta, UnidadMedida unidadMedida){
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
        this.unidadMedida = unidadMedida;
    }
}
