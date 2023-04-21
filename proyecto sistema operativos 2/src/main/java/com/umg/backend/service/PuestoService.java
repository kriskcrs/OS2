package com.umg.backend.service;



import com.umg.backend.entity.PuestoEmpleado;
import com.umg.backend.repository.PuestoEmpleadoRepository;
import com.umg.backend.repository.PuestoRepository;
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
    PuestoRepository puestoRepository;

    @Autowired
    PuestoEmpleadoRepository puestoEmpleadoRepository;


    @GetMapping(path = "/consulta")
    private List<Puesto> consulta(){return puestoRepository.findAll();}

    @GetMapping(path = "/consulta2")
    private List<PuestoEmpleado> consulta2(){

        return puestoEmpleadoRepository.findAll();}


}
