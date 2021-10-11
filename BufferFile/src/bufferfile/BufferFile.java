/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bufferfile;
import java.util.*;
import java.io.*;

/**
 *
 * @author Tharun Saravanan
 */
public class BufferFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        int totalRecords = 1000000000;

        File file = new File("C:\\temp\\filewritertest.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        
        long start = System.currentTimeMillis();
        for(int i = 0; i < totalRecords; i++)
        {
            writer.write(Integer.toString(i));
        }
        writer.flush();
        writer.close();
        long finish  = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println(timeElapsed);
        
        BufferedWriter testWriter = null;
        testWriter = new BufferedWriter(new FileWriter("C:\\temp\\bufferedwritertest.txt"));
        
        start  = System.currentTimeMillis();
        for (int i = 0; i < totalRecords; i++) {
            testWriter.write(Integer.toString(i));
        }
        testWriter.flush();
        testWriter.close();
        
        finish  = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println(timeElapsed);
    }
    
}
