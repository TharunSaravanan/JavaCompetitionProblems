/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writeread;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author Tharun Saravanan
 */
public class WriteRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        writeToFile();
        readFile();
    }
    
    public static void readFile() throws IOException
    {
        Double[] test = new Double[1000];
        int i = 0;
        double sum = 0;
        double average = 0;
        
        File myObj = new File("C:\\Users\\Tharun Saravanan\\Desktop\\testfile");
        Scanner myReader = new Scanner(myObj);
        
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            test[i] = Double.parseDouble(data);
            sum += test[i];
            i++;  
        }
        average = sum / (i - 1);
        System.out.println(average);
        
        BufferedWriter testWriter = null;
        testWriter = new BufferedWriter(new FileWriter("C:\\Users\\Tharun Saravanan\\Desktop\\newfile.txt"));
        
        testWriter.write(Double.toString(average));
            
        testWriter.flush();
        testWriter.close();
    }
    
    public static void writeToFile() throws IOException
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of items");
        int length = in.nextInt();

        Integer[] numbers = new Integer[length];

        for (int j = 0; j < numbers.length; j++) {
            int c = j + 1;
            System.out.println("Enter item " + c);
            numbers[j] = in.nextInt();
        }
        
        BufferedWriter testWriter = null;
        testWriter = new BufferedWriter(new FileWriter("C:\\Users\\Tharun Saravanan\\Desktop\\testfile", true));
        for (int i = 0; i < numbers.length; i++) {
            testWriter.write(Integer.toString(numbers[i]));
            testWriter.newLine();
        }
        testWriter.flush();
        testWriter.close();
    }
    
}
