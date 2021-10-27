/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addfarctions;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class AddFarctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numerator for first fraction : ");
        int num1 = in.nextInt();
        System.out.print("Enter denominator for first fraction : ");
        int den1 = in.nextInt();
        System.out.print("Enter numerator for second fraction : ");
        int num2 = in.nextInt();
        System.out.print("Enter denominator for second fraction : ");
        int den2 = in.nextInt();
        
        int commonDen = den1 * den2;
        
        int newNumerator1 = den2 * num1;
        int newNumerator2 = den1 * num2;
        int numerator = newNumerator1 + newNumerator2;
        
        if(numerator % commonDen == 0)
        {
            System.out.println(numerator / commonDen);
            return;
        } 
        else if(numerator % 2 == 0 && commonDen % 2 == 0)
        {
            System.out.println((numerator / 2) + "/" + (commonDen / 2));
            return;
        }
        
        System.out.println(numerator + "/" + commonDen);
    }
    
}
