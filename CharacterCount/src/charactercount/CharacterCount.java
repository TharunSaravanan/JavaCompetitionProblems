/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charactercount;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class CharacterCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter word");
        String word = in.next();
        
        HashMap<Character, Integer> valueHolder = new HashMap<Character, Integer>();
        
        for (int i = 0; i < word.length(); i++) {
            
            if (valueHolder.containsKey(word.charAt(i))) {
                
                int count = valueHolder.get(word.charAt(i));
                count++;
                valueHolder.put(word.charAt(i), count);
            }
            else {
                
                valueHolder.put(word.charAt(i), 1);
                
            }
        }
        
        for (char l : valueHolder.keySet()) {
            
            System.out.println("the letter: " + l + " appears: " + valueHolder.get(l) + " times.");
            
        }
        
    }
    
}
