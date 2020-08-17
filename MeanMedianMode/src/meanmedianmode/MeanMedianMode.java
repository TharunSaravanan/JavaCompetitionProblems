/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meanmedianmode;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MeanMedianMode {

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


        // sorting the array
        for (int l = 0; l < numbers.length - 1; l++) {

            for (int j = l + 1; j < numbers.length; j++) {
                if (numbers[l] > numbers[j]) {

                    int temp = numbers[l];

                    numbers[l] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }

        double sum = 0;
        int smallnum = numbers[0];
        int bignum = numbers[0];
        
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];

            if (numbers[i] > bignum) {
                bignum = numbers[i];
            }

            if (numbers[i] < smallnum) {
                smallnum = numbers[i];
            }

        }
        
        
        System.out.println("The sum is " + sum);

        double average = sum / numbers.length;
        System.out.println("The Average is " + average);

        double median = 0;
        double left = numbers[numbers.length/2-1];
        double right = numbers[numbers.length/2];
        boolean isEven = (numbers.length % 2 == 0);

        if (isEven == true) {
            median = (left + right) / 2;
            System.out.println("median is " + median);
        } 
        else {
            System.out.println("median is " + left);
        }

        System.out.println("biggest number is " + bignum);
        System.out.println("smallest number is " + smallnum);

    }

}
