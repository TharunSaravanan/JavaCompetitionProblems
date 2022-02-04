/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duplicates;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Duplicates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array: ");
        int length = in.nextInt();

        int a[] = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter number " + (i + 1));
            a[i] = in.nextInt();
        }
        int counter = 0;
        
        for(int i = 0; i < a.length; i++)
        {
            for(int k = 1; k < a.length; k++)
            {
                if(a[i] == a[k])
                {
                    System.out.println(a[i] + " And " + a[k] + " Are common");
                    counter++;
                    return;
                }
            }
        }
    }
}
