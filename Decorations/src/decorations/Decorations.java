/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorations;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Decorations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the cardboard ");
        double length = in.nextDouble();
        System.out.print("Enter width of the cardboard ");
        double width = in.nextDouble();
        System.out.print("Enter width of box ");
        double widthbox = in.nextDouble();
        
        double height = (width - widthbox)/2;
        double boxlength = length - (width - widthbox);
        double volume = widthbox * height * boxlength;
        
        if(height < 1){
            System.out.println("Those dimentions do not create a valid box.");
            return;
        }
        
        System.out.println("length = " + String.format("%.2f", boxlength));
        System.out.println("width = " + String.format("%.2f", widthbox));
        System.out.println("height = " + String.format("%.2f", height));
        System.out.println("volume = " + String.format("%.2f", volume));
    }
    
}
