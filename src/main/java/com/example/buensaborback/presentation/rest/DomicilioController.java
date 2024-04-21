package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.DomicilioFacadeImpl;
import com.example.buensaborback.domain.dtos.DomicilioDto;
import com.example.buensaborback.domain.entities.Domicilio;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioDto,Long, DomicilioFacadeImpl> {
    public DomicilioController(DomicilioFacadeImpl facade) {
        super(facade);
    }
}
