/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revrseinteger;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class RevrseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number");
        int number = in.nextInt();
        
        int n2 = 0;
        int digit = 0;
        
        if(number < 0)
        {
            System.out.print("-");
            
            number = Math.abs(number);
        }
        
        while(number >= 1)
        {
            digit = number % 10;
            n2 = n2 * 10 + digit;
            number /= 10;
        }
        System.out.println(n2);
    }
    
}
