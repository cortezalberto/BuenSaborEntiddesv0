package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.EmpresaFacadeImpl;
import com.example.buensaborback.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController extends BaseControllerImpl<Empresa, EmpresaDto,Long, EmpresaFacadeImpl> {
    private static final Logger logger = LoggerFactory.getLogger(EmpresaController.class);
    public EmpresaController(EmpresaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarSucursales/{id}")
    public ResponseEntity<EmpresaDto> asignarSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR SUCURSALES A EMPRESA");
        return ResponseEntity.ok(facade.asignarSucursales(id,sucursalesIds));
    }

    @PutMapping("/removerSucursales/{id}")
    public ResponseEntity<EmpresaDto> removerSucursales(@RequestParam List<Long> sucursalesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER SUCURSALES A EMPRESA");
        return ResponseEntity.ok(facade.removerSucursales(id,sucursalesIds));
    }
}
