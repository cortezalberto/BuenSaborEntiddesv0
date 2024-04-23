package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.Localidad;

public interface ILocalidadService extends IBaseService<Localidad,Long>{
    Localidad asignarProvincia(Long id, Long idProvincia);
}
