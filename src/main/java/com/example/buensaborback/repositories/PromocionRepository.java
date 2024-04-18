package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Promocion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PromocionRepository extends JpaRepository<Promocion,Long> {
}
