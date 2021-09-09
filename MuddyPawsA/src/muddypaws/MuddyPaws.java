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

        System.out.println("Enter number of rooms");
        int length = in.nextInt();

        int[] rooms = new int[length];

        for (int j = 0; j < rooms.length; j++) {
            int c = j + 1;
            System.out.println("Enter square footage of room " + c);
            rooms[j] = in.nextInt();

        }

        double cleanerLeft = 10 * 500;
        double roomscleaned = 0;

        for (int i = 0; i < rooms.length; i++) {
            if (cleanerLeft > rooms[i]) {
                roomscleaned = roomscleaned + 1;
                cleanerLeft = cleanerLeft - rooms[i];
            }
        }

        System.out.println(roomscleaned + " rooms cleaned");
    }
    
}
