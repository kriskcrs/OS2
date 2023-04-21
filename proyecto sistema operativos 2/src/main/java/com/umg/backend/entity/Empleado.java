package com.umg.backend.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEmpleado;

    @Column(name = "persona_id_empleado")
    private Integer personaIdEmpelado;

    @OneToMany(mappedBy = "empleadoIdEmpleado")
    private List<PuestoEmpleado> puestoEmpleadoList;

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Integer getPersonaIdEmpelado() {
        return personaIdEmpelado;
    }

    public void setPersonaIdEmpelado(Integer personaIdEmpelado) {
        this.personaIdEmpelado = personaIdEmpelado;
    }

    public List<PuestoEmpleado> getPuestoEmpleadoList() {
        return puestoEmpleadoList;
    }

    public void setPuestoEmpleadoList(List<PuestoEmpleado> puestoEmpleadoList) {
        this.puestoEmpleadoList = puestoEmpleadoList;
    }
}

