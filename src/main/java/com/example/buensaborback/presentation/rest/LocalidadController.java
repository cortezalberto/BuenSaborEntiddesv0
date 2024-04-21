package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.LocalidadFacadeImpl;
import com.example.buensaborback.domain.dtos.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadDto,Long, LocalidadFacadeImpl> {
    public LocalidadController(LocalidadFacadeImpl facade) {
        super(facade);
    }
}
