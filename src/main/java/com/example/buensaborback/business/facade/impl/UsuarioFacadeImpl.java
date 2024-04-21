package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IUsuarioFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.UsuarioDto;
import com.example.buensaborback.domain.entities.Usuario;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacadeImpl extends BaseFacadeImpl<Usuario, UsuarioDto,Long> implements IUsuarioFacade {

    public UsuarioFacadeImpl(IBaseService<Usuario, Long> baseService, IBaseMapper<Usuario,UsuarioDto> baseMapper) {
        super(baseService, baseMapper);
    }

}
