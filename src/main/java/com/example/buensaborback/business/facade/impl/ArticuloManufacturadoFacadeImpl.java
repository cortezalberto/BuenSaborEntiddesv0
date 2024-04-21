package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IArticuloManufacturadoFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoFacadeImpl extends BaseFacadeImpl<ArticuloManufacturado, ArticuloManufacturadoDto,Long> implements IArticuloManufacturadoFacade {
    public ArticuloManufacturadoFacadeImpl(IBaseService<ArticuloManufacturado, Long> baseService, IBaseMapper<ArticuloManufacturado, ArticuloManufacturadoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
