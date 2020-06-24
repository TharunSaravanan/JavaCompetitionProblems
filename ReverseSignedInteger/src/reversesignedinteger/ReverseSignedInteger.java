/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversesignedinteger;

import java.util.Scanner;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * Input: 123
 * Output: 321
 * 
 * Input: -123
 * Output: -321
 * 
 * @author tharun
 */
public class ReverseSignedInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int number = in.nextInt();
        
        boolean isNegative = false;
        
        int remainder = 0;
        
        int answer = 0;
        
        if (number < 0){
            isNegative = true;
            number = number * -1;
        }
        
        while (number > 0) {
            
            remainder = number % 10;
            answer = answer * 10 + remainder;
            number = number / 10;
        }
        if (isNegative == true){
            System.out.println("reverse is " + answer * -1);
        }
        else {
        System.out.println("reverse is " + answer);
        }
    }
    
}
