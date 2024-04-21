package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.ICategoriaFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaFacadeImpl extends BaseFacadeImpl<Categoria, CategoriaDto,Long> implements ICategoriaFacade {
    public CategoriaFacadeImpl(IBaseService<Categoria, Long> baseService, IBaseMapper<Categoria, CategoriaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
