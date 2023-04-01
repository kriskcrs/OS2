package com.umg.backend.service;


import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class LoginService {

    @Autowired
    usuarioRepository usuarioRepository;

    @PostMapping(path = "/login")
    private Usuario Authentication(@RequestBody Usuario usuario) throws IllegalAccessException {

        System.out.println(" Usuario recibdo -> " +usuario.getUsuario() + " contraseña recibida -> " + usuario.getPassword() );
        Optional<Usuario> usuariodata = usuarioRepository.findUsuarioByUsuarioAndPassword(usuario.getUsuario(), usuario.getPassword());

        if(usuariodata.isEmpty()){
            usuario.setUsuario("");
            usuario.setPassword("");
        }
        else{
            Usuario usuarioEncontrado = usuariodata.get();
            for (Field campo : Usuario.class.getDeclaredFields()) {
                campo.setAccessible(true); // Permite acceder a campos privados
                Object valorCampo = campo.get(usuarioEncontrado);
                System.out.println(campo.getName() + ": " + valorCampo);
                campo.setAccessible(false); // Restablece el acceso a campos privados
            }
            usuario.setUsuario(usuariodata.get().getUsuario());
            usuario.setIdUsuario(usuariodata.get().getIdUsuario());
            usuario.setPassword(usuariodata.get().getPassword());
            usuario.setEmpleadoIdEmpleado(usuariodata.get().getEmpleadoIdEmpleado());
        }

    return usuario;
    }
}
