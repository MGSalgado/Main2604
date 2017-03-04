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
public class Branch { //Atributos de la clase
    private ArrayList<Customer> customers;
    private String branchName;
    
    
    public Branch(String branchName){ //Constructor de la clase a partir de un nombre para la branch
        ArrayList<Customer> customers = new ArrayList<Customer>();
        this.customers=customers;
        this.branchName= branchName;
    }

    public Branch(ArrayList<Customer> customers, String branchName){ //constructor a partir de branchName y un ArrayList de customers
        this.customers=customers;
        this.branchName=branchName;
    }
    
    public String getBranchName(){ //getter de branchname
        return this.branchName;
    }
    
    public void setBranchName(String branchName){ //setter de branchname
        this.branchName=branchName;
    }
    public ArrayList<Customer> getCustomers() { //getter del arraylist de customer
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {//setter del arraylist de customers
        this.customers = customers;
    }
    
    
    public boolean addCustomer(String name, double amount){ //metodo para agregar un cliente a partir de nombre y cantidad de transaccion inicial
        return addCustomer(new Customer(name, amount));
    }
    
    public boolean addCustomer(Customer customer){ //metodo para agregar un customer, a partir de un objeto customer
        if(findCustomer(customer.getName())==-1){
            customers.add(customer);
            return true;
        }
        return false;
    }
    
    public int findCustomer(String name){ //metodo para encontrar si un customer se encuentra ya dentro de la branch
        for(int i=0; i<customers.size();i++){
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }return -1;
    }
    
    public boolean addTransaction(Customer name, double amount){ //metodo para agregar una transaccion de un cliente, requiere un objeto customer y el 
        if(findCustomer(name.getName())==-1){                     //amount de la transaccion
            System.out.println("That client is not on this branch");
            return false;
        }else{
            name.setTransactions(amount);
         return true;
        }
    }
    
    public boolean addTransaction(String name, double amount){// metodo para agregar una transaccion de un cliente, requiere del nombre del cliente
        if(findCustomer(name)==-1){                                 //y el amount de la transaccion
            System.out.println("That client is not on this branch");
            return false;
        }else{
            for(int i=0; i<customers.size();i++){
                if(customers.get(i).getName().equals(name)){
                    customers.get(i).setTransactions(amount);
                    return true;
                }
            }return false;
        }
    }
    
    public void listCustomers(){  //metodo para mostrar los clientes dentro de la branch a manera de lista
        for(Customer tempCustomer : customers){
            System.out.println(tempCustomer.toString());
        }
    }
    @Override
    public String toString(){ //metodo para mostrar el contenido de la branch, los muestra en una sola fila
        return branchName + customers.toString();
    }
}