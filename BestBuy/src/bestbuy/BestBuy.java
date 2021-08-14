/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bestbuy;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class BestBuy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the weight in ounces of first item");
        double weight1 = in.nextDouble();
        
        System.out.println("Enter the cost of first item");
        double cost1 = in.nextDouble();
        
        System.out.println("Enter the weight in ounces of second item");
        double weight2 = in.nextDouble();

        System.out.println("Enter the cost of second item");
        double cost2 = in.nextDouble();
        
        double unit1 = cost1 / weight1;
        double unit2 = cost2 / weight2;
        
        if (unit1 > unit2) {
            System.out.println("The second item has a smaller unit price.");
        }
        
        else if (unit1 < unit2) {
            System.out.println("The first item has a smaller unit price.");
        }
        
        else if (unit1 == unit2) {
            System.out.println("Both have the same unit price.");
        }
        
    }
    
}
