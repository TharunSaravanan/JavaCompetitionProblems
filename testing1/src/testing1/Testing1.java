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
public class Testing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal[] animals = new Animal[100];
        
        Animal a = new Dog();
        Animal b = new Cat();
        
        System.out.println(a.sound());
        System.out.println(b.sound());
        
        for(int i = 0; i < animals.length; i++)
        {
            if(i % 2 == 0)
            {
                animals[i] = new Cat();
            }
            else
            {
                animals[i] = new Dog();
            }
            System.out.println(animals[i].sound());
        }
        
        
        
    }
    
}

