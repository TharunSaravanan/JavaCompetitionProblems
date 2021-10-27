/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prefix;

/**
 *
 * @author Tharun Saravanan
 */
public class Prefix {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String word1 = "flowers";
        String word2 = "float";
        String word3 = "flop";
        
        char d = ' ';
        char e = ' ';
        char f = ' ';
        
        for(int i = 0; i < 1000; i++)
        {
            d = word1.charAt(i);
            e = word2.charAt(i);
            f = word3.charAt(i);
            
            if(d == e && d == f)
            {
                System.out.print(d);
            }
            else
            {
                System.out.println(" ");
                break;
            }
        }
    }
}
