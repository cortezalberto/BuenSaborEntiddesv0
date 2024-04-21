package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IFacturaFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.entities.Factura;
import org.springframework.stereotype.Service;

@Service
public class FacturaFacadeImpl extends BaseFacadeImpl<Factura, FacturaDto,Long> implements IFacturaFacade {
    public FacturaFacadeImpl(IBaseService<Factura, Long> baseService, IBaseMapper<Factura, FacturaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
