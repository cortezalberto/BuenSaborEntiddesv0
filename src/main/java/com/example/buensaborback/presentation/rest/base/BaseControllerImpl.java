package com.example.buensaborback.presentation.rest.base;

import com.example.buensaborback.business.facade.impl.BaseFacadeImpl;
import com.example.buensaborback.domain.dtos.BaseDto;
import com.example.buensaborback.domain.entities.Base;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

public abstract class BaseControllerImpl<E extends Base,D extends BaseDto, ID extends Serializable, F extends BaseFacadeImpl<E,D,ID>> implements BaseController<D,ID>  {

    private static final Logger logger = LoggerFactory.getLogger(BaseControllerImpl.class);
    protected F facade;
    public BaseControllerImpl(F facade){
        this.facade = facade;
    }

    @GetMapping("/{id}")
    public D getById(@PathVariable ID id){
        logger.info("INICIO GET BY ID {}",id);
        return facade.getById(id);
    }

    @GetMapping
    public List<D> getAll() {
        logger.info("INICIO GET ALL");
        return facade.getAll();
    }

    @PostMapping()
    public D create(@RequestBody D entity){
        logger.info("INICIO CREATE {}",entity.getClass());
        return facade.createNew(entity);
    }

    @PutMapping("/{id}")
    public D edit(@RequestBody D entity, @PathVariable ID id){
        logger.info("INICIO EDIT {}",entity.getClass());
        return facade.update(entity, id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable ID id){
        logger.info("INICIO DELETE BY ID");
        facade.deleteById(id);
    }

}
