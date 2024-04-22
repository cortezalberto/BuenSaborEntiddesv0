package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.EmpresaDto;
import com.example.buensaborback.domain.entities.Empresa;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IEmpresaMapper extends IBaseMapper<Empresa, EmpresaDto> {

    EmpresaDto toDTO(Empresa source);
    Empresa toEntity(EmpresaDto source);
    List<EmpresaDto> toDTOsList(List<Empresa> source);
    List<Empresa> toEntitiesList(List<EmpresaDto> source);
}
