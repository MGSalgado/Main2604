/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main2604;

import java.util.*;

/**
 *
 * @author Miguel
 */
public class Main2604 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SoccerPlayer messi = new SoccerPlayer("messi");
        SoccerPlayer ronaldo = new SoccerPlayer("ronaldo");
        SoccerPlayer pele = new SoccerPlayer("pele");
        SoccerPlayer maradona = new SoccerPlayer("maradona");
        SoccerPlayer hugo = new SoccerPlayer("hugo");
        
        FootbaalPlayer Manning = new FootbaalPlayer("Manning");
        
        
        
        Team<SoccerPlayer> uno = new Team("Barca");
        uno.addPlayer(pele);
        Team<SoccerPlayer> dos= new Team ("Real Madrid");
        Team<SoccerPlayer> tres= new Team ("Juventus");
        
        Team<BaseballPlayer> base = new Team ("Foxes");
        Team<VolleyballPlayer> volley = new Team ("Wolves");
        
        League<Team<SoccerPlayer>> soccerLeague = new League("Gold");
        soccerLeague.addTeam(uno);
        soccerLeague.addTeam(dos);
        soccerLeague.addTeam(tres);
        //soccerLeague.addTeam(base);
        
        uno.matchResult(dos, 3, 2);
        dos.matchResult(tres, 0, 0);
        tres.matchResult(uno, 0, 2);
        uno.matchResult(dos, 2, 1);
        
        System.out.println(uno.getName()+uno.ranking());
        System.out.println(dos.getName()+dos.ranking());
        System.out.println(tres.getName()+tres.ranking());
        
        
        
        
}
}