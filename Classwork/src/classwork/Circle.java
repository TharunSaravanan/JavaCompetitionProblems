package classwork;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tharun Saravanan
 */
public class Circle {
    
    double radius;
    
    public Circle(double r)
    {
        radius = r;
    }
    
    public double diameter()
    {
        double diameter = radius * 2;
        return diameter;
    }
}
