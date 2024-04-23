package com.example.buensaborback.business.services.impl;

import com.example.buensaborback.business.services.IEmpresaService;
import com.example.buensaborback.business.services.ISucursalService;
import com.example.buensaborback.domain.entities.Empresa;
import com.example.buensaborback.domain.entities.Sucursal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa,Long> implements IEmpresaService {

    @Autowired
    private ISucursalService sucursalService;

    @Override
    public Empresa asignarSucursales(Long id, List<Long> sucursalesIds) {
        var empresa = getById(id);
        var sucursales = sucursalService.getAll().stream()
                .filter(sucursal -> sucursalesIds.contains(sucursal.getId()))
                .collect(Collectors.toList());
        sucursales.forEach(sucursal -> {
            empresa.getSucursales().add(sucursal);
        });

        return update(empresa);
    }

    @Override
    public Empresa removerSucursales(Long id, List<Long> sucursalesIds) {
        var empresa = getById(id);
        var tempSet = new HashSet<Sucursal>();
        empresa.getSucursales().forEach(sucursal -> {
            if(sucursalesIds.contains(sucursal.getId())){
                tempSet.add(sucursal);
            }
        });

//        if(true){
//            throw new RuntimeException("hola");
//        }
        empresa.getSucursales().removeAll(tempSet);
        return update(empresa);
    }
}
