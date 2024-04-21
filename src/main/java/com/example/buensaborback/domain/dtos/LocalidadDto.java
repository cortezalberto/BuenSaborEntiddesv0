package com.example.buensaborback.domain.dtos;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LocalidadDto extends BaseDto{
    private String nombre;
    private ProvinciaDto provincia;
}
