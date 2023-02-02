package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

public class Fileswrite {

	public static void main(String[] args) throws IOException   {
		File f = new File("C:\\Users\\admin\\Desktop\\Newhi\\image.txt");
	FileWriter fw = new FileWriter(f);
	fw.write("HI HEllo " );

		fw.write("Bye ");
		fw.flush();
		System.out.println("Created");
	}

}
