package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filered {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\admin\\Desktop\\Newhi\\image.txt");
		FileReader fw = new FileReader(f);
		char [] arr = new char[(int) f.length()];
		fw.read(arr);
		String s=new String(arr);
		System.out.println(s);

	}

}
