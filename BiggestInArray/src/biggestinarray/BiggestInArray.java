/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggestinarray;

/**
 *
 * @author tharun
 */
public class BiggestInArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] example = new int[]{1, 2, 4, 3, 324};

        int small = example[0];
        int big = example[0];

        for (int i = 0; i < example.length; i++) {

            if (big < example[i]) {
                big = example[i];
            }
            
            if (small > example[i]) {
                small = example[i];
            }

        }
            System.out.println("The biggest number is : " + big);
            System.out.println("The smallest number is : " + small);
    }
}
