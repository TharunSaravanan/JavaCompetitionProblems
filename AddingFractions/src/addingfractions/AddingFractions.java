/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addingfractions;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class AddingFractions {

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
        } 
        else {
            num = (num1 * den2) + (num2 * den1);
            den = den1 * den2;
        }
        
        if (num > den) {
            x = num;
        } 
        else {
            x = den;
        }
        
        for (int i = 1; i <= x; i++) {
            if (num % i == 0 && den % i == 0) {
                num = num / i;
                den = den / i;
            }
        }
        if(num == den){
            System.out.println(1);
        }
        else if(num > den){
            int remainder = num % den;
            System.out.println((num / den) + " " + remainder + "/" + den);
        }
        else {
            System.out.println(num + "/" + den);
        }
       
    }

}
