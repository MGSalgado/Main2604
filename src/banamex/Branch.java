/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banamex;
import java.util.*;
/**
 *
 * @author Alumno
 */
public class Branch {
    private ArrayList<Customer> customers;
    
    public Branch(){
        ArrayList<Customer> customer = new ArrayList<Customer>();
    }
    
    public boolean addCustomer(String name, double amount){
        return addCustomer(new Customer(name, amount));
    }
    
    public boolean addCustomer(Customer customer){
        if(findCustomer(customer.getName())==-1){
            customers.add(customer);
            return true;
        }
        return false;
    }
    
    public int findCustomer(String name){
        for(int i=0; i<customers.size();i++){
            if(customers.get(i).getName().equals(name)){
                return i;
            }
        }return -1;
    }
}
