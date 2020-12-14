/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleintrest;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class SimpleIntrest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter principle amount");
        int principle = in.nextInt();

        System.out.println("enter rate per year number");
        int rate = in.nextInt();

        System.out.println("enter time in years");
        int time = in.nextInt();
        
        int finalamount = 0;
        
        finalamount = (principle * rate * time)/100;
        
        System.out.println("The intrest will be: " + finalamount);
    }
    
}
