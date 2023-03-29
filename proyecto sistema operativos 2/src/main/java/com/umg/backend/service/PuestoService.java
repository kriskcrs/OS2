package com.umg.backend.service;



import com.umg.backend.repository.puestoRepository;
import com.umg.backend.entity.Puesto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("puesto")
@CrossOrigin
public class PuestoService {

    @Autowired
    puestoRepository puestoRepository;

    @GetMapping(path = "/consulta")
    private List<Puesto> consulta(){return puestoRepository.findAll();}
}
