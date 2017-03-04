/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banamex;
import java.util.*;
/**
 *
 * @author Miguel
 */
public class BANAMEX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Double> lista = new ArrayList<>();  //Creacion de un ArrayList de double (solo tiene 1 jaja)
        double m =123;
        lista.add(m);
        
        System.out.println(lista);
        Customer cliente = new Customer("marco"); //creacion de objeto customer a partir del nombre
        System.out.println("Prueba uno: "+cliente.getTransactions());  //Muestra en pantalla las transacciones del cliente recien creado
        
        
        cliente.setTransactions(lista); //agregamos el arraylist a nuestro objeto customer con el metodo setTransaction
        cliente.setTransactions(2230);  //agregamos una segunda transaccion a nuestro objeto customer esta vez solamente con una cantidad double
        System.out.println("Prueba dos: "+cliente.getTransactions()); //mostramos las transacciones del cliente desde el metodo "getTransactions" de la clase customer

        
        Branch loans = new Branch("Loans"); //creacion de un objeto Branch
        loans.addCustomer(cliente); //agregamos un cliente al objeto "loans" que es del tipo branch
        System.out.println("Prueba tres: "+ loans.getCustomers()); //mostramos los customers de nuestro objeto branch
        
        
        Bank Banamex = new Bank();// creacion de un objeto tipo bank
        Banamex.addBranch("Debts"); //creacion de una branch a través de un objeto bank
        System.out.println("Prueba cuatro: "+Banamex.getBranches()); //mostramos en pantalla las branches de la clase Bank
        
        Banamex.getBranches().get(0).addCustomer(cliente);   //agregamosun cliente a traves de la ruta "bank>branch>newcustomer"
        Banamex.getBranches().get(0).addTransaction(cliente, 333); //agregamos una transaccion al cliente recien creado usando la misma ruta
        
        System.out.println("Prueba cinco: "+Banamex.getBranches().get(0).getCustomers()); //mostramos los clientes de la branch recien creada (los cambios ya aparecen)
        
        Banamex.addBranch("Loans");  //Creamos una nueva branch a traves de la clase bank
        int x= Banamex.findBranch("Loans"); //usando findBranch guardamos el index de la nueva branch en una variable int llamada x
        
        Banamex.addCustToBranch("Loans", cliente); //agregamos un cliente a la branch "loans"
        Banamex.getBranches().get(0).addTransaction(cliente, 123214); //agregamos una transaccion a nuestro cliente de la branch "loans"
        
        System.out.println("Prueba seis: "+Banamex.getBranches().get(0).getBranchName()); //mostramos nombre de la primer branch del ArrayList de branches que se encuentra en la clase bank
        System.out.println("Prueba siete: "+Banamex.getBranches().get(1).getBranchName());//mostramos nombre de la segunda branch del ArrayList de branches que se encuentra en la clase bank
        
        Banamex.getBranches().get(0).addCustomer("manuel",0);//agregamos un nuevo cliente a la primer branch del arreglo
        Banamex.getBranches().get(0).addTransaction("manuel", 555);    //agregamos una transaccion al cliente recien creado
        System.out.println("Prueba ocho: "+Banamex.getBranches().get(0).getCustomers());        //mostramos los clientes de la primer branch, "loans"
                
        System.out.println("Prueba nueve: "+Banamex.getBranches().get(1).getCustomers());    //mostramos los clientes de la segunda branch, "debts"        
        
        Banamex.getBranches().get(1).addCustomer("juan",21313);//agregamos un nuevo cliente a la segunda branch, "debts"
        System.out.println("Prueba diez: "+Banamex.getBranches().get(1).getCustomers());//mostramos los cientes de la segunda branch, "debts"
        
        System.out.println("Prueba once: ");
        Banamex.getBranches().get(0).listCustomers(); //mostramos una lista de los clientes de la primer branch
        

                }
    
}
