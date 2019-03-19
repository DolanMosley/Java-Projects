import java.io.*;

public class SecondRunner {
	
	public static void main(String[] args) throws IOException {
		
		MondayProject info = new MondayProject();
		info.getInfo();
		info.writeToFile();
		info.testFileInfo();
		
		
	}

}
