/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;

/**
 *
 * @author Tharun Saravanan
 */
public class BankAccount {
    
    private double balance;
    private String name;
    
    public BankAccount(double b, String n)
    {
        balance = b;
        name = n;
    }
    
    public void deposit(double amount)
    {
        balance += amount;
    }
    
    public void withdraw(double amount)
    {
        balance -= amount;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public String getName()
    {
        return name;
    }
}
