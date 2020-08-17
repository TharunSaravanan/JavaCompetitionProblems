/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = in.nextInt();
        int fact = 1;
                
        for(int i = 1; i <= number; i++){
            fact = fact * i;
        }
        
        System.out.println("Factorial of "+number+" is: "+fact);
        
        
        
        
        
        
    }
    
}
