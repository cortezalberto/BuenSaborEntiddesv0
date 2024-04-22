package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.SucursalDto;
import com.example.buensaborback.domain.entities.Sucursal;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ISucursalMapper extends IBaseMapper<Sucursal, SucursalDto> {

    SucursalDto toDTO(Sucursal source);
    Sucursal toEntity(SucursalDto source);
    List<SucursalDto> toDTOsList(List<Sucursal> source);
    List<Sucursal> toEntitiesList(List<SucursalDto> source);
}