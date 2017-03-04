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
public class Bank {
    private ArrayList<Branch> division; //atributo de la clase

    public Bank(ArrayList<Branch> division) { //constructor a partir de un ArrayList de Branch
                this.division = division;
    }
    
    public Bank(){ //Constructor sin argumentos
        this.division = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() { //Getter del Arraylist
        return division;
    }

    public void setBranch(ArrayList<Branch> division) {//setter del arraylist
        this.division = division;
    }
    
    public boolean addBranch (ArrayList<Customer> customer, String name){ //metodo para agregar una branch, requiere un ArrayList de customer, y el nombre de la branch
        if(findBranch(name)==-1){
            Branch tempName = new Branch(customer,name);
            division.add(tempName);
            return true;
                    }else{
            System.out.println("That branch already exists");
            return false;
        }
    }
    
    public boolean addBranch (String name){//metodo para crear una branch,requiere el nombre deseado para la branch
        if(findBranch(name)==-1){
            Branch tempName = new Branch (name);
            division.add(tempName);        
            return true;        
        }else{
            System.out.println("That branch already exists");
            return false;
        }
    }
    
    public boolean addCustToBranch(String branchName,Customer customer){//Metodo para agregar un cliente a una branch, requiere nombre de branch y objeto 
        for(int i=0; i<division.size();i++){                            //del tipo customer
            if(division.get(i).getBranchName().equals(branchName)){
                division.get(i).addCustomer(customer);
                return true;
            }
        }return false;
    }
    
    public boolean addCustToBranch(String branchName, String customerName, double amount){ //metodo para agregar un cliente a una branch
        for(int i=0; i<division.size();i++){                                            //requiere el nombre deseado parala branch, el nombre del ciente
            if(division.get(i).getBranchName().equals(branchName)){                         //y el amount con el que desea iniciar
                division.get(i).addCustomer(customerName,amount);
                return true;
            }
        }return false;
    }
    
    public boolean addTransToCustOfBranch (String branchName, String customerName, double amount){ //metodo para agregar una transaccion de un cliente
        if(findBranch(branchName)!=-1){                                                         //de una rama, requiere nombre de la branch, nombre del
            if(division.get(findBranch(branchName)).findCustomer(customerName)!=-1){                //cliente y el amount de la transaccion
                division.get(findBranch(branchName)).addTransaction(customerName,amount);
                return true;
            }
            System.out.println("Client does not exist");
            return false;
        }
        System.out.println("Branch does not exist");
        return false;
    }
    
    public int findBranch(String name){ //metodo para saber si una branch ya ha sido creada antes
        for(int i=0; i<division.size();i++){
            if(division.get(i).getBranchName().equals(name)){
                return i;
            }
        }return -1;
    }
}
