/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometrueorfalse;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class PalindromeTrueOrFalse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the String");

        String word = in.next();
        int length = word.length();
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            char left = word.charAt(i);
            char right = word.charAt(length - 1 - i);

            if (left != right) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("is not a palindrome");
        }

    }

}
