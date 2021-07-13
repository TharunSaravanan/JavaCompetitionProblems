/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integerpalindrome;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class IntegerPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int palindromeNumber = in.nextInt();
        
        int remainder = 0;
        int reverse = 0;
        int palindromeNumber2 = palindromeNumber;

        while (palindromeNumber > 0) {
            remainder = palindromeNumber % 10;
            reverse = reverse * 10 + remainder;
            palindromeNumber = palindromeNumber / 10;
        }
        
        if(palindromeNumber2 == reverse) {           
            System.out.println("The number is a palindrome.");            
        }
        else {           
            System.out.println("The number is not a palindrome.");
        }
        
    }
    
}
