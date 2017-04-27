/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2604;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Alumno
 * @param <T>
 */
public class Team<T extends Player> implements Comparable<Team<T>> {
    String name;
    int win=0;
    int draw= 0;
    int lose=0;
    int played=0;
    int points=0;
    
    private ArrayList<T> members= new ArrayList<>();
    
    public Team(String name){
        this.name=name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public boolean addPlayer(T p){
        if (members.contains(p)){
            System.out.println(p.getName()+" Player already in team");
            return false;
        }
        members.add(p);
        System.out.println(p.getName()+" picked for team"+this.name);
        return true;
        }
    
    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        
        if(ourScore>theirScore){
            win++;
            message= " beats ";
        }else if(ourScore==theirScore){
            draw++;
            message= " drew with ";
        }else{
            lose++;
            message=" lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
                   }
        }
    
        public int ranking (){
            return (win *2)+draw;
        }
        
    @Override
        public int compareTo(Team<T> team){
            if(this.ranking()>team.ranking()){
                return -1;
            }else if(this.ranking()<team.ranking()){
                return 1;
            }else{
                return 0;
            }}
            


        
        
        
        
        
        
            }