package com.example.buensaborback.domain.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ArticuloManufacturadoDetalleDto extends BaseDto{

    private Integer cantidad;
    private ArticuloInsumoDto articuloInsumo;

}
