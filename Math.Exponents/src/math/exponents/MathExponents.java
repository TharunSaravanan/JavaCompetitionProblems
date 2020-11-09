/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.exponents;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MathExponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = in.nextInt();

        System.out.println("Enter your exponent");
        int exponent = in.nextInt();
        
        int answer = 1;

        for (int i = 1; i <= exponent; i++) {
            
            answer = answer * number;

        }
        
        System.out.println(answer);
    }

}
