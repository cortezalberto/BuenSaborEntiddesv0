package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IArticuloManufacturadoDetalleFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDetalleDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoDetalleFacadeImpl extends BaseFacadeImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,Long> implements IArticuloManufacturadoDetalleFacade {
    public ArticuloManufacturadoDetalleFacadeImpl(IBaseService<ArticuloManufacturadoDetalle, Long> baseService, IBaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
