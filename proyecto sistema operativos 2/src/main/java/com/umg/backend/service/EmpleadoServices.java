package com.umg.backend.service;


import com.umg.backend.entity.Empleado;
import com.umg.backend.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("empleado")
@CrossOrigin
public class EmpleadoServices {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @GetMapping(path = "/consulta")
    private List<Empleado> consulta(){return empleadoRepository.findAll();}

}
