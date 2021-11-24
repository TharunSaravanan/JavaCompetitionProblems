/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Tharun Saravanan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bc(6, 2);
    }

    public static void bc(int p, int q) {
        if (p / q == 0) {
            System.out.println(p + q + 1);
        } else {
            System.out.println(p);
            bc(p / q, q);
        }
    }

}
