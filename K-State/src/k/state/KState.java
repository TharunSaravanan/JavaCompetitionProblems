/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package k.state;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class KState {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter distance");
        double dist = in.nextDouble();
        System.out.println("enter speed >= 55");
        double speed = in.nextDouble();
        
        double gallons = 15;
        double mpg = 0;
        double time = 0;
        double gas = 0;
        double stops = 0;
        double minutes = 0;
        double hours = 0;
        
        mpg = 39 - (0.26 * speed);
        gas = mpg * gallons;
        stops = Math.floor(dist/gas);
        time = dist/speed + (0.5 * stops);
        hours = Math.floor(time);
        minutes = (time - hours) * 60;
        
        
        System.out.println("you will have to stop " + Math.round(stops) + " times");
        System.out.println("you will take about " + String.format("%.2f", time) + " hours to get back to manhattan");
        System.out.println("you will take " + Math.round(hours) + " hours and " + Math.round(minutes) + " minutes to get back to manhattan" );
        
        
    }
    
}
