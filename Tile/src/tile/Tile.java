/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tile;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Tile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter length of room");
        double length = in.nextDouble();

        System.out.println("enter width of room");
        double width = in.nextDouble();

        System.out.println("enter t1 length");
        double t1 = in.nextDouble();

        System.out.println("enter t2 length");
        double t2 = in.nextDouble();
        
        System.out.println("enter t1 price in dollars");
        double t1price = in.nextDouble();

        System.out.println("enter t2 price in in dollars");
        double t2price = in.nextDouble();
        
        double totaltiles1 = 0;
        double totaltiles2 = 0;
        double totalmoney1 = 0;
        double totalmoney2 = 0;
        
        double lengthtiles1 = Math.ceil(length / t1);
        double lengthtiles2 = Math.ceil(length / t2);
        double widthtiles1 = Math.ceil(width / t1);
        double widthtiles2 = Math.ceil(width / t2);
        
        totaltiles1 = lengthtiles1 * widthtiles1;
        totaltiles2 = lengthtiles2 * widthtiles2;
        
        totalmoney1 = totaltiles1 * t1price;
        totalmoney2 = totaltiles2 * t2price;
        
        if(totalmoney1 < totalmoney2){
            System.out.println("the first option is cheaper at: " + totalmoney1);
        }
        else {
            System.out.println("the second option is cheaper at: " + totalmoney2);
        }
    }
}
    
    

