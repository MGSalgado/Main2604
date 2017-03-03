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
public class Branch {
    private ArrayList<Customer> customers;
    private String branchName;
    
    
    public Branch(String branchName){
        ArrayList<Customer> customers = new ArrayList<Customer>();
        this.customers=customers;
        this.branchName= branchName;
    }

    public Branch(ArrayList<Customer> customers, String branchName){
        this.customers=customers;
        this.branchName=branchName;
    }
    
    public String getBranchName(){
        return this.branchName;
    }
    
    public void setBranchName(String branchName){
        this.branchName=branchName;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
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
    
    public boolean addTransaction(Customer name, double amount){
        if(findCustomer(name.getName())==-1){
            System.out.println("That client is not on this branch");
            return false;
        }else{
            name.setTransactions(amount);
         return true;
        }
    }
}