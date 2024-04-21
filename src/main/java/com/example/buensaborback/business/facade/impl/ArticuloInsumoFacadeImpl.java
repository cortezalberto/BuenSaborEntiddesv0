package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IArticuloInsumoFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import org.springframework.stereotype.Service;

@Service
public class ArticuloInsumoFacadeImpl extends BaseFacadeImpl<ArticuloInsumo, ArticuloInsumoDto,Long> implements IArticuloInsumoFacade {
    public ArticuloInsumoFacadeImpl(IBaseService<ArticuloInsumo, Long> baseService, IBaseMapper<ArticuloInsumo, ArticuloInsumoDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
