package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.PaisFacadeImpl;
import com.example.buensaborback.domain.dtos.PaisDto;
import com.example.buensaborback.domain.entities.Pais;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paises")
public class PaisController extends BaseControllerImpl<Pais,PaisDto,Long, PaisFacadeImpl>{
    public PaisController(PaisFacadeImpl facade) {
        super(facade);
    }

}
