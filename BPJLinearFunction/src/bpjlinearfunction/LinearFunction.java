/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bpjlinearfunction;

/**
 *
 * @author Tharun Saravanan
 */
public class LinearFunction implements BPJLinearFunction 
{
    private double m;
    private double b;
    
    public LinearFunction(double slope, double intercept)
    {
        m = slope;
        b = intercept;
    }
    
    @Override
    public double getSlope() {
        return m;
    }

    @Override
    public double getYintercept() {
        return b; 
    }

    @Override
    public double getRoot() {
        return(-b/m);
    }

    
    public double getYvalue(double x) {
        return(m*x + b);
    }

    @Override
    public double getXvalue(double y) {
        return((y-b)/m); 
    }
    
}
