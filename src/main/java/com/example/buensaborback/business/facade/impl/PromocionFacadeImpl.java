package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IPromocionFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.springframework.stereotype.Service;

@Service
public class PromocionFacadeImpl extends BaseFacadeImpl<Promocion, PromocionDto, Long> implements IPromocionFacade {
    public PromocionFacadeImpl(IBaseService<Promocion, Long> baseService, IBaseMapper<Promocion, PromocionDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
