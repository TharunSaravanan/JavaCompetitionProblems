/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareornot;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class SquareOrNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your number ");
        int square = in.nextInt();
        
        for(int i = 0; i < square; i++)
        {
            if((i * i) == square)
            {
                System.out.println("The answer is " + i);
                return;
            }
        }
        System.out.println("Your number is not a perfect square");
        
    }
    
}
