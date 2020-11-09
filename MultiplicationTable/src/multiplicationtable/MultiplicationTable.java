/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MultiplicationTable {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = in.nextInt();
        
        for(int i = 1; i <= 20; i++){
            
            System.out.println(i + " x " + number + " = " + i * number);
        }
     
    }
    
}
