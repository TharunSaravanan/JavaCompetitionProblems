/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing1;

/**
 *
 * @author Tharun Saravanan
 */
public class Dog extends Animal {
   
    
    public Dog(String dogColor, int dogSize)
    {
        super(dogColor, dogSize);
        super.sound = "woof";
    } 
    
    public Dog()
    {
        super.sound = "woof";
    }
    
    public String sound()
    {
        return "abcd";
    }
    
}
