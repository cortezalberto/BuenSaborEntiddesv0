package com.example.buensaborback.business.services;

import com.example.buensaborback.domain.entities.Pedido;


public interface IPedidoService extends IBaseService<Pedido,Long>{
    Pedido create(Pedido entity, Long domicilioId, Long sucursalId);
}
