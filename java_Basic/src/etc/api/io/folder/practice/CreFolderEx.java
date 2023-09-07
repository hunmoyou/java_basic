package etc.api.io.folder.practice;

import java.io.File;

public class CreFolderEx {
	
	public static void main(String[] args) {
		
		File file = new File("C:/MyWork/gym/heavy");
		
		if(!file.exists()) {
			file.mkdirs();
			System.out.println("파일 생성");
		}else {
			System.out.println("안돼");
		}
		
	}
	
}
