/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package williespushups;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class WilliesPushUps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        
        System.out.println("Enter score 1 ");
        int score1 = numbers.nextInt();
        System.out.println("Enter score 2 ");
        int score2 = numbers.nextInt();
        System.out.println("Enter score 3 ");
        int score3 = numbers.nextInt();
        System.out.println("Enter score 4 ");
        int score4 = numbers.nextInt();
        
        int pushups = (score1 * 4) + (score2 * 3) + (score3 * 2) + (score4 * 1);
        
        System.out.println(pushups);
    }
    
}
