package com.umg.backend.repository;


import com.umg.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findUsuarioByUsuarioAndContrasena(String usuario, String contrasena);
}
