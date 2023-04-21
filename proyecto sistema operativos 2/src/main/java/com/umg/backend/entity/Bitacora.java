package com.umg.backend.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "bitacora")
public class Bitacora {
    @Id
    @Column(name = "id_bitacora")
    private Integer idBitacora;


    @Column(name = "empleado")
    private String empleado;

    @Column(name = "fecha_hora")
    private Date fechaHora;

    @Column(name = "evento")
    private String evento;

    public Integer getIdBitacora() {
        return idBitacora;
    }

    public void setIdBitacora(Integer idBitacora) {
        this.idBitacora = idBitacora;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
