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
    private String matricula;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Evento> events;

    public Master(String clave, ArrayList<Alumno> alumnos, ArrayList<Evento> events) {
        this.clave = clave;
        this.matricula= null;
        this.alumnos = new ArrayList<>();
        this.events = new ArrayList<>();
    }
    
    
    public Master(){
        this.clave= null;
        this.matricula=null;
        this.alumnos= new ArrayList<>();
        this.events = new ArrayList<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList <Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    
    public ArrayList<Evento> getEvents(){
        return events;
    }
    public void setEvents(ArrayList<Evento> events){
        this.events=events;
    }
    
    
        
    public boolean addEvent (Evento events){
        if(!findClave(events.getClave())){
            this.events.add(events);
            return true;
        }else{return false;}
    }
    
    public boolean addEvent(String nombreEvento, String clave, String responsable){
        if (!findClave(clave)){
            this.events.add(new Evento(nombreEvento, clave, responsable) );
            return true;
        }else{return false;
    }}
    
    public boolean removeEvent(String clave){
        if (findClave(clave)){
            ListIterator it = this.events.listIterator();
            while (it.hasNext()){
                Evento temp = (Evento) it.next();
                
                if(temp.getClave().equals(clave)){
                    it.remove();
                    return true;
                }
            }return true;
        }else{return false;}
    }

    public boolean removeEvent (Evento events){
        return removeEvent (events.getClave());
    }
    public boolean findClave(String clave){
        if(!this.events.isEmpty()){
            for (Evento tempEvent : events){
                if(tempEvent.getClave().equals(clave)){
                    return true;
                }
            } 
        }return false;
    }
    
    
    
    }

