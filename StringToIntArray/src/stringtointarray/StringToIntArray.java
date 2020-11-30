/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtointarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class StringToIntArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String text = "10 20 30 40 50";
        /*int arraylength = 5;
        String temp = "";
        int index = 0;
        int[] numbers = new int[5]; 
        for(int i = 0; i < text.length(); i++){
            
            if(text.charAt(i) == ' ') {
                numbers[index++] = Integer.parseInt(temp);
                temp = "";
            }
            else{
                temp = temp + text.charAt(i);
            }
        }
        
        //putting the remaining number from temp to array
        numbers[index++] = Integer.parseInt(temp);
        
        for(int k = 0; k < numbers.length; k++){
            System.out.println(numbers[k]);
        }*/
        
        Scanner in = new Scanner(System.in);

        System.out.println("enter numbers split by spaces");
        String text = in.nextLine();
        String temp = "";
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ') {
                numbers.add(Integer.parseInt(temp));
                temp = "";
            } else {
                temp = temp + text.charAt(i);
            }
        }

        //putting the remaining number from temp to array
        numbers.add(Integer.parseInt(temp));

        for (int num : numbers)  
        { 
            System.out.println(num);
        } 
    }
    
}
