/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumbers;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class PhoneNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter number");
        String number = in.next();
        
        int n = 10;
        
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                System.out.print("(");
                System.out.print(number.charAt(i));
            }
            else if(i == 2)
            {    
                System.out.print(number.charAt(i));
                System.out.print(")");
                System.out.print("-");
            }       
            else if(i == 6)
            {
                System.out.print("-");
                System.out.print(number.charAt(i));
            }
            else 
                System.out.print(number.charAt(i));
                
        }
    }

}
