package com.umg.backend.service;


import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Usuario")
@CrossOrigin
public class UsuarioService {

    @Autowired
    usuarioRepository usuarioRepository;

    @GetMapping (path = "/consulta")
    private List<Usuario> consulta(){ return usuarioRepository.findAll();}
}
