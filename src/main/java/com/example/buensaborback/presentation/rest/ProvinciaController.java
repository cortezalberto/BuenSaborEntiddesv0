package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ProvinciaFacadeImpl;
import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/provincias")
public class ProvinciaController extends BaseControllerImpl<Provincia, ProvinciaDto,Long, ProvinciaFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(ProvinciaController.class);
    public ProvinciaController(ProvinciaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarPais/{id}")
    public ResponseEntity<ProvinciaDto> asignarPais(@RequestParam Long paisId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR PAIS A PROVINCIA");
        return ResponseEntity.ok(facade.asignarPais(id,paisId));
    }

}
