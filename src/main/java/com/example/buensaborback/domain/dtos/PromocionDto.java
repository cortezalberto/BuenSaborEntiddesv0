package com.example.buensaborback.domain.dtos;

import com.example.buensaborback.domain.entities.enums.TipoPromocion;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PromocionDto extends BaseDto{
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime horaDesde;
    private LocalTime horaHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<ArticuloDto> articulos = new HashSet<>();
    private Set<ImagenDto> imagenes = new HashSet<>();
}
