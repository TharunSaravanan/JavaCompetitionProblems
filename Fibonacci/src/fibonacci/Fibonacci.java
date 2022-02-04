/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the term in the sequence");
        int n = in.nextInt();
        System.out.println(fib(n));
    }
    
    static int fib(int n)
    {
        if(n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
    
}
