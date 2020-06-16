/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class JavaApplication33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of phrases");
        int length = in.nextInt();

        String[] words = new String[length];

        System.out.println("Enter " + length + " words. ex. kit-kat");

        for (int j = 0; j < words.length; j++) {
            words[j] = in.next();
        }

        for (int k = 0; k < words.length; k++) {

            String currentWord = words[k];

            for (int i = 0; i < currentWord.length(); i++) {
                char currentChar = currentWord.charAt(i);

                if (i == 0) {
                    System.out.print(Character.toUpperCase(currentChar));
                }

                if (currentChar == '-') {
                    System.out.print(Character.toUpperCase(currentWord.charAt(i + 1)));
                }
            }
            
            System.out.println();
        }
    }
}
