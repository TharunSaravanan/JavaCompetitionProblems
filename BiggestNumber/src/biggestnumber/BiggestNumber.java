/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggestnumber;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class BiggestNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number");
        int num1 = in.nextInt();

        System.out.println("Enter your second number");
        int num2 = in.nextInt();

        System.out.println("Enter your first number");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest number");

        } else {
            System.out.println(num3 + " is the largest number");
        }

    }

}

