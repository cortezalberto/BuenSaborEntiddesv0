package com.example.buensaborback.business.facade;

import com.example.buensaborback.domain.dtos.ProvinciaDto;

public interface IProvinciaFacade extends IBaseFacade<ProvinciaDto,Long>{

    ProvinciaDto asignarPais(Long id, Long idPais);

}
