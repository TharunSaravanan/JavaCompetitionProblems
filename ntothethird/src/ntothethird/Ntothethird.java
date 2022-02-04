/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntothethird;

import java.util.*;

/**
 *
 * @author Tharun Saravanan
 */
public class Ntothethird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number");
        double a = in.nextInt();
        double k = 1;
        for(int i = 1; i < 20; i++)
        {
            k = Math.pow(3, i);
            if(k == a)
            {
                System.out.println("The answer is 3 to the " + i + " power");
                return;
            }
        }
    }
    
}
