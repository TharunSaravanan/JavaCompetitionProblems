/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discount;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number of test cases ");
        int T = in.nextInt();
        
        int toy = 100;
        int finalPrice = 0;
        
        for(int i = 0; i < T; i++)
        {        
            System.out.println("Enter discount value ");
            int discount = in.nextInt();
            
            finalPrice = (toy * (100 - discount)/100);
            
            System.out.println("your final price will be: " + finalPrice);
        }
        
    }
    
}
