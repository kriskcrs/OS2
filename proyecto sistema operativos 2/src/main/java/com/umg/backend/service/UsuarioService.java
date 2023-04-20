package com.umg.backend.service;


import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("usuario")
@CrossOrigin
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping (path = "/consulta")
    private List<Usuario> consulta(){ return usuarioRepository.findAll();}
}
