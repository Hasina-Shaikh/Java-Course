
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileHandling fh = new FileHandling();
		fh.create("newfile.txt");
		fh.write("newfile.txt");
		fh.printData("newfile.txt");
	}
}
