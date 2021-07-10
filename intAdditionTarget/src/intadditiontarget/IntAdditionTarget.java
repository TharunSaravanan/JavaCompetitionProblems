/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intadditiontarget;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class IntAdditionTarget {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Target");

        int target = in.nextInt();

        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();

        }
        
        boolean found = false;
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int k = i + 1; k < numbers.length; k++) {
                if (target == numbers[k] + numbers[i]) {
                    found = true;
                    System.out.println(numbers[i] + " + " + numbers[k] + " = " + target);
                }
            }
        }
        
        if(found == false) {
            System.out.println("There is no combination of two numbers that add up to the target.");
        }       
        
    }

}
