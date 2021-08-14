/*
There have been a few rain storms the last couple of days, but the puppies still had to go
outside to play. Coming back inside, the puppies left muddy paw prints all over the house.
You are tasked with trying to clean as many rooms of the house as you can, but you only
have so much cleaner. Write a program to determine how many of the three rooms in the
house you can clean if you have 10 gallons of cleaner. Each gallon of cleaner can clean a
maximum of 500 square feet. Your program should rst take input for the square footage
(given as a whole number) of each room. The inputs are given in ascending order of size.
Inputs are given one per line. Finally, your program should output the number of rooms
you can clean
*/

package muddypaw;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class MuddyPaw {

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
            System.out.println("Enter room number " + c);
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
