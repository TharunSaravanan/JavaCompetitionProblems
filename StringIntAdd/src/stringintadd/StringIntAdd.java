/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringintadd;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class StringIntAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter numbers");
        String word = in.nextLine();

        String firstWord = "";

        String secondWord = "";

        Boolean isFirstWord = true;

        for (int i = 0; i < word.length(); i++) {

            char currentChar = word.charAt(i);

            if (currentChar == ' ') {
                isFirstWord = false;
                continue;
            }

            if (isFirstWord == true) {
                firstWord = firstWord + currentChar;
            } else {
                secondWord = secondWord + currentChar;
            }
        }
        int j=Integer.parseInt(firstWord);
        int i=Integer.parseInt(secondWord);
        System.out.println(j + i);
    }

}
