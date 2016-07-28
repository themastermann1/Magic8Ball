/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic8ball;

import java.util.Random;

/**
 *
 * @author Simon
 */
public class Baller {

    private int choices;
    Baller(){
        choices = 20;
        printer(choices);
    }
    
    public void printer(int t){
        int word = t;
        System.out.println(word); 
    }
    
    private void shake(){
        
    }
    
    private int rnjesus(int range){
        int r = range;
        Random rnj = new Random();      
        int choice = rnj.nextInt();
        return choice;
    }
    
}
