package com.umg.backend.service;

import com.umg.backend.entity.Empleado;
import com.umg.backend.entity.Persona;
import com.umg.backend.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("persona")
@CrossOrigin
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @GetMapping(path = "/consulta/{id}")
    private Optional<Persona> consulta(@PathVariable("id") Integer id){
        return personaRepository.findById(id);}
}
