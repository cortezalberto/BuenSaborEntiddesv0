package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IImagenFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.ImagenDto;
import com.example.buensaborback.domain.entities.Imagen;
import org.springframework.stereotype.Service;

@Service
public class ImagenFacadeImpl extends BaseFacadeImpl<Imagen, ImagenDto,Long> implements IImagenFacade {
    public ImagenFacadeImpl(IBaseService<Imagen, Long> baseService, IBaseMapper<Imagen, ImagenDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
