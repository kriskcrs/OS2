package com.umg.backend.service;


import com.umg.backend.entity.Bitacora;
import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.UsuarioRepository;
import com.umg.backend.repository.BitacoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class LoginService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    BitacoraRepository bitacoraRepository;

    @PostMapping(path = "/login")
    private Usuario Authentication(@RequestBody Usuario usuario) throws IllegalAccessException {
        Date date = new Date();
        System.out.println(" Usuario recibido -> " +usuario.getUsuario() + " contraseña recibida -> " + usuario.getContrasena() );
        Optional<Usuario> usuariodata = usuarioRepository.findUsuarioByUsuarioAndContrasena(usuario.getUsuario(), usuario.getContrasena());

        if(usuariodata.isEmpty()){
            usuario.setUsuario("");
            usuario.setContrasena("");
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
            usuario.setIdusuario(usuariodata.get().getIdusuario());
            usuario.setContrasena(usuariodata.get().getContrasena());
            usuario.setEmpleadoIdEmpleado(usuariodata.get().getEmpleadoIdEmpleado());
        }

        Long con = 1L;

        con = bitacoraRepository.count();
        Bitacora bitacora = new Bitacora();
        bitacora.setIdBitacora(con+1L);
        bitacora.setEmpleado(usuario.getUsuario());
        bitacora.setEvento("login");
        bitacora.setFechaHora(date);

       bitacoraRepository.save(bitacora);




    return usuario;
    }
}
