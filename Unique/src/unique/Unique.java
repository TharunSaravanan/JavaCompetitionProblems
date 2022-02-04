/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unique;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Unique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String a = in.next();
        boolean unique = true;
        
        for(int i = 0; i < a.length(); i++)
        {
            for(int j = 1; j < a.length(); j++)
            {
                if(a.charAt(i) == (a.charAt(j)))
                {
                    unique = false;
                }
                else
                {
                    unique = true;
                }
            }
        }
            if(unique == true)
            {
                System.out.println("There is an unique character");
            }
            else
                System.out.println("There is not a unique character");
    } 
}
