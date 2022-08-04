/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maximumtaste;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MaximumTaste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number of test cases ");
        int T = in.nextInt();
        
        int maxTaste = 0;
        
        for(int i = 0; i < T; i++)
        {        
            System.out.println("Enter taste value for item a");
            int a = in.nextInt();
            System.out.println("Enter taste value for item b");
            int b = in.nextInt();
            System.out.println("Enter taste value for item c");
            int c = in.nextInt();
            System.out.println("Enter taste value for item d");
            int d = in.nextInt();
            
            maxTaste = a + b + c + d;
            
            System.out.println("The maximum taste value for this dish will be: " + maxTaste);
        }
    }
    
}
