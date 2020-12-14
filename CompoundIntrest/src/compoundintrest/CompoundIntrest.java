/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundintrest;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class CompoundIntrest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter principle amount");
        int principle = in.nextInt();

        System.out.println("enter rate per year number");
        int rate = in.nextInt();
        
        System.out.println("enter how many times a year intrest is added");
        int n = in.nextInt();

        System.out.println("enter time in years");
        int time = in.nextInt();

        int finalamount = 0;
        
        finalamount = principle * (1 + (rate/n))^(n * time);
        
        System.out.println("the final intrest is: " + finalamount);
    }
    
}
