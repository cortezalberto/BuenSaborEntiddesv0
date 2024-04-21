package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.CategoriaFacadeImpl;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl> {
    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }
}
