package com.umg.backend.repository;

import com.umg.backend.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departamentoRepository extends JpaRepository<Departamento, Long> {
}
