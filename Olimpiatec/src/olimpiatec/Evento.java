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
public class Evento {
    private String nombreEvento;
    private String clave;
    private String responsable;
    private ArrayList<Alumno> alumnosInscritos;

    public Evento(String nombreEvento, String clave, String responsable) {
        this.nombreEvento = nombreEvento;
        this.clave = clave;
        this.responsable = responsable;
        this.alumnosInscritos= new ArrayList<>();
    }
    
    public Evento(String nombreEvento, String clave, String responsable, ArrayList<Alumno> alumnosInscritos) {
        this.nombreEvento = nombreEvento;
        this.clave = clave;
        this.responsable = responsable;
        this.alumnosInscritos= alumnosInscritos;
    }
    
    

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
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
    
    public ArrayList<Alumno> getAlumnos(){
        return alumnosInscritos;
    }
    
    public void setAlumnosInscritos (ArrayList<Alumno> alumnosInscritos){
        this.alumnosInscritos=alumnosInscritos;
    }
    
    public boolean addAlumno (Alumno alumnosInscritos){
        if(!findMatricula(alumnosInscritos.getMatricula())){
            this.alumnosInscritos.add(alumnosInscritos);
            return true;
        }else{return false;}
            }
    
    public boolean addAlumno(String nombre, String apellido, String matricula, String carrera){
        if (!findMatricula(matricula)){
            this.alumnosInscritos.add(new Alumno(nombre,apellido,matricula,carrera));
            return true;
        }else{return false;}
    }
    
    public boolean removeAlumno(String matricula){
        if (findMatricula(matricula)){
            ListIterator it = this.alumnosInscritos.listIterator();
            while (it.hasNext()){
                Alumno temp = (Alumno) it.next();
                
                if(temp.getMatricula().equals(matricula)){
                    it.remove();
                    return true;
                }
            }return true;
        }else{return false;}
    }
    
        public boolean removeAlumno(Alumno alumnos){
            return removeAlumno (alumnos.getMatricula());
        }
        
    public boolean findMatricula(String matricula){
        if(!this.alumnosInscritos.isEmpty()){
            for(Alumno tempAlumno : alumnosInscritos){
                if(tempAlumno.getMatricula().equals(matricula)){
                    return true;
                }
            }
        }return false;
    }
    
        @Override
    public String toString() {
        return "Evento{" + "nombreEvento=" + nombreEvento +  ", clave=" + clave + ", responsable=" + responsable +  '}';
    }
    
    
}

