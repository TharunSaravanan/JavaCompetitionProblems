/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypairs;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class ArrayPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter final sum");
        int sum = in.nextInt();
        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int k = 0; k < numbers.length; k++) {
            int c = k + 1;
            System.out.println("Enter item " + c);
            numbers[k] = in.nextInt();
        }
        
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] + numbers[j] == sum) {
                    System.out.println(numbers[i] + " and " + numbers[j] + " are a pair");
                    isFound = true;
                    break;
                }

            }
            
            if (isFound == true) {
                break;
            }
            
        }

    }
}
