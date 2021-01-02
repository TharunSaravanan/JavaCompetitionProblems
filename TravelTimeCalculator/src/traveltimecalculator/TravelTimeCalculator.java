/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traveltimecalculator;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class TravelTimeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter distance");
        double dist = in.nextDouble();
        System.out.println("enter speed of driver 1");
        double speed1 = in.nextDouble();
        System.out.println("enter speed of driver 2");
        double speed2 = in.nextDouble();
        
        double gallons = 15;
        double mpg1 = 24.7 * (55 / (Math.pow(speed1 - 55, 1.35) + 55));
        double mpg2 = 24.7 * (55 / (Math.pow(speed2 - 55, 1.35) + 55));
        double time1 = dist / speed1;
        double time2 = dist / speed2;
        double stops1 = 0.5 * (Math.floor(dist / (gallons * mpg1)));
        double stops2 = 0.5 * (Math.floor(dist / (gallons * mpg2)));
        double tt1 = time1 + stops1;
        double tt2 = time2 + stops2;
        
        if(tt1 < tt2){
            System.out.println("Driver 1 arrived first in " + String.format("%.2f", tt1) + " hours.");
            System.out.println("Driver 1 arrived " + String.format("%.2f", (tt2 - tt1)) + " hours sooner.");
        }
        else if(tt2 < tt1) {
            System.out.println("Driver 2 arrived first in " + String.format("%.2f", tt2) + " hours.");
            System.out.println("Driver 2 arrived " + String.format("%.2f" , (tt1 - tt2))  + " hours sooner.");
        }
    }
    
}
