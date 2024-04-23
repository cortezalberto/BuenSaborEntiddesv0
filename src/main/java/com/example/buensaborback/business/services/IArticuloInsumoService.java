package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.ArticuloInsumo;

import java.util.List;

public interface IArticuloInsumoService extends IBaseService<ArticuloInsumo,Long>{

    ArticuloInsumo asignarImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo removerImagenes(Long id, List<Long> imagenesIds);
    ArticuloInsumo asignarUnidadMedida(Long id, Long unidadMedidaId);
}
