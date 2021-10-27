/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palndrome;

import java.util.*;

/**
 *
 * @author Tharun Saravanan
 */
public class Palndrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number");
        int number = in.nextInt();
        
        int newNumber = 0;
        int currentNumber = 0;
        
        if(number < 0)
        {
            number = Math.abs(number);
            System.out.print("-");
        }
        
        while(number >= 1)
        {
            currentNumber = number % 10;
            newNumber = newNumber * 10 + currentNumber;
            number = number / 10;
        }
        System.out.println(newNumber);
    }
    
}
