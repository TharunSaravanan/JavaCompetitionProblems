/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martiandatedifference;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MartianDateDifference {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        System.out.println("Enter starting day");
        int startingday = in.nextInt();
        System.out.println("Enter starting month");
        int startingmonth = in.nextInt();
        System.out.println("Enter starting year");
        int startingyear = in.nextInt();
        System.out.println("Enter ending day");
        int endingday = in.nextInt();
        System.out.println("Enter ending month");
        int endingmonth = in.nextInt();
        System.out.println("Enter ending year");
        int endingyear = in.nextInt();

        int diffdays = 0;

        if (startingyear == endingyear) {
            int startingdaycount = getDaysCount(startingday, startingmonth, startingyear);
            int endingdaycount = getDaysCount(endingday, endingmonth, endingyear);
            diffdays = endingdaycount - startingdaycount + 1;
        } else {
            for (int i = startingyear; i <= endingyear; i++) {
                int daysinCurrentYear = 0;
                if (i == startingyear) {
                    daysinCurrentYear = getRemainingDays(startingday, startingmonth, startingyear);
                } else if (i == endingyear) {
                    daysinCurrentYear = getDaysCount(endingday, endingmonth, endingyear);
                } else {
                    daysinCurrentYear = getNumberOfDaysInYear(i);
                }

                diffdays += daysinCurrentYear;
                System.out.println("year " + i + ", days " + daysinCurrentYear);
            }
        }

        System.out.println(diffdays);
    }

    // returns number of days in the year : 668 or 669
    public static int getNumberOfDaysInYear(int year) {
        int daysInYear = 0;

        if (isLeapYear(year) == true) {
            daysInYear = 668;
        } else {
            daysInYear = 669;
        }

        return daysInYear;
    }

    public static boolean isLeapYear(int year) {
        if (year == 0) {
            return false;
        }

        if (year % 2 == 0 && year % 10 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // return number of that date in the given year
    public static int getDaysCount(int date, int month, int year) {
        if (month == 1) {
            return date;
        }

        int dayInYear = 0;
        for (int i = 1; i < month; i++) {
            if (i == 6 || i == 12 || i == 18) {
                dayInYear = dayInYear + 27;
            } else if (i == 24 && isLeapYear(year) == true) {
                dayInYear = dayInYear + 27;
            } else {
                dayInYear = dayInYear + 28;
            }
        }

        return dayInYear + date;
    }

    public static int getRemainingDays(int date, int month, int year) {
        
        int daysInYear = getNumberOfDaysInYear(year);
        int daysCount = getDaysCount(date, month, year);
        int remainingDays = daysInYear - daysCount;
        return remainingDays;
    }

}
