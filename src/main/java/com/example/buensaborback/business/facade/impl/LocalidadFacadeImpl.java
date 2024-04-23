package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.ILocalidadFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.business.services.ILocalidadService;
import com.example.buensaborback.domain.dtos.LocalidadDto;
import com.example.buensaborback.domain.entities.Localidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadFacadeImpl extends BaseFacadeImpl<Localidad, LocalidadDto,Long> implements ILocalidadFacade {
    public LocalidadFacadeImpl(IBaseService<Localidad, Long> baseService, IBaseMapper<Localidad, LocalidadDto> baseMapper) {
        super(baseService, baseMapper);
    }
    @Autowired
    private ILocalidadService localidadService;

    @Override
    public LocalidadDto asignarProvincia(Long id, Long idProvincia) {
        return baseMapper.toDTO(localidadService.asignarProvincia(id,idProvincia));
    }

}
