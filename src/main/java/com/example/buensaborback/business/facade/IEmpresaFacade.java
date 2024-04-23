package com.example.buensaborback.business.facade;

import com.example.buensaborback.domain.dtos.EmpresaDto;

import java.util.List;

public interface IEmpresaFacade extends IBaseFacade<EmpresaDto,Long>{
    EmpresaDto asignarSucursales(Long id, List<Long> sucursalesIds);
    EmpresaDto removerSucursales(Long id, List<Long> sucursalesIds);
}
