package Entidades;

import java.util.logging.Logger;

public class Brigada {
    
    private int codBrigada;
    private String nombre_br;
    private String especialidad;
    private boolean libre;
    private int nro_cuartel;
   //AGREGAR CUARTEL
    public Brigada() {
    }

    public Brigada(String nombre_br, String especialidad, boolean libre, int nro_cuartel) {
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public Brigada(int codBrigada, String nombre_br, String especialidad, boolean libre, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombre_br = nombre_br;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombre_br() {
        return nombre_br;
    }

    public void setNombre_br(String nombre_br) {
        this.nombre_br = nombre_br;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombre_br=" + nombre_br + ", especialidad=" + especialidad + ", libre=" + libre + ", nro_cuartel=" + nro_cuartel + '}';
    }
    
    
    
    
}
