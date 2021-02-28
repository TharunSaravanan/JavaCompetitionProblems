/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package particles;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Particles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter speed of first particle");
        double speedfirst = in.nextDouble();

        System.out.println("enter speed of second molecule");
        double speedsecond = in.nextDouble();

        System.out.println("enter distance between the two molecule");
        double distance = in.nextDouble();
        
        double remainingdistance = distance;
        double distance1 = 0;
        double distance2 = 0;
        double travelTime = 0.1;
        double totalTravelTime = 0;
        
        while(remainingdistance > 0) {
            distance1 += speedfirst * travelTime;
            distance2 += speedsecond * travelTime;
            remainingdistance = distance - (distance1 + distance2);
            
            totalTravelTime += travelTime;
        }
        
        System.out.println("The particles collided after " + totalTravelTime + " units");
        System.out.println("The first particle traveled " + distance1 + " units");
        System.out.println("The second particle traveled " + distance2 + " units");
    }
}
