package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IPaisFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import org.springframework.stereotype.Service;

@Service
public class PaisFacadeImpl extends BaseFacadeImpl<Pais, PaisDto,Long> implements IPaisFacade {

    public PaisFacadeImpl(IBaseService<Pais, Long> baseService, IBaseMapper<Pais, PaisDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
