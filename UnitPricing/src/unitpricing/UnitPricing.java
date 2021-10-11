/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitpricing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class UnitPricing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of items");
        int length = in.nextInt();

        double[] costs = new double[length];

        for (int j = 0; j < costs.length; j++) {
            int c = j + 1;
            System.out.println("Enter cost of item " + c);
            costs[j] = in.nextDouble();
        }
        double[] weights = new double[length];

        for (int k = 0; k < weights.length; k++) {
            int c = k + 1;
            System.out.println("Enter weight of item " + c);
            weights[k] = in.nextDouble();
        }
        
        double lowestPrice = Integer.MAX_VALUE;
        double[] unitPrice = new double[length];
        
        for(int t = 0; t < length; t++)
        {
            unitPrice[t] = costs[t] / weights[t];
            lowestPrice = Math.min(lowestPrice, unitPrice[t]);
        }     
        
        for(int i = 0; i < unitPrice.length; i++)
        {
            if(unitPrice[i] == lowestPrice)
            {
                System.out.println("item " + (i + 1) + " has the lowest price at " + lowestPrice + " per ounce");
            }
        }
        
    }
    
}
