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
        
        ArrayList<Double> lista = new ArrayList<>();
        double m =123;
        lista.add(m);
        
        System.out.println(lista);
        Customer cliente = new Customer("marco");
        System.out.println(cliente.getTransactions());
        
        
        cliente.setTransactions(lista);
        cliente.setTransactions(2230);
        System.out.println(cliente.getTransactions());
        cliente.setTransactions(1232);
        System.out.println(cliente.getTransactions());
        
        Branch loans = new Branch();
        loans.addCustomer(cliente);
        System.out.println(loans.getCustomers());
        
        loans.addTransaction(cliente, 2132);
        System.out.println(loans.getCustomers());
        
    }
    
}
