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
        
        double firstrow1 = Math.ceil(length / t1);
        double firstrow2 = Math.ceil(length / t2);
        
        double totaltiles1 = (firstrow1 * (firstrow1 + 1)) / 2;
        double totaltiles2 = (firstrow2 * (firstrow2 + 1)) / 2;
        
        double totalmoney1 = totaltiles1 * t1price;
        double totalmoney2 = totaltiles2 * t2price;
        
        if((totaltiles2) < (totaltiles1)) {
            System.out.println("the second tiles are cheaper. Price " + totalmoney2);
        }
        else {
            System.out.println("the first tiles are cheaper. Price " + totalmoney1);
        }

    }
}