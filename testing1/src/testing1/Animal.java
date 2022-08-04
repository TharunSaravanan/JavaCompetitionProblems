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
public class Animal {
    protected String color;
    protected int size;
    protected int move;
    protected String sound;
    
    public Animal(String animalColor, int animalSize)
    {
        color = animalColor;
        size = animalSize;
    }
    
    public Animal()
    {
        
    }
    
    public String sound()
    {
        return sound;
    }
    
    public void move()
    {
        move++;
    }
    
    public int getPos()
    {
        return move;
    }
}
