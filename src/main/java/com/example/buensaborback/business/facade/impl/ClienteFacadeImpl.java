package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IClienteFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.entities.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteFacadeImpl extends BaseFacadeImpl<Cliente, ClienteDto,Long> implements IClienteFacade {
    public ClienteFacadeImpl(IBaseService<Cliente, Long> baseService, IBaseMapper<Cliente, ClienteDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
