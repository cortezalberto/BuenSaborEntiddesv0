package com.example.buensaborback.presentation.rest;

import com.example.buensaborback.business.facade.impl.CategoriaFacadeImpl;
import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import com.example.buensaborback.presentation.rest.base.BaseControllerImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController extends BaseControllerImpl<Categoria, CategoriaDto,Long, CategoriaFacadeImpl> {

    private static final Logger logger = LoggerFactory.getLogger(CategoriaController.class);
    public CategoriaController(CategoriaFacadeImpl facade) {
        super(facade);
    }

    @PutMapping("/asignarSubcategorias/{id}")
    public ResponseEntity<CategoriaDto> asignarSubcategorias(@RequestParam List<Long> subcategoriasIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR SUBCATEGORIAS A CATEGORIAS");
        return ResponseEntity.ok(facade.asignarSubcategorias(id,subcategoriasIds));
    }

    @PutMapping("/removerSubcategorias/{id}")
    public ResponseEntity<CategoriaDto> removerSubcategorias(@RequestParam List<Long> subcategoriasIds, @PathVariable Long id){
        logger.info("INICIO REMOVER SUBCATEGORIAS A CATEGORIAS");
        return ResponseEntity.ok(facade.removerSubcategorias(id,subcategoriasIds));
    }

    @PutMapping("/asignarArticulos/{id}")
    public ResponseEntity<CategoriaDto> asignarArticulos(@RequestParam List<Long> articulosIds, @PathVariable Long id){
        logger.info("INICIO ASIGNAR ARTICULOS A CATEGORIAS");
        return ResponseEntity.ok(facade.asignarArticulos(id,articulosIds));
    }

    @PutMapping("/removerArticulos/{id}")
    public ResponseEntity<CategoriaDto> removerArticulos(@RequestParam List<Long> articulosIds, @PathVariable Long id){
        logger.info("INICIO REMOVER ARTICULOS A CATEGORIAS");
        return ResponseEntity.ok(facade.removerArticulos(id,articulosIds));
    }

}
