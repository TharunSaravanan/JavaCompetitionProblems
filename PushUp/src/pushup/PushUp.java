/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pushup;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class PushUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first score");
        double s1 = in.nextDouble();

        System.out.println("Enter the second score");
        double s2 = in.nextDouble();

        System.out.println("Enter the third score");
        double s3 = in.nextDouble();

        System.out.println("Enter the fourth score");
        double s4 = in.nextDouble();
        
        double totalscore = (4 * s1) + (3 * s2) + (2 * s3) + (s4);
        
        System.out.println("Willie did " + totalscore + " push ups.");
    }
    
}
