/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorityelement;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MajorityElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter length of array: ");
        int length = in.nextInt();
        
        int numbers[] = new int[length];
        for(int i = 0; i < length; i++)
        {
            System.out.println("Enter number " + (i + 1));
            numbers[i] = in.nextInt();
        }
        
        double counter = 0;
        double n = 0;
        
        for(int j = 0; j < length; j++)
        {
            for(int k = 1; k < length; k++)
            {
                if(numbers[j] == numbers[k])
                {
                    counter++;
                }
                if(counter > (n/2))
                {
                    System.out.println(numbers[j]);
                    break;
                }
            }
            if(counter > (n/2))
            {
                break;
            }
        }
    }
    
}
