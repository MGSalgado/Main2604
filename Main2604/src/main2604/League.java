/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2604;

import java.util.ArrayList;

import java.util.Collections;
/**
 *
 * @author Alumno
 * @param <S>
 */
public class League<S extends Team> {
    String name;
    ArrayList<Team> lMembers = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addTeam(S t){
        if (lMembers.contains(t)){
            System.out.println(t.getName()+" team already in league");
            return false;
        }
        lMembers.add(t);
        System.out.println(t.getName()+" picked for league"+this.name);
        return true;
        }
    
    public void sortList (){
        Collections.sort(this.lMembers);
        for (Team i : lMembers) {
            System.out.print(i);
        
    }
    
}}
