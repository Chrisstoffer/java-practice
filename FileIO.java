package IO;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("hey this writen from this io program!!! so cool ");
            writer.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
           System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
