package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.PedidoFacadeImpl;
import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.entities.Pedido;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedidos")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoDto,Long, PedidoFacadeImpl> {
    public PedidoController(PedidoFacadeImpl facade) {
        super(facade);
    }


}
