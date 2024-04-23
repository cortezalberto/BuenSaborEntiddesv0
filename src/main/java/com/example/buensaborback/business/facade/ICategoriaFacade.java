package com.example.buensaborback.business.facade;

import com.example.buensaborback.domain.dtos.CategoriaDto;

import java.util.List;

public interface ICategoriaFacade extends IBaseFacade<CategoriaDto,Long>{

    CategoriaDto asignarSubcategorias(Long id, List<Long> subcategoriasIds);
    CategoriaDto removerSubcategorias(Long id, List<Long> subcategoriasIds);
    CategoriaDto asignarArticulos(Long id, List<Long> articulosIds);
    CategoriaDto removerArticulos(Long id, List<Long> articulosIds);

}
