/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixaddition;

/**
 *
 * @author Tharun Saravanan
 */
public class MatrixAddition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4},{3,4,5}};    
        int b[][]={{1,2,3},{2,3,4},{3,4,5}};
        int c[][]=new int[3][3];
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < c.length; k++)
                    c[i][j] += a[i][k] * b[k][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
        
    }
}
    

