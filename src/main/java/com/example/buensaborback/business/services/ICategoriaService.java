package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.Categoria;

import java.util.List;

public interface ICategoriaService extends IBaseService<Categoria,Long>{

    Categoria asignarSubcategorias(Long id, List<Long> subcategoriasIds);
    Categoria removerSubcategorias(Long id, List<Long> subcategoriasIds);
    Categoria asignarArticulos(Long id, List<Long> articulosIds);
    Categoria removerArticulos(Long id, List<Long> articulosIds);

}
