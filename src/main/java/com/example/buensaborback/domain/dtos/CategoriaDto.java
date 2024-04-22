package com.example.buensaborback.domain.dtos;

import lombok.*;

import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaDto extends BaseDto{
    private String denominacion;
    private Set<ArticuloDto> articulos = new HashSet<>();
    private Set<CategoriaDto> subCategorias = new HashSet<>();

}
