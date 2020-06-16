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
public class StringArrayReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.println("Enter amount of words");
        int length = in.nextInt();

        String[] words = new String[length];

        System.out.println("Enter word"+ length);

        for (int j = 0; j < words.length; j++) {
            words[j] = in.next();
        }  
  
        for (int i = words.length-1; i >= 0; i--) {  
            System.out.print(words[i] + " ");  
        } 
    }
    
}
