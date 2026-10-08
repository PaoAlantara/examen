package com.examen.impuestos.model;

import jakarta.persistence.*;

@Entity
public class Contribuyente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idContribuyente;
    
    private String nombre;
    private String apPaterno;
    private String apMaterno;
    private String curp;
    private String telefono;
    private String correo;

    public Contribuyente() {
    }

    public Integer getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   
}