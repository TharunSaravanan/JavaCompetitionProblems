/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryadd;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class BinaryAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount of rows: ");
        int row = in.nextInt();
        
        int i = 0;
        int j = 0;
        int space = 0;
        int num = 0;
        
        for (i = 0; i < row; i++) {
            for (space = row; space > i; space--) {
                System.out.print(" ");
            }
            num = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.print("\n");
        }
    }
}

