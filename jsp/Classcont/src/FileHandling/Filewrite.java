package FileHandling;

import java.io.File;
import java.io.IOException;

public class Filewrite {


	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\admin\\Desktop\\Newhi\\Image.html");	
		f.createNewFile();
		System.out.println("Created folder");
	}

}
