package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ProvinciaFacadeImpl;
import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaDto,Long, ProvinciaFacadeImpl> {
    public ProvinciaController(ProvinciaFacadeImpl facade) {
        super(facade);
    }
}
