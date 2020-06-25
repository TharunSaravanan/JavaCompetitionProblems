/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeornot;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class PrimeOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = in.nextInt();
        boolean prime = true;
        
        for (int i = 2; i <= number/2; i++) {
            
            if ( number % i == 0) {
                prime = false;
                break;
            }
           
        }
        
        if (prime == true){
            System.out.println(number +" is prime");
        }
        else {
            System.out.println(number + " is not prime");
        }
        
    }
    
}
