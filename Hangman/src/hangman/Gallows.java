/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author BlancoFamily
 */
public class Gallows {
    String Gallows = 
           "____________\n"
          +"|           |\n"
          +"|           |\n"
          +"|\n"
          +"|\n"
          +"|\n"
          +"|\n"
          +"|\n"
          +"|\n"
          +"|\n"
          +"|\n"  
          +"|\n"
     +"-----------\n";

    
    public String displayGallow(){
        System.out.println(Gallows);
        return null;
    }
    
    public void displayWrongLetterBox(){
        System.out.println("ToDo: Display wrong letter box");
    }    
    
}