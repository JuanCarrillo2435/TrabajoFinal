package Entidades;

import java.time.LocalDate;

public class Siniestro {
    
    private int codigo;
    private String tipo;
    private LocalDate fecha_siniestro;
    private int coord_X;
    private int coord_Y;
    private String detalle;
    private LocalDate fecha_resol;
    private int puntuacion;
    private int codBrigada;

    public Siniestro() {
    }

    public Siniestro(String tipo, LocalDate fecha_siniestro, int coord_X, int coord_Y, String detalle, LocalDate fecha_resol, int puntuacion, int codBrigada) {
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalle = detalle;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public Siniestro(int codigo, String tipo, LocalDate fecha_siniestro, int coord_X, int coord_Y, String detalle, LocalDate fecha_resol, int puntuacion, int codBrigada) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.fecha_siniestro = fecha_siniestro;
        this.coord_X = coord_X;
        this.coord_Y = coord_Y;
        this.detalle = detalle;
        this.fecha_resol = fecha_resol;
        this.puntuacion = puntuacion;
        this.codBrigada = codBrigada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFecha_siniestro() {
        return fecha_siniestro;
    }

    public void setFecha_siniestro(LocalDate fecha_siniestro) {
        this.fecha_siniestro = fecha_siniestro;
    }

    public int getCoord_X() {
        return coord_X;
    }

    public void setCoord_X(int coord_X) {
        this.coord_X = coord_X;
    }

    public int getCoord_Y() {
        return coord_Y;
    }

    public void setCoord_Y(int coord_Y) {
        this.coord_Y = coord_Y;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public LocalDate getFecha_resol() {
        return fecha_resol;
    }

    public void setFecha_resol(LocalDate fecha_resol) {
        this.fecha_resol = fecha_resol;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }
    
    
    
}
