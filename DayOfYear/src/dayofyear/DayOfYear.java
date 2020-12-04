/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayofyear;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class DayOfYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter month number");
        int month = in.nextInt();
        System.out.println("enter day");
        int day = in.nextInt();
        System.out.println("enter year");
        int year = in.nextInt();
        
        int prevdays = 0;
        int eday = 0;
        
        for(int i = 1; i <= month - 1; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 ){
                
                prevdays = prevdays + 31;
                
            }
            else if (i == 4 || i == 6 || i == 9 || i == 11 ) {
                
                prevdays = prevdays + 30;
            
            }
            else if (i == 2){
                if (year % 4 == 0){
                    prevdays = prevdays + 29;
                }
                else{
                    prevdays = prevdays + 28;
                }
            } 
            
            
        }
        
        eday = prevdays + day;  
        
        System.out.println("the day is: " + eday);
        
    }
    
}
