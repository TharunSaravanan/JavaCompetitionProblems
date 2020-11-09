/*
 * Find square root for a perfect square using simple for loop
 */
package squareroot;

import java.util.Scanner;

/**
 *
 * @author tharun
 */
public class SquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your perfect square");
        int number = in.nextInt();

        int answer = 0;

        for (int i = 1; i <= number / 2; i++) {

            if (number == i * i) {

                answer = i;

                break;
            }

        }

        if (answer == 0) {

            System.out.println("Your number is not a perfect square!");
        }
        else{
            
             System.out.println("the square root is " + answer);
        }  
    }

}
