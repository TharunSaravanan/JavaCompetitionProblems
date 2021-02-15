/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondorderlinerhomegeneousrecurrsion;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class SecondOrderLinerHomegeneousRecurrsion {

    static double a = 0;
    static double b = 0;
    static double f0 = 0;
    static double f1 = 0;
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a");
        a = in.nextDouble();

        System.out.println("enter b");
        b = in.nextDouble();

        System.out.println("enter f(0)");
        f0 = in.nextDouble();

        System.out.println("enter f(1)");
        f1 = in.nextDouble();

        System.out.println("enter n");
        int n = in.nextInt();

        double fn = 0;
        
        fn = rec(n);
        System.out.println("f(n) = " + fn);
    }
    
    public static double rec(int n) {
        
        System.out.println("Finding f("+ n +")");
        
        if(n == 0){
            return f0;
        }
        
        if(n == 1){
            return f1;
        }
        
        double fminus2 = rec(n - 2);
        double fminus1 = rec(n - 1);
        
        double result = a * fminus2 + b * fminus1;
        System.out.println("f(" + n + ") = " + result);
        return result;
    }
    
}
