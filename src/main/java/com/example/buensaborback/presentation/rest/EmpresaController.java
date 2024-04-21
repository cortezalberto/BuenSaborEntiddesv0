package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.EmpresaFacadeImpl;
import com.example.buensaborback.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaDto,Long, EmpresaFacadeImpl> {
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

}
