/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruise;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Cruise {

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
        double stops1 = Math.floor(dist / (mpg1 * 15));
        double stops2 = Math.floor(dist / (mpg2 * 15));
        double time1 = dist / speed1 + (stops1 * 0.5);
        double time2 = dist / speed2 + (stops2 * 0.5);
        
        if(time1 > time2) {
            System.out.println("Driver 2 arrived " + (time1 - time2) + " hours sooner in " + time2 + " hours");
        }
        else {
            System.out.println("Driver 1 arrived " + (time2 - time1) + " hours sooner in " + time1 + " hours");
        }
    }
    
}
