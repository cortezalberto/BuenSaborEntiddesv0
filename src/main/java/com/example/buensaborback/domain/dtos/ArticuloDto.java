package com.example.buensaborback.domain.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloDto extends BaseDto{

    protected String denominacion;
    protected Double precioVenta;
    private Set<ImagenDto> imagenes = new HashSet<>();
    private UnidadMedidaDto unidadMedida;

}
