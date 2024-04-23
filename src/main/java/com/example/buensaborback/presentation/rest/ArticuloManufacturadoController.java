package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.ArticuloManufacturadoFacadeImpl;
import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDto;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturado;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/articulosManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoDto,Long, ArticuloManufacturadoFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(ArticuloManufacturadoController.class);
    public ArticuloManufacturadoController(ArticuloManufacturadoFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarImagenes/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> asignarImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.asignarImagenes(id,imagenesIds));
    }

    @PutMapping("/removerImagenes/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> removerImagenes(@RequestParam List<Long> imagenesIds, @PathVariable Long id){
        logger.info("INICIO REMOVER IMAGENES A ARTICULO MANUFACTURADO");
        return ResponseEntity.ok(facade.removerImagenes(id,imagenesIds));
    }

    @PutMapping("/asignarUnidadMedida/{id}")
    public ResponseEntity<ArticuloManufacturadoDto> asignarUnidadMedida(@RequestParam Long unidadMedidaId, @PathVariable Long id){
        logger.info("INICIO ASIGNAR DOMICILIO A SUCURSAL");
        return ResponseEntity.ok(facade.asignarUnidadMedida(id,unidadMedidaId));
    }

}
