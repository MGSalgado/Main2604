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
public class Customer {
     private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name){
        this.name=name;
        ArrayList<Double> transactions= new ArrayList<>();
       this.transactions=transactions;
    }

    public Customer(String name, double amount){
        this.name = name;
        ArrayList<Double>transactions=new ArrayList<>();
        this.transactions=transactions;
        this.transactions.add(amount);
    }
    public Customer(String name, ArrayList<Double> transactions) {
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) {
        this.transactions = transactions;
    }
    
    public void setTransactions(double amount){
        this.transactions.add(amount);
    }
    
    @Override
    public String toString(){
        return this.name+ transactions.toString();
    }
}

