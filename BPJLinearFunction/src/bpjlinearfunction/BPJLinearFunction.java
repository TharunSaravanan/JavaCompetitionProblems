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
public interface BPJLinearFunction {

    double getSlope();

    double getYintercept();

    double getRoot();

    double getYvalue(double x); 

    double getXvalue(double y);
}

