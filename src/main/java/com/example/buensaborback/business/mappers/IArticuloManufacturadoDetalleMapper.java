package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.ArticuloManufacturadoDetalleDto;
import com.example.buensaborback.domain.entities.ArticuloManufacturadoDetalle;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IArticuloManufacturadoDetalleMapper extends IBaseMapper<ArticuloManufacturadoDetalle, ArticuloManufacturadoDetalleDto>{
    ArticuloManufacturadoDetalleDto toDTO(ArticuloManufacturadoDetalle source);
    ArticuloManufacturadoDetalle toEntity(ArticuloManufacturadoDetalleDto source);
    List<ArticuloManufacturadoDetalleDto> toDTOsList(List<ArticuloManufacturadoDetalle> source);
    List<ArticuloManufacturadoDetalle> toEntitiesList(List<ArticuloManufacturadoDetalleDto> source);
}

