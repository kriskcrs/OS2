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

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "apellido")
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(name = "dpi")
    private Integer dpi;


    @Column(name = "departamento_id_departamento")
    private Integer departamentoIddepartamento;

    @Column(name = "puesto_id_puesto")
    private Integer  puestoIdpuesto;

    @OneToMany(mappedBy = "empleadoIdEmpleado")
    private List<Usuario> usuarioList;

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public Long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getDpi() {
        return dpi;
    }

    public void setDpi(Integer dpi) {
        this.dpi = dpi;
    }

    public Integer getDepartamentoIddepartamento() {
        return departamentoIddepartamento;
    }

    public void setDepartamentoIddepartamento(Integer departamentoIddepartamento) {
        this.departamentoIddepartamento = departamentoIddepartamento;
    }

    public Integer getPuestoIdpuesto() {
        return puestoIdpuesto;
    }

    public void setPuestoIdpuesto(Integer puestoIdpuesto) {
        this.puestoIdpuesto = puestoIdpuesto;
    }


}

