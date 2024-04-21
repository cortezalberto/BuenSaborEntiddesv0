package com.example.buensaborback.business.facade.impl;

import com.example.buensaborback.business.facade.IBaseFacade;
import com.example.buensaborback.business.mappers.IBaseMapper;
import com.example.buensaborback.business.services.IBaseService;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

public abstract class BaseFacadeImpl<E extends Base,D extends BaseDto,ID extends Serializable> implements IBaseFacade<D,ID> {

    protected IBaseService<E,ID> baseService;
    protected IBaseMapper<E,D> baseMapper;

    public BaseFacadeImpl(IBaseService<E,ID> baseService, IBaseMapper<E,D> baseMapper) {
        this.baseService = baseService;
        this.baseMapper = baseMapper;
    }

    public D createNew(D request){
        // Convierte a entidad
        var entityToCreate = baseMapper.toEntity(request);
        // Graba una entidad
        var entityCreated = baseService.create(entityToCreate);
        // convierte a Dto para devolver
        return baseMapper.toDTO(entityCreated);
    }

    public D getById(ID id){
        // Busca una entidad por id
        var entity = baseService.getById(id);
        // convierte la entidad a DTO
        return baseMapper.toDTO(entity);
    }

    public List<D> getAll(){
        // trae una lista de entidades
        var entities = baseService.getAll();
        //  devuelve una lista de DTO
        return entities
                .stream()
                .map(baseMapper::toDTO)
                .collect(Collectors.toList());
    }

    public void deleteById(ID id){
        var entity = baseService.getById(id);
        baseService.deleteById(id);
    }

    public D update(D request, ID id){
        var entityToUpdate = baseMapper.toEntity(request);
        var entityUpdated = baseService.update(entityToUpdate);
        return baseMapper.toDTO(entityUpdated);
    }

}
