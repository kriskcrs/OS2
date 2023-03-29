package com.umg.backend.repository;


import com.umg.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {
}
