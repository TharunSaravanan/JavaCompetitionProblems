/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseinteger;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int reminder = 0;

        int reverse = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer");
        int number = in.nextInt();

        while (number > 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        
        System.out.println(" Reverse of entered number is " + reverse);
    }
}
