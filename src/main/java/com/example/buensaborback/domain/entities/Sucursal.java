package com.example.buensaborback.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Sucursal extends Base{

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    @OneToOne
    private Domicilio domicilio;

    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'sucursal_id' EN LA TABLA DE LOS MANY
    @OneToMany
    @JoinColumn(name = "sucursal_id")
    private Set<Categoria> categorias = new HashSet<>();

    //SE AGREGA EL JOIN COLUMN PARA QUE JPA NO CREE LA TABLA INTERMEDIA EN UNA RELACION ONE TO MANY
    //DE ESTA MANERA PONE EL FOREIGN KEY 'sucursal_id' EN LA TABLA DE LOS MANY
    @OneToMany
    @JoinColumn(name = "sucursal_id")
    private Set<Promocion> promociones = new HashSet<>();
}
