/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intrestcalculator;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class IntrestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter principle amount");
        double principle = in.nextDouble();

        System.out.println("enter rate per year number");
        double rate = in.nextDouble();

        System.out.println("enter how many times a year intrest is added");
        double n = in.nextDouble();

        System.out.println("enter time in years");
        double years = in.nextDouble();
        
        System.out.println("enter 1 or 2 - 1 = simple, 2 = compound");
        int type = in.nextInt();
        
        double finalamount = 0;
        
        if(type == 1){
            
            finalamount = (principle * rate * years) / 100;
            
        }
        else {
            
            finalamount = principle * Math.pow(1 + (rate/100.0 * n), n*years);
        }
        System.out.println("The intrest will be: " + String.format("%.2f", finalamount));
    }
}
