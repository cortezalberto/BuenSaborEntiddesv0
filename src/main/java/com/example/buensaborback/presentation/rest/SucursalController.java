package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.SucursalFacadeImpl;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }
}
