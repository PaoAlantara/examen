package com.examen.impuestos.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Declaracion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeclaracion;

    // Relaciones (Las flechas de tu diagrama)
    @ManyToOne
    @JoinColumn(name = "id_contribuyente")
    private Contribuyente contribuyente;

    @ManyToOne
    @JoinColumn(name = "id_impuesto")
    private Impuesto impuesto;

    private Double importe;
    private LocalDate fechaRegistro;
    private String observaciones;

    public Declaracion() {
    }

    public Integer getIdDeclaracion() {
        return idDeclaracion;
    }

    public void setIdDeclaracion(Integer idDeclaracion) {
        this.idDeclaracion = idDeclaracion;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    public Impuesto getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(Impuesto impuesto) {
        this.impuesto = impuesto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    
}
