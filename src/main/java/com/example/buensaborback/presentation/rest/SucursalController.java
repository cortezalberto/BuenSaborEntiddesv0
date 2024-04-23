package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.SucursalFacadeImpl;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sucursales")
public class SucursalController extends BaseControllerImpl<Sucursal, SucursalDto,Long, SucursalFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(SucursalController.class);
    public SucursalController(SucursalFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarDomicilio/{id}")
    public ResponseEntity<SucursalDto> asignarDomicilio(@RequestParam Long domicilioId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarDocimilio(id,domicilioId));
    }

    @PutMapping("/asignarCategorias/{id}")
    public ResponseEntity<SucursalDto> asignarCategorias(@RequestParam List<Long> categoriasIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR CATEGORIAS A SUCURSAL");
        return ResponseEntity.ok(facade.asignarCategorias(id,categoriasIds));
    }

    @PutMapping("/removerCategorias/{id}")
    public ResponseEntity<SucursalDto> removerCategorias(@RequestParam List<Long> categoriasIds, @PathVariable Long id){
        logger.info("INICIO REMOVER CATEGORIAS A SUCURSAL");
        return ResponseEntity.ok(facade.removerCategorias(id,categoriasIds));
    }

    @PutMapping("/asignarPromociones/{id}")
    public ResponseEntity<SucursalDto> asignarPromociones(@RequestParam List<Long> promocionesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR PROMOCIONES A SUCURSAL");
        return ResponseEntity.ok(facade.asignarPromociones(id,promocionesIds));
    }

    @PutMapping("/removerPromociones/{id}")
    public ResponseEntity<SucursalDto> removerPromociones(@RequestParam List<Long> promocionesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER PROMOCIONES A SUCURSAL");
        return ResponseEntity.ok(facade.removerPromociones(id,promocionesIds));
    }

}
