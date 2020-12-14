/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monthdayyear;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MonthDayYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter day number");
        int day = in.nextInt();
        
        String eday = "";
        int month = 0;
        int prevdays = 0;
        int remainder = 0;
        
        String[] monthnames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        
        for (int i = 1; i <= 12; i++) {
            
            int monthdays = 0;
              if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                monthdays = 31;

            } else if (i == 4 || i == 6 || i == 9 || i == 11) {

                monthdays = 30;

            } else if (i == 2) {
                monthdays = 29;
            }
              
              prevdays = prevdays + monthdays;
              
            if (day < prevdays) {
                month = i;
                remainder = day - prevdays + monthdays;
                break;
            } 
        }
        System.out.println(eday);
        System.out.println(remainder);

        /* Scanner in = new Scanner(System.in);

        System.out.println("enter day number");
        int day = in.nextInt();
        
        int eday = 0;
        int month = 12 - ((365 - day)/31);
        String monthname = "";
        
        if (month == 1){
            monthname = "January";
            eday = day - ((month - 1) * 31);
        }
        else if (month == 2) {
            monthname = "February";
            eday = day - ((month - 1) * 28) - 1;
        }
        else if (month == 3) {
            monthname = "March";
            eday = day - ((month - 1) * 31) + 3;
        }
        else if (month == 4) {
            monthname = "April";
            eday = day - ((month - 1) * 30)-1;
        }
        else if (month == 5) {
            monthname = "May";
            eday = day - ((month - 1) * 31)+3;
        }
        else if (month == 6) {
            monthname = "June";
            eday = day - ((month - 1) * 30)-2;
        }
        else if (month == 7) {
            monthname = "July";
            eday = day - ((month - 1) * 31)+4;
        }
        else if (month == 8) {
            monthname = "August";
            eday = day - ((month - 1) * 31)+4;
        }
        else if (month == 9) {
            monthname = "September";
            eday = day - ((month - 1) * 30)-4;
        }
        else if (month == 10) {
            monthname = "October";
            eday = day - ((month - 1) * 31)+5;
        }
        else if (month == 11) {
            monthname = "November";
            eday = day - ((month - 1) * 30)-5;
        }
        else if (month == 12) {
            monthname = "December";
            eday = day - ((month - 1) * 31)+6;
        }
        
        System.out.println(monthname + eday);
         */
    }

}
