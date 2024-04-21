package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.CategoriaDto;
import com.example.buensaborback.domain.entities.Categoria;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoriaMapper extends IBaseMapper<Categoria, CategoriaDto> {

    @Mapping(target = "sucursales", ignore = true)
    @Mapping(target = "articulos", ignore = true)
    CategoriaDto toDTO(Categoria source);
    Categoria toEntity(CategoriaDto source);
    List<CategoriaDto> toDTOsList(List<Categoria> source);
    List<Categoria> toEntitiesList(List<CategoriaDto> source);
}
