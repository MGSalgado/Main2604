/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olimpiatec;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class Master {
    private String clave;
    private Alumno alumnos;
    private ArrayList<Evento> events;

    public Master(String clave, Alumno alumnos, ArrayList<Evento> events) {
        this.clave = clave;
        this.alumnos = alumnos;
        this.events = new ArrayList<>();
    }
    
    public Master(String nombre, String apellido, String matricula, String carrera) {
        this.clave = "";
        this.alumnos = new Alumno(nombre, apellido, matricula, carrera);
        this.events = new ArrayList<>();
    }
    
    public Master(){
        this.clave= "";
        this.alumnos= new Alumno();
        this.events = new ArrayList<>();
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Alumno getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno alumnos) {
        this.alumnos = alumnos;
    }
    
    
}
