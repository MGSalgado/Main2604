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
public class Olimpiatec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Alumno max = new Alumno("Miguel", "Salgado","A01410544","LDN","futbol","basketbol");
        Alumno min = new Alumno("Javier","Perez","A123","LDDS","futbol","basketbol");
        System.out.println(max.toString());
        System.out.println(min.toString()+"\n________________________________________");

     
        Evento futbol = new Evento ("futbol", "A123", "León");
        Evento basketbol = new Evento ("basketbol","B123","Marcela");
        Evento voleybol = new Evento ("voleybol","C123","Lorena");        
        

        Master control = new Master();
        control.addEvent(futbol);
        control.addEvent(basketbol);
        control.addEvent(voleybol);
        System.out.println(control.getEvents()+"\n____________________________________");
        
        futbol.addAlumno(min);
        futbol.addAlumno(max);
        System.out.println(futbol.getAlumnos()+"\n____________________________________");
        
        control.removeEvent(futbol);
        control.removeEvent("C123");
        System.out.println(control.getEvents());
    }
}
