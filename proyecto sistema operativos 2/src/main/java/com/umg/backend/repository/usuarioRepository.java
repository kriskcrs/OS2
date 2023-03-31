package com.umg.backend.repository;


import com.umg.backend.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface usuarioRepository extends JpaRepository<Usuario, Long> {

    public Optional<Usuario> findUsuarioByUsuarioAndPassword(String usuario, String password);
}
