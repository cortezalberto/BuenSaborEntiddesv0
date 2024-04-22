package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IEmpresaFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaFacadeImpl extends BaseFacadeImpl<Empresa, EmpresaDto,Long> implements IEmpresaFacade {
    public EmpresaFacadeImpl(IBaseService<Empresa, Long> baseService, IBaseMapper<Empresa, EmpresaDto> baseMapper) {
        super(baseService, baseMapper);
    }
}
