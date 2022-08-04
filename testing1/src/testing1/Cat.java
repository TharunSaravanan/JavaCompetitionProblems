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
public class Cat extends Animal {
    
    public Cat(String catColor, int catSize)
    {
        super(catColor, catSize);
        super.sound = "meow";
    } 
    
    public Cat()
    {
        super.sound = "meow";
    }
    
}
