import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("New.txt");
      myWriter.write("Hello! I am Muskan Shaikh..");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

