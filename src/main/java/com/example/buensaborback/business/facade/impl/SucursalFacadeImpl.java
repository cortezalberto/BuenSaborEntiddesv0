package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.ISucursalFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.springframework.stereotype.Service;

@Service
public class SucursalFacadeImpl extends BaseFacadeImpl<Sucursal, SucursalDto,Long> implements ISucursalFacade {
    public SucursalFacadeImpl(IBaseService<Sucursal, Long> baseService, IBaseMapper<Sucursal, SucursalDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
