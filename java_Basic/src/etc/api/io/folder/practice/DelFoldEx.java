package etc.api.io.folder.practice;

import java.io.File;

public class DelFoldEx {
	 
	public static void main(String[] args) {
		
		File file  = new File("C:/MyWork/heavy");
		file.delete();
		
		
	}
}
