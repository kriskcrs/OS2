package com.umg.backend.service;


import com.umg.backend.entity.Departamento;
import com.umg.backend.repository.departamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Departamento")
@CrossOrigin
public class DepartamentoServices {

    @Autowired
    departamentoRepository departamentoRepository;

    @GetMapping(path = "/consulta")
    private List<Departamento> consulta(){return departamentoRepository.findAll();}

}
