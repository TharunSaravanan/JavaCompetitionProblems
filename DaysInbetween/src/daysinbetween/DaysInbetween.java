/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysinbetween;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class DaysInbetween {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter first month number");
        int month1 = in.nextInt();
        System.out.println("enter first day");
        int day1 = in.nextInt();
        System.out.println("enter first year");
        int year1 = in.nextInt();
        System.out.println("enter second month number");
        int month2 = in.nextInt();
        System.out.println("enter second day");
        int day2 = in.nextInt();
        System.out.println("enter second year");
        int year2 = in.nextInt();

        int prevdays1 = 0;
        int eday1 = 0;
        int prevdays2 = 0;
        int eday2 = 0;
        int yeardays = 0;
        int k = 0;

        for (int i = 1; i <= month1 - 1; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

                prevdays1 = prevdays1 + 31;

            } else if (i == 4 || i == 6 || i == 9 || i == 11) {

                prevdays1 = prevdays1 + 30;

            } else if (i == 2) {
                prevdays1 = prevdays1 + 29;
            }

        }

        eday1 = prevdays1 + day1;

        for (int i = 1; i <= month2 - 1; i++) {
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

                prevdays2 = prevdays2 + 31;

            } else if (i == 4 || i == 6 || i == 9 || i == 11) {

                prevdays2 = prevdays2 + 30;

            } else if (i == 2) {
                prevdays2 = prevdays2 + 29;
            }

        }

        for (k = year1; k <= year2; k++);
        {

            if (k % 4 == 0) {
                yeardays = yeardays + 366;
            } else {
                yeardays = yeardays + 365;
            }

        }

        eday2 = prevdays2 + day2;

        if (year2 == year1) {

            System.out.println("there are " + (eday2 - eday1) + " days inbetween these two dates");

        } else {

            System.out.println("there are " + ((eday2 - eday1) + yeardays) + " days inbetween these two dates");

        }

    }
}
