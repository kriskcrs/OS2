package com.umg.backend.repository;

import com.umg.backend.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmpleadoRepository extends JpaRepository <Empleado, Integer> {


}
