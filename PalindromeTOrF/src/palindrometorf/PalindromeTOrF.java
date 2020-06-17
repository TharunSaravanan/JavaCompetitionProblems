/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrometorf;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class PalindromeTOrF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String r = "";
    
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter the String");
    
    String Word = in.next();

    for(int i= Word.length() - 1; i >= 0; i--) {
        r = r + Word.charAt(i);
    }

    if(r.equals(Word)) {
        System.out.println("Is a palindrome");
    }
    else {
        System.out.println("Not a palindrome");
    }
    }
}