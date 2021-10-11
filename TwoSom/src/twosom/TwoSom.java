/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twosom;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class TwoSom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of items");
        int length = in.nextInt();
        
        System.out.println("Enter target");
        int target = in.nextInt();

        Integer[] numbers = new Integer[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter cost of item " + c);
            numbers[j] = in.nextInt();
        }
        
        int sum = 0;
        
        for(int i = 0; i < numbers.length; i++)
        {
            for(int k = 0; k < numbers.length; k++)
            {
                sum = numbers[i] + numbers[k];
                if(sum == target)
                {                 
                    System.out.println("[" + i + ", " + k + "]");
                }
            }
        }
        
    }
    
}
