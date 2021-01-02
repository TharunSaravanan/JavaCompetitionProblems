/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muddypaws;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MuddyPaws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter 1st room size");
        double size1 = in.nextDouble();
        System.out.println("Enter 2nd room size");
        double size2 = in.nextDouble();
        System.out.println("Enter 3rd room size");
        double size3 = in.nextDouble();
        
        double totalcleaner = 10 * 500;
        double roomscleaned = 0;
        
        if(totalcleaner > size1){
            roomscleaned = roomscleaned + 1;
            totalcleaner = totalcleaner - size1;
        }
        
        if(totalcleaner > size2){
            roomscleaned = roomscleaned + 1;
            totalcleaner = totalcleaner - size2;
        }
            
        if(totalcleaner > size3){
            roomscleaned = roomscleaned + 1; 
        }
        
        System.out.println(roomscleaned);
    }
    
}
