/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtoint;

/**
 *
 * @author tharun
 */
public class StringToInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numString = "246";

        int multiplier = 10;

        int answer = 0;

        for (int i = 0; i < numString.length(); i++) {
            answer = answer * multiplier + (numString.charAt(i) - '0') ;    
        }
        
        System.out.println(answer + 123);
    }

}
