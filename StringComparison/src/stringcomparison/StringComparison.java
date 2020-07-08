
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparison;

/**
 *
 * @author tharun
 */
public class StringComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String a = "and";
        String b = "but";

        int equal = 0;        
        int count = 0;
        
        if (a.length() < b.length()){           
            count = a.length();
        }
        else {
            count = b.length();
        }
        
        for (int i = 0; i < count; i++) {

            if (a.charAt(i) > b.charAt(i)) {
                equal = 1;               
                break;
            } 
            else if (a.charAt(i) < b.charAt(i)) {
                equal = -1;               
                break;
            }

        }

        System.out.println(equal);

    }

}
