/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilesize;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class Tilesize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter length of one side");
        double length = in.nextDouble();

        System.out.println("enter t1 length");
        double t1 = in.nextDouble();

        System.out.println("enter t2 length");
        double t2 = in.nextDouble();
        
        System.out.println("enter t1 price in dollars");
        double t1price = in.nextDouble();

        System.out.println("enter t2 price in in dollars");
        double t2price = in.nextDouble();
        
        double area = (length * length) / 2;
        
        double t1amount = area / (t1 * t1);
        double t2amount = area / (t2 * t2);
        double t1total = t1amount * t1price;
        double t2total = t2amount * t2price;
        
        if(t2total < t1total) {
            System.out.println("the second tiles are cheaper");
        }
        else {
            System.out.println("the first tiles are cheaper");
        }

    }
}