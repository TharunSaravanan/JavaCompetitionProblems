/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pairs;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class Pairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of attendees");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int k = 0; k < numbers.length; k++) {
            int c = k + 1;
            System.out.println("Enter item " + c);
            numbers[k] = in.nextInt();
        }
        
        int pair = 0;
        int nonpair = 0;
        
        for(int i = 0; i < numbers.length - 1; i = i + 2){
            if(numbers[i] != numbers[i + 1]){
                nonpair = numbers[i];
                break;
            }
        }
        if(numbers[length - 2] != numbers[length - 1]){
            nonpair = numbers[length - 1];
        }
        System.out.println("guest #" + nonpair + " did not bring a partner");
    }
}

    