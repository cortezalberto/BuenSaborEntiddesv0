package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.FacturaFacadeImpl;
import com.example.buensaborback.domain.dtos.FacturaDto;
import com.example.buensaborback.domain.entities.Factura;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/facturas")
public class FacturaController extends BaseControllerImpl<Factura, FacturaDto,Long, FacturaFacadeImpl>  {
    public FacturaController(FacturaFacadeImpl facade) {
        super(facade);
    }
}
