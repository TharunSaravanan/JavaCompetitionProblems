/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaphowmanytimes;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class HashMapHowManyTimes {

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
        
        HashMap<Integer, Integer> valueHolder = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < numbers.length; i++) {
            
            if (valueHolder.containsKey(numbers[i])) {
                // value + 1
                int count = valueHolder.get(numbers[i]);
                count++;
                valueHolder.put(numbers[i], count);
            }
            else {
                // add key with value = 1
                valueHolder.put(numbers[i], 1);
                
            }
        }
        
        for (int l : valueHolder.keySet()) {
            
            System.out.println("number: " + l + " count: " + valueHolder.get(l));
            
        }
        
    }
    
}
