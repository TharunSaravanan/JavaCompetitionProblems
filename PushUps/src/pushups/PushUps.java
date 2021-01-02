/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushups;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class PushUps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter 1st score");
        int score1 = in.nextInt();
        System.out.println("Enter 2nd score");
        int score2 = in.nextInt();
        System.out.println("Enter 3rd score");
        int score3 = in.nextInt();
        System.out.println("Enter 4th score");
        int score4 = in.nextInt();
        
        int total = 0;
        
        int t1 = score1;
        int t2 = score1 + score2;
        int t3 = score1 + score2 + score3;
        int t4 = score1 + score2 + score3 + score4;
        
        total = t1 + t2 + t3 + t4;
        
        System.out.println("willie did " + total + " push ups");
}
}
