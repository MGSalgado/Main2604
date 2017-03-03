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
    private ArrayList<Branch> division;

    public Bank(ArrayList<Branch> division) {
                this.division = division;
    }
    
    public Bank(){
        this.division = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return division;
    }

    public void setBranch(ArrayList<Branch> division) {
        this.division = division;
    }
    
    public boolean addBranch(ArrayList<Customer> customer,String name){
        String tempName;
        Branch tempName = new Branch(customer,name);
        
    }
    
    public void addBranch(){
        
    }
    
    public int findBranch(String name){
            for(int i=0; i<division.size();i++){
            if(division.get(i).getBranchName().equals(name)){
                return i;
            }
        }return -1;
    
    }
    
}
