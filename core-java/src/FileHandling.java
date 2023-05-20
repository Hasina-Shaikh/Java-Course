
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class FileHandling {

	public void create(String s)
	{
	File file = new File(s);
	System.out.println("File Created Succussfully..!");
	}
	
	public void write(String s) throws IOException
	{
	String str = "Muskan";
	BufferedWriter writer = null;
	try {
	writer = new BufferedWriter(new FileWriter(s));
	writer.write(str);
	System.out.print("Written Succussful.");
	
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	public void printData(String s) throws IOException
	{
		String str = "Muskan";
		BufferedWriter writer = null;
		try {
		writer = new BufferedWriter(new FileWriter(s));
		writer.write(str);
		String s1 = s.hasNextLine();
		System.out.println(s1);
		}
		 catch (IOException e) {
				e.printStackTrace();
			}
	}
}
//		try {
//			File myObj = new File("New.txt");
//			Scanner my= new Scanner(myObj);
//			while(my.hasNextLine())
//			{
//				String data = my.nextLine();
//				System.out.println(data);
//			}	
//			my.close();
//		}
//		catch(Exception e)
//		{
//			 System.out.println("An error occured");
//			 e.printStackTrace();
//			
//		}
//	}

