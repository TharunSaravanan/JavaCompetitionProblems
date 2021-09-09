/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryhexoctal;

/**
 *
 * @author Tharun Saravanan
 */
public class BinaryHexOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        for(int i = 65; i < 91; i++)
        {
          System.out.println(i + "    " 
                  + Integer.toBinaryString(i) + "   " 
                  + Integer.toOctalString(i) + "    " 
                  + Integer.toHexString(i) + "    " 
                  + (char)(i));  
        }
    }
    
}
