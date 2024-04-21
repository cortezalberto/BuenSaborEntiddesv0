package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.PromocionFacadeImpl;
import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/promociones")
public class PromocionController extends BaseControllerImpl<Promocion, PromocionDto, Long, PromocionFacadeImpl> {
    public PromocionController(PromocionFacadeImpl facade) {
        super(facade);
    }
}
