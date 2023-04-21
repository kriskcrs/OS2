package com.umg.backend.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "puesto_empleado")
public class PuestoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPuestoEmpleado;


    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fecha_salida")
    private Date fechaSalida;


    @Column(name = "puesto_id_puesto")
    private Integer puestoIdPuesto;

    @Column(name = "empleado_id_empleado")
    private Integer empleadoIdEmpleado;


    public Integer getIdPuestoEmpleado() {
        return idPuestoEmpleado;
    }

    public void setIdPuestoEmpleado(Integer idPuestoEmpleado) {
        this.idPuestoEmpleado = idPuestoEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Integer getPuestoIdPuesto() {
        return puestoIdPuesto;
    }

    public void setPuestoIdPuesto(Integer puestoIdPuesto) {
        this.puestoIdPuesto = puestoIdPuesto;
    }

    public Integer getEmpleadoIdEmpleado() {
        return empleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(Integer empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }
}
