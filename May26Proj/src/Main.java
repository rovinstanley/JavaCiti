import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
      try {
          File fileObj1 = new File("read-example.txt");
          Scanner reader = new Scanner(fileObj1);
          System.out.println("Starting to read file");
          while (reader.hasNextLine()) ;
          {
              String data = reader.nextLine();
              System.out.println(data);
          }
          System.out.println("End of read file");
          reader.close();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }

    }
}
