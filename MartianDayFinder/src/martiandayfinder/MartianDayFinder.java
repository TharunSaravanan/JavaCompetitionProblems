/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package martiandayfinder;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class MartianDayFinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter month");
        int month = in.nextInt();
        System.out.println("enter day");
        int day = in.nextInt();
        
        int exactday = ((month - 1) * 28 - (month - 1) / 6 + day);
        
        System.out.println("the day is " + exactday);
    }
    
}
