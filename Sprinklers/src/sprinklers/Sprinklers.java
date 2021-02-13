 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprinklers;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Sprinklers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("enter length of yard");
        double length = in.nextDouble();

        System.out.println("enter width of yard");
        double width = in.nextDouble();
        
        double area = width * length;
        
        double radius = width;
        
        double circlearea = (3.14159 * radius * radius) / 2;
        
        System.out.println("max%: " + String.format("%.2f", (circlearea / area) * 100) + "%");
    }
    
}
