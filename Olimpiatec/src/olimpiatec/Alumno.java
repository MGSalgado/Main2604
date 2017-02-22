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
public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;
    private ArrayList<String> deportes;
    private final double limite;
    private String deporte1;
    private String deporte2;

    public Alumno(String nombre, String apellido, String matricula, String carrera, String deporte1, String deporte2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
        this.limite=2;
        this.deportes= new ArrayList<>(2);
        this.deporte1=deporte1;
        this.deporte2=deporte2;
    }
    public Alumno(String nombre, String apellido, String matricula, String carrera, ArrayList<Evento> deportes) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
        this.limite=2;
        this.deportes= new ArrayList<>(2);
        this.deporte1=null;
        this.deporte2=null;
    }
    
    public Alumno(String nombre, String apellido, String matricula, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
        this.limite=2;
        this.deportes= new ArrayList<>(2);
        this.deporte1="";
        this.deporte2="";
    }

    public Alumno() {
        this.limite = 2;
        this.nombre = "";
        this.apellido = "";
        this.matricula = "";
        this.carrera = "";
        this.deporte1="";
        this.deporte2="";
        this.deportes=new ArrayList<>(2);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getDeportes(){
        return deportes;
    }
    
    public void setDeportes (String deporte1, String deporte2){
        this.deportes.add(deporte1);
        this.deportes.add(deporte2);
        
    }
    
    
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", matricula=" + matricula + ", carrera=" + carrera + ", limite de deportes=" + limite + '}';
    }
    
    
}
