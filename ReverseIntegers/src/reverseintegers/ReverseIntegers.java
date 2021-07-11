/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseintegers;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class ReverseIntegers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = in.nextInt();
        
        int remainder = 0;
        int reverse = 0;
        
        
        while(number > 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        
        System.out.println("The reverse will be: " + reverse);
        
    }
    
}
