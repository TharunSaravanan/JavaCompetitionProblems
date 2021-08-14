/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roadtrip;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class RoadTrip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter speed of trip");
        double speed = in.nextDouble();
        
        System.out.println("Enter distance of trip");
        double distance = in.nextDouble();
        
        double mpg = 39 - (0.26 * speed);
        
        double capacity = mpg * 15;
        
        if(distance > capacity) {
            System.out.println("You will need to stop for gas.");
        }
        System.out.println("It will take you " + (distance / speed) + " hours to get to your destination.");
    }
    
}
