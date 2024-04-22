package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.PedidoDto;
import com.example.buensaborback.domain.entities.Pedido;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;


@Mapper(componentModel = "spring")
public interface IPedidoMapper extends IBaseMapper<Pedido,PedidoDto> {

    PedidoDto toDTO(Pedido source);
    Pedido toEntity(PedidoDto source);
    List<PedidoDto> toDTOsList(List<Pedido> source);
    List<Pedido> toEntitiesList(List<PedidoDto> source);
}
