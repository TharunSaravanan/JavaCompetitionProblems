/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package campingtripad;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class CampingTripAd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter trip length");
        int triplength = in.nextInt();
        
        System.out.println("enter the numbers divided by spaces");
        String number = in.nextLine();
        
        String[] numberstring = number.split(" ", 7);
        
        int[] numbers = new int[numberstring.length];

        for (int k = 0; k < numberstring.length; k++) {
            numbers[k] = Integer.parseInt(numberstring[k]);
        }
            int maxsum = 0;
            int startday = 0;
            int average = 0;
        
        for(int i = 0; i <= numbers.length - triplength; i++){
            int currentsum = 0;
            for(int j = i; j <= i + triplength - 1; j++){
                currentsum = currentsum + numbers[j];
            }
            if(maxsum < currentsum){
                maxsum = currentsum;
                startday = i + 1;
            }
            average = maxsum / triplength;
        }
        System.out.println("the average of the days that you should camp on is: " + average);
    }
    
}
