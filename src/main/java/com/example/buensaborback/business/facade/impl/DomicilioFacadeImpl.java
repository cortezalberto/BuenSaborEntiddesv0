package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IDomicilioFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import org.springframework.stereotype.Service;

@Service
public class DomicilioFacadeImpl extends BaseFacadeImpl<Domicilio, DomicilioDto,Long> implements IDomicilioFacade {
    public DomicilioFacadeImpl(IBaseService<Domicilio, Long> baseService, IBaseMapper<Domicilio, DomicilioDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
