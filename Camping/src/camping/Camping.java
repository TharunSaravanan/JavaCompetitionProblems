/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camping;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class Camping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter the numbers divided by spaces");
        String number = in.next();
        
        String[] numberstring = number.split(" ", 7);
        for(String token : numberstring) {
         System.out.println(token);
      }
      
        int[] numbers = new int[numberstring.length];
        
        for(int k = 0; k < numberstring.length; k++){
            numbers[k] = Integer.parseInt(numberstring[k]);
        }

        int maxsum = -1;
        
        int startdate = 0;
        
        for(int i = 0; i < numbers.length-3; i++){
            
            int sum = numbers[i] + numbers[i+1] + numbers[i + 2];
            if(sum > maxsum){
                maxsum = sum;
                startdate = i;
            }
            
        }
        
        System.out.println("days: " + (startdate + 1)+ ", " + (startdate + 2) + ", " + (startdate + 3));
        
    }
    
}
