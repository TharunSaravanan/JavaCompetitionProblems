/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumerals;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class RomanNumerals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Roman Numeral");
        String numeral = in.next();

        boolean iFound = false;
        
        int counter = 0;
                
        for(int i = 0; i < numeral.length(); i++) {
            
            if(numeral.charAt(i) == 'I') {
                iFound = true;
            }
            switch(numeral.charAt(i)) {
                case 'I': counter += 1;
                
                case 'V': counter += 5;
                
                case 'X': counter += 10;
            }
            
        }
        
    }
    
}
