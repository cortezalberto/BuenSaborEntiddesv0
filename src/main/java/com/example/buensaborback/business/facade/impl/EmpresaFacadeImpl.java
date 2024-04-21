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

    @Override
    public EmpresaDto getById(Long id) {
        // Busca una entidad por id
        var entity = baseService.getById(id);
        // convierte la entidad a DTO
        var dto = baseMapper.toDTO(entity);
        entity.getSucursales().forEach(sucursal -> {
            var sucursalDto = new SucursalDto();
            sucursalDto.setNombre(sucursal.getNombre());
            sucursalDto.setId(sucursal.getId());
            sucursalDto.setHorarioApertura(sucursal.getHorarioApertura());
            sucursalDto.setHorarioCierre(sucursal.getHorarioCierre());
            dto.getSucursales().add(sucursalDto);
        });
        return dto;
    }

    @Override
    public List<EmpresaDto> getAll() {
        var entities = baseService.getAll();
        var entitiesDto = entities.stream()
                .map(baseMapper::toDTO)
                .collect(Collectors.toList());
        entities.forEach(empresa -> {
            empresa.getSucursales().forEach(sucursal -> {
                entitiesDto.forEach(empresaDto -> {
                    if (empresaDto.getId().equals(empresa.getId())){
                        var sucursalDto = new SucursalDto();
                        sucursalDto.setNombre(sucursal.getNombre());
                        sucursalDto.setId(sucursal.getId());
                        sucursalDto.setHorarioApertura(sucursal.getHorarioApertura());
                        sucursalDto.setHorarioCierre(sucursal.getHorarioCierre());
                        empresaDto.getSucursales().add(sucursalDto);
                    }
                });
            });
        });
        return entitiesDto;
    }
}
