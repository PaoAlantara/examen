package com.examen.impuestos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Impuesto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImpuesto;
    
    private String nombre;
    private String periodo;
    private LocalDate fechaLimite;

    public Impuesto() {
    }

    public Integer getIdImpuesto() {
        return idImpuesto;
    }

    public void setIdImpuesto(Integer idImpuesto) {
        this.idImpuesto = idImpuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    
}