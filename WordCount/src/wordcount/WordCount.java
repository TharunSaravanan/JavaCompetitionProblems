/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordcount;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class WordCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter sentence");
        String sent = in.nextLine();
        
        int counter = 0;
        
        for (int i = 0; i < sent.length(); i++){
            
            if(sent.charAt(i) == ' '){
                counter = counter + 1;
            } 
        }
        counter = counter + 1;
        System.out.println("there are " + counter + " words in the sentence");
    }
    
}
