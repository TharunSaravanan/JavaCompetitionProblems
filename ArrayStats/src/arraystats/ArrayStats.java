/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystats;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class ArrayStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();

        }
        double sum = 0;
        double average = 0;
        int bignum = numbers[0];
        int smallnum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            
            if(numbers[i] > bignum){
                bignum = numbers[i];
            }
            if(numbers[i] < smallnum){
                smallnum = numbers[i];
            }
        }
        
        average =(double) sum / (length);

        System.out.println("the sum is: " + sum);
        System.out.println("the average is: " + average);
        System.out.println("the biggest number is: " + bignum);
        System.out.println("the smallest number is: " + smallnum);
    }
}
