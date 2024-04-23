package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IProvinciaFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.business.services.IProvinciaService;
import com.example.buensaborback.domain.dtos.ProvinciaDto;
import com.example.buensaborback.domain.entities.Provincia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProvinciaFacadeImpl extends BaseFacadeImpl<Provincia, ProvinciaDto,Long> implements IProvinciaFacade {
    public ProvinciaFacadeImpl(IBaseService<Provincia, Long> baseService, IBaseMapper<Provincia, ProvinciaDto> baseMapper) {
        super(baseService, baseMapper);
    }

    @Autowired
    private IProvinciaService provinciaService;

    @Override
    public ProvinciaDto asignarPais(Long id, Long idPais) {
        return baseMapper.toDTO(provinciaService.asignarPais(id,idPais));
    }

}
