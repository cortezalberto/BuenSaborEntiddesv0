package com.example.buensaborback.business.mappers;

import com.example.buensaborback.domain.dtos.ClienteDto;
import com.example.buensaborback.domain.entities.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IClienteMapper extends IBaseMapper<Cliente, ClienteDto> {

    ClienteDto toDTO(Cliente source);
    Cliente toEntity(ClienteDto source);
    List<ClienteDto> toDTOsList(List<Cliente> source);
    List<Cliente> toEntitiesList(List<ClienteDto> source);
}
