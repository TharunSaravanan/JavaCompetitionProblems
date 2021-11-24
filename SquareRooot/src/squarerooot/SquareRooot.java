/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarerooot;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class SquareRooot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number to take square root of: ");
        double root = in.nextInt();
        
        double sqrt = 0;
        
        for(int i = 0; i < root; i++)
        {
            if((root / i) == i)
            {
                sqrt = i;
            }
        }
        if(root == 1)
            System.out.println("square root is: " + "1");
        else if(root == 0)
            System.out.println("square root is: " + "0");
        else if(sqrt > 0)
            System.out.println("square root is: " + sqrt);
        else
            System.out.println("not a perfect square");
    }
    
}
