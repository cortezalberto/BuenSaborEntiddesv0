package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ClienteFacadeImpl;
import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.entities.Cliente;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteDto,Long, ClienteFacadeImpl> {
    public ClienteController(ClienteFacadeImpl facade) {
        super(facade);
    }
}
