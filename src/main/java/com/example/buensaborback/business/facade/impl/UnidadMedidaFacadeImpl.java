package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaFacadeImpl extends BaseFacadeImpl<UnidadMedida, UnidadMedidaDto,Long>{
    public UnidadMedidaFacadeImpl(IBaseService<UnidadMedida, Long> baseService, IBaseMapper<UnidadMedida, UnidadMedidaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
