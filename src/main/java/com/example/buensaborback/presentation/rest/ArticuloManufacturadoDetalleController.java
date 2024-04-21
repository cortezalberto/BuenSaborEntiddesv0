package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ArticuloManufacturadoDetalleFacadeImpl;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDetalleDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("articulosManufacturadosDetalles")
public class ArticuloManufacturadoDetalleController extends BaseControllerImpl<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto,Long, ArticuloManufacturadoDetalleFacadeImpl> {
    public ArticuloManufacturadoDetalleController(ArticuloManufacturadoDetalleFacadeImpl facade) {
        super(facade);
    }
}
