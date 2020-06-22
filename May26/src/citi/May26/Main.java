package citi.May26;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try{
            System.out.println("Starting program");
            File fileObj = new File("test.txt");
            if(fileObj.exists())
            {
                System.out.println("File Exists");
                Scanner reader = new Scanner(fileObj);
                while (reader.hasNextLine())
                {
                    String data = reader.nextLine();
                    System.out.println(data);
                }
                reader.close();
            }
            File fileObj1 = new File("read-example.txt");
            if(fileObj1.delete())
            {
                System.out.println("Delete the file from: "+fileObj1.getAbsolutePath());
            }
            else
            {
                System.out.println("Unable to delete file");
            }

        }
        catch(Exception e ){
            e.printStackTrace();
        }
    }
}
