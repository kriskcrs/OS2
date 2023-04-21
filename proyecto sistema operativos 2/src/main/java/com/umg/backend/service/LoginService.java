package com.umg.backend.service;


import com.umg.backend.entity.Bitacora;
import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.UsuarioRepository;
import com.umg.backend.repository.BitacoraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Field;
import java.util.Date;
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
        int con = 1;
        Bitacora bitacora = new Bitacora();
        con = (int) bitacoraRepository.count();
        System.out.println(" USUARIO RECIBIDO -> " +usuario.getUsuario() + " CONTRASEÑA RECIBIDO -> " + usuario.getContrasena() );
        Optional<Usuario> usuariodata = usuarioRepository.findUsuarioByUsuarioAndContrasena(usuario.getUsuario(), usuario.getContrasena());
        if(usuariodata.isEmpty()){
            System.out.println("NO SE PUDO HACER LOGIN NO EXISTE USUARIO ");
            usuario.setIdusuario(0);
            usuario.setUsuario(usuario.getUsuario());
            usuario.setContrasena("");
            usuario.setEmpleadoIdEmpleado(0);

            bitacora.setIdBitacora(con+1);
            bitacora.setEmpleado(usuario.getUsuario());
            bitacora.setEvento("login fallido");
            bitacora.setFechaHora(date);
            bitacoraRepository.save(bitacora);


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

            bitacora.setIdBitacora(con+1);
            bitacora.setEmpleado(usuario.getUsuario());
            bitacora.setEvento("login exitoso");
            System.out.println(date);
            bitacora.setFechaHora(date);
            bitacoraRepository.save(bitacora);
        }
    return usuario;
    }
}
