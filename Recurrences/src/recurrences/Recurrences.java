/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recurrences;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Recurrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a");
        double a = in.nextDouble();

        System.out.println("enter b");
        double b = in.nextDouble();

        System.out.println("enter f(0)");
        double f0 = in.nextDouble();

        System.out.println("enter f(1)");
        double f1 = in.nextDouble();

        System.out.println("enter n");
        double n = in.nextDouble();
        
         double fminus1 = f1;
         double fminus2 = f0;
         double fn = 0;
         
         for(int i = 2; i <= n; i++){
             
             fn = a * (fminus2) + b * (fminus1);
             
             fminus2 = fminus1;
             fminus1 = fn;
         }
        
         System.out.println(fn);
         
    }
    
}
