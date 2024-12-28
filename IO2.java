package IO;

import java.io.File;
import java.io.*;

public class IO2 {

    public static void main(String[] args) {

       
        try {
            FileWriter writer = new FileWriter("IO2output.txt");
            writer.write("Hey this is from program 2 , ok tata bye bye");
            writer.append("ok tata bye bye");
            
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        
    }

}
