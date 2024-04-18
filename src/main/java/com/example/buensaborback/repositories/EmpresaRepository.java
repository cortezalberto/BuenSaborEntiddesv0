package com.example.buensaborback.repositories;

import com.example.buensaborback.domain.entities.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa,Long> {
}
