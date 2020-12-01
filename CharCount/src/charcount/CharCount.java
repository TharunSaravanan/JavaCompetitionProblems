/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcount;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class CharCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter sentence");
        String sent = in.nextLine();
        int lettercount = 0;
        int intcount = 0;
        int counter = 0;
                
        for(int i = 0; i < sent.length(); i++){
            char c = sent.charAt(i);
            if (Character.isLetter(c)){
                lettercount = lettercount + 1;
            }
            else if (Character.isDigit(c)){
                intcount = intcount + 1;
            }
            else{
                counter = counter + 1;
            }
        }
        System.out.println("there are " + lettercount + " letters");
        System.out.println("there are " + intcount + " numbers");
        System.out.println("there are " + counter + " other characters");
    }
    
}
