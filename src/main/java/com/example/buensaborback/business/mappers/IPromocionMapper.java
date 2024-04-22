package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.PromocionDto;
import com.example.buensaborback.domain.entities.Promocion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IPromocionMapper extends IBaseMapper<Promocion, PromocionDto> {

    PromocionDto toDTO(Promocion source);
    Promocion toEntity(PromocionDto source);
    List<PromocionDto> toDTOsList(List<Promocion> source);
    List<Promocion> toEntitiesList(List<PromocionDto> source);
}
