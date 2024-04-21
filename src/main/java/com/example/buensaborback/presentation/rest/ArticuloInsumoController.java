package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ArticuloInsumoFacadeImpl;
import com.example.buensaborback.domain.dtos.ArticuloInsumoDto;
import com.example.buensaborback.domain.entities.ArticuloInsumo;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articulosInsumos")
public class ArticuloInsumoController extends BaseControllerImpl<ArticuloInsumo, ArticuloInsumoDto,Long, ArticuloInsumoFacadeImpl> {
    public ArticuloInsumoController(ArticuloInsumoFacadeImpl facade) {
        super(facade);
    }
}
