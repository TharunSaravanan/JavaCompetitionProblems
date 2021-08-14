/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingtemperature;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class CampingTemperature {

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
        
        int maxsum = -1;

        int startdate = 0;

        for (int i = 0; i < numbers.length - 3; i++) {

            int sum = numbers[i] + numbers[i + 1] + numbers[i + 2];
            if (sum > maxsum) {
                maxsum = sum;
                startdate = i;
            }

        }

        System.out.println("days: " + (startdate + 1) + ", " + (startdate + 2) + ", " + (startdate + 3));
        
    }
    
}
