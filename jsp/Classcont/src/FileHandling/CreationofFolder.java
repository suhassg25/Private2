package FileHandling;

import java.io.File;

public class CreationofFolder {

	public static void main(String[] args) {
		File f = new File("C:\\Users\\admin\\Desktop\\Newhi");	
		f.mkdir();
//		to check weather file is present or not
		System.out.println(f.exists()); 

	}

}
