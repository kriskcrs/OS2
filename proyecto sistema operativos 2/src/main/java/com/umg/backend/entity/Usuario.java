package com.umg.backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idusuario;

    @Column(name = "usuario")
    private String usuario;


    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "empleado_id_empleado")
    private Integer  empleadoIdEmpleado;

    public Long getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Long idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Integer getEmpleadoIdEmpleado() {
        return empleadoIdEmpleado;
    }

    public void setEmpleadoIdEmpleado(Integer empleadoIdEmpleado) {
        this.empleadoIdEmpleado = empleadoIdEmpleado;
    }
}
