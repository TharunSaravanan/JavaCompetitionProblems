/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravy;

/**
 *
 * @author Tharun Saravanan
 */
import java.util.*;
import java.io.*;
public class Gravy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyClass theObj = new MyClass( );
        theObj.gravy = 107.43;
        String s = "hello";
        int xray[] = {1, 2, 3, 4, 5};
        double floozy = 97.4;
        myMethod(floozy, theObj, xray, s);
        System.out.println(floozy); 
        System.out.println(theObj.gravy); 
        System.out.println(xray[2]); 
        System.out.println(s); 
    }
    
    public static void myMethod(double floozy, MyClass anObj, int a[], String s) {
        floozy = 13.1;
        anObj.gravy = 10.001;
        a[2] = 100;
        s = "good bye"; 
    }
}
