/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreverse;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class StringReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word");
        String word = in.next();

  
        for (int i = word.length()-1; i >= 0; i--) {  
            System.out.print(word.charAt(i));  
        } 
    }
    
}
