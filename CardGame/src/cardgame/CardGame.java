/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class CardGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount of cards ");
        double amount = in.nextDouble();
        System.out.print("Enter first card ");
        double first = in.nextDouble();
        System.out.print("Enter second card ");
        double second = in.nextDouble(); 
            
        double temp = 0;
        double notneeded = 0;
        double notneeded2 = 0;
        double answer = 0;
        double probfirst = (first + second)/2;
        
        for(int i = 0; i <= amount - 1; i++){

            temp = temp + i;
            
            if(i == first){
                notneeded = i;
            }
            if(i == second){
                notneeded2 = i;
            }
        }
        
        double average = temp / amount;
        
        System.out.println("the probability that the next card is higher is: " + (average / 10));
        System.out.println("the probability that the next card is lower is: " + (probfirst / (amount - 2)));
    }
    
}
