package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.ICategoriaFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.business.services.ICategoriaService;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private ICategoriaService categoriaService;

    @Override
    public CategoriaDto asignarSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.asignarSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto removerSubcategorias(Long id, List<Long> subcategoriasIds) {
        return baseMapper.toDTO(categoriaService.removerSubcategorias(id,subcategoriasIds));
    }

    @Override
    public CategoriaDto asignarArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.asignarArticulos(id,articulosIds));
    }

    @Override
    public CategoriaDto removerArticulos(Long id, List<Long> articulosIds) {
        return baseMapper.toDTO(categoriaService.removerArticulos(id,articulosIds));
    }

}
