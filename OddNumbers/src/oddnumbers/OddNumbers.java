/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oddnumbers;

import java.util.Scanner;

/**
 *
 * /prints odd numbers between two numbers
 */
public class OddNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Smaller Number");
        int SmallNum = in.nextInt();
        
        System.out.println("Enter Bigger Number");
        int BigNum = in.nextInt();
        
        if(SmallNum % 2 == 0){
            SmallNum = SmallNum + 1;
        }
        
        for(int i = SmallNum; i <= BigNum; i = i + 2){  
            System.out.println(i);
        }
    }
    
}
