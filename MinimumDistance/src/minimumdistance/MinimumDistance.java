/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimumdistance;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MinimumDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter x cord of a");
        double xa = in.nextDouble();
        System.out.println("Enter y cord of a");
        double ya = in.nextDouble();
        System.out.println("Enter x cord of b");
        double xb = in.nextDouble();
        System.out.println("Enter y cord of b");
        double yb = in.nextDouble();
        System.out.println("Enter x cord of c");
        double xc = in.nextDouble();
        System.out.println("Enter y cord of c");
        double yc = in.nextDouble();
        
        double atob = Math.sqrt(Math.pow(xa-xb, 2) + Math.pow(ya-yb, 2));
        double atoc = Math.sqrt(Math.pow(xa-xc, 2) + Math.pow(ya-yc, 2));
        
        if(atob < atoc){
            System.out.println("a is closer to b");
        }
        else {
            System.out.println("a is closer to c");
        }
    }
    
}
