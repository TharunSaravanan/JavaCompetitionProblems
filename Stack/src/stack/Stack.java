
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stack;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Tharun Saravanan
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter your brackets ");
        String brackets = in.nextLine();
        
        if(brackets.length() % 2 != 0) {
            System.out.println("Not valid");
            return;
        }
        
        Stack<String> bracket = new Stack<String>();
        
        for(int i = 0; i < brackets.length(); i++)
        {
            if(brackets.charAt(i) == '(')
            {
                bracket.add("(");
            }
            else
            {
                if(bracket.empty())
                {
                    System.out.println("invalid");
                    return;
                }
                bracket.pop();
            }

        }
        System.out.println("Valid");
    }
    
}
