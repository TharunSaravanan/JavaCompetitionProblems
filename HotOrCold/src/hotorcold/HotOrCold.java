/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotorcold;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class HotOrCold {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number of test cases ");
        int T = in.nextInt();
        
        int border = 20;
        boolean hotOrNot = false;
        
        for(int i = 0; i < T; i++)
        {        
            System.out.println("Enter temperature " + (i + 1));
            int temp = in.nextInt();
            if(temp > 20)
                System.out.println("your temperature is too hot");
            else
                System.out.println("your temperature is too cold");            
        }
    }
    
}
