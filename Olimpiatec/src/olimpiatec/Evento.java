/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;

/**
 *
 * @author Miguel
 */
public class Evento {
    private String nombreEvento;
    private char genero;
    private String clave;
    private String responsable;
    private final double limiteAlumnos;

    public Evento(double limiteAlumnos) {
        this.limiteAlumnos = limiteAlumnos;
        this.nombreEvento = "";
        this.genero = 'x';
        this.clave = "";
        this.responsable = "";
    }

    public Evento(String nombreEvento, char genero, String clave, String responsable, double limiteAlumnos) {
        this.nombreEvento = nombreEvento;
        this.genero = genero;
        this.clave = clave;
        this.responsable = responsable;
        this.limiteAlumnos = limiteAlumnos;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Evento{" + "nombreEvento=" + nombreEvento + ", genero=" + genero + ", clave=" + clave + ", responsable=" + responsable + ", limiteAlumnos=" + limiteAlumnos + '}';
    }
    
    
}

