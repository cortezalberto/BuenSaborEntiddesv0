package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura,Long> {
}
