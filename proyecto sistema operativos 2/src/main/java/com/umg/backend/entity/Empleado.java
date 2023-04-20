package com.umg.backend.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmpleado;

    @Column(name = "persona_id_empleado")
    private String personaIdEmpelado;

    @OneToMany(mappedBy = "empleadoIdEmpleado")
    private List<PuestoEmpleado> puestoEmpleadoList;

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPersonaIdEmpelado() {
        return personaIdEmpelado;
    }

    public void setPersonaIdEmpelado(String personaIdEmpelado) {
        this.personaIdEmpelado = personaIdEmpelado;
    }

    public List<PuestoEmpleado> getPuestoEmpleadoList() {
        return puestoEmpleadoList;
    }

    public void setPuestoEmpleadoList(List<PuestoEmpleado> puestoEmpleadoList) {
        this.puestoEmpleadoList = puestoEmpleadoList;
    }
}

