package Entidades;

import java.time.LocalDate;

public class Bomberos {
    
    private int id_bombero;
    private String dni;
    private String nombre_ape;
    private LocalDate fecha_nac;
    private String celular;
    private Brigada codBrigada;
    private boolean estado;
//AGREGAR
    public Bomberos() {
    }

    public Bomberos(String dni, String nombre_ape, LocalDate fecha_nac, String celular, Brigada codBrigada, boolean estado) {
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public Bomberos(int id_bombero, String dni, String nombre_ape, LocalDate fecha_nac, String celular, Brigada codBrigada, boolean estado) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }
    
    
   

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bomberos{" + "id_bombero=" + id_bombero + ", dni=" + dni + ", nombre_ape=" + nombre_ape + ", fecha_nac=" + fecha_nac + ", celular=" + celular + ", codBrigada=" + codBrigada + ", estado=" + estado + '}';
    }
    
}
