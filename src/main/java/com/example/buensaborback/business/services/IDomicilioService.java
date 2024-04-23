package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.Domicilio;

public interface IDomicilioService extends IBaseService<Domicilio,Long>{
    Domicilio asignarLocalidad(Long id, Long idLocalidad);
}
