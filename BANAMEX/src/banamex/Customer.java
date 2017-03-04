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
public class Customer { //atributos
     private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name){ //constructor a partir de nombre
        this.name=name;
        ArrayList<Double> transactions= new ArrayList<>();
       this.transactions=transactions;
    }

    public Customer(String name, double amount){ //Constructor a partir de nombre y cantidad de transacción
        this.name = name;
        ArrayList<Double>transactions=new ArrayList<>();
        this.transactions=transactions;
        this.transactions.add(amount);
    }
    public Customer(String name, ArrayList<Double> transactions) { //Constructor a partir de nombres y un ArrayList de transacciones
        this.name = name;
        this.transactions = transactions;
    }

    public String getName() { //Getter de nombre
        return name;
    }

    public void setName(String name) { //Setter de nombre
        this.name = name;
    }

    public ArrayList<Double> getTransactions() { //getter de transacciones
        return transactions;
    }

    public void setTransactions(ArrayList<Double> transactions) { //setter de transacciones(ArrayList)
        this.transactions = transactions;
    }
    
    public void setTransactions(double amount){ //setter de transaccion, podría ser un "add amount"
        this.transactions.add(amount);
    }
    
    @Override
    public String toString(){ //metodo para devolver valores del arrayList
        return this.name+ transactions.toString();
    }
}

