package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IPedidoFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.entities.Pedido;
import org.springframework.stereotype.Service;

@Service
public class PedidoFacadeImpl extends BaseFacadeImpl<Pedido,PedidoDto,Long> implements IPedidoFacade {

    public PedidoFacadeImpl(IBaseService<Pedido, Long> baseService, IBaseMapper<Pedido,PedidoDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
