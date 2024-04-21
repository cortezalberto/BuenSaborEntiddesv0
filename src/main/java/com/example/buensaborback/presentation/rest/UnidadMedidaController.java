package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.UnidadMedidaFacadeImpl;
import com.example.buensaborback.domain.dtos.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unidadesMedidas")
public class UnidadMedidaController extends BaseControllerImpl<UnidadMedida, UnidadMedidaDto,Long, UnidadMedidaFacadeImpl> {
    public UnidadMedidaController(UnidadMedidaFacadeImpl facade) {
        super(facade);
    }
}
