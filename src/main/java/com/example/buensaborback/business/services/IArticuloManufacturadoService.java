package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.ArticuloManufacturado;

import java.util.List;

public interface IArticuloManufacturadoService extends IBaseService<ArticuloManufacturado,Long>{

    ArticuloManufacturado asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloManufacturado asignarUnidadMedida(Long id, Long unidadMedidaId);

}
