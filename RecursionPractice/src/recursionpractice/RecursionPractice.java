/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpractice;

/**
 *
 * @author Tharun Saravanan
 */
public class RecursionPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result = fact(4);
    System.out.println(result);
  }
  public static int fact(int k) {
      
      if (k == 1){
          return 1;
      }

      return k * fact(k - 1);
  }
}
