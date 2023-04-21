package com.umg.backend.service;


import com.umg.backend.entity.Empleado;
import com.umg.backend.entity.Persona;
import com.umg.backend.entity.Usuario;
import com.umg.backend.repository.EmpleadoRepository;
import com.umg.backend.repository.PersonaRepository;
import com.umg.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuario")
@CrossOrigin
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    EmpleadoRepository empleadoRepository;

    @GetMapping (path = "/consulta")
    private List<Usuario> consulta() {
        return usuarioRepository.findAll();
    }


        @GetMapping (path = "/consulta/{us}")
        private Optional<Persona> consultaP(@PathVariable("us") String us){
            int idU=0;
           Optional<Usuario> usuario = usuarioRepository.findUsuarioByUsuario(us);
           Optional<Empleado> empleado = empleadoRepository.findById(usuario.get().getEmpleadoIdEmpleado());
           idU = empleado.get().getIdEmpleado();
            return personaRepository.findById(idU);
        }
}
