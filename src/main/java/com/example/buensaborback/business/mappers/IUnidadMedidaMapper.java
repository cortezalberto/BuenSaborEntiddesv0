package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.UnidadMedidaDto;
import com.example.buensaborback.domain.entities.UnidadMedida;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IUnidadMedidaMapper extends IBaseMapper<UnidadMedida, UnidadMedidaDto> {
    UnidadMedidaDto toDTO(UnidadMedida source);
    UnidadMedida toEntity(UnidadMedidaDto source);
    List<UnidadMedidaDto> toDTOsList(List<UnidadMedida> source);
    List<UnidadMedida> toEntitiesList(List<UnidadMedidaDto> source);
}
