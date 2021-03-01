/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of array");
        int length = in.nextInt();

        int[] numbers = new int[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();
        }
        
        int sum = 0;
        boolean issum = false;
        
        for(int i = 0; i < numbers.length - 2; i++) {
            for(int k = i + 1; k < numbers.length - 1; k++) {
                for(int h = k + 1; h < numbers.length; h++) {
                
                    sum = numbers[i] + numbers[k] + numbers[h];
                    
                    if(sum == 15){
                        issum = true;
                        break;
                    }
                }
            }
        }
        if(issum == true){
        System.out.println("output: win"); 
        }
        else {
            System.out.println("output: loss");
        }
        
    }
    
}
