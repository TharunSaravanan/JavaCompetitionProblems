/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addfractions;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class AddFractions {

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

        int num = 0;
        int den = 0;
        int x = 0;
        

        if (den1 == den2) {
            num = num1 + num2;
            den = den1;
            System.out.println(num + "/" + den);
            return;
        }
        
        int bigden = 0;
        int smallden = 0;
        int smallnum = 0;
        int bignum = 0;
        
        if(den1 > den2) {
            bigden = den1;
            smallden = den2;
        }
        else {
            bigden = den2;
            smallden = den1;
        }
        
        if(num1 > num2) {
            smallnum = num2;
            bignum = num1;
        }
        else {
            smallnum = num1;
            bignum = num2;
        }
        
        if (bigden % smallden == 0) {
            
            den = bigden;
            num = bignum + (bigden / smallden) * smallnum;
            
        }
        
        else {
            num = (num1 * den2) + (num2 * den1);
            den = den1 * den2;
        }
        
        System.out.println(num + "/" + den);
        
    }
    
}

