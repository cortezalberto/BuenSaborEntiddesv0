package com.example.buensaborback.business.facade;

import com.example.buensaborback.domain.dtos.LocalidadDto;

public interface ILocalidadFacade extends IBaseFacade<LocalidadDto,Long>{
    LocalidadDto asignarProvincia(Long id, Long idProvincia);
}
