/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;

import java.util.Scanner;

/**
 *
 * @author Tharun Saravanan
 */
public class Classwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testCircle();
        testBankAccount();
    }
    
    
    public static void testBankAccount()
    {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = info.nextLine();
        System.out.println("Enter your deposit amount: ");
        double deposit = info.nextDouble();
        
        BankAccount myAccount = new BankAccount(deposit, name);
        
        myAccount.deposit(505.22);
        System.out.println(myAccount.getBalance());
        
        myAccount.withdraw(100);
        System.out.println("The " + myAccount.getName() + " account balance is, $" + myAccount.getBalance());
    }
    
    public static void testCircle()
    {
        Circle cir1 = new Circle(20.6);       
        System.out.println(cir1.diameter());
    }
    
}
