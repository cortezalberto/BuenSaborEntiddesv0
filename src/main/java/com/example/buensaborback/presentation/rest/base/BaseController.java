package com.example.buensaborback.presentation.rest.base;

import com.example.buensaborback.domain.dtos.BaseDto;

import java.io.Serializable;
import java.util.List;

public interface BaseController <D extends BaseDto, ID extends Serializable>{
    D getById(ID id);
    List<D> getAll();
    D create(D entity);
    D edit(D entity, ID id);
    void deleteById(ID id);
}

