package etc.api.io.stream.practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutPutStrEx {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일명: ");
		String fileName = sc.next();
		
		FileOutputStream fos = null;
		
		try {
			fos= new FileOutputStream("C:/MyWork/" + fileName+ ".txt");
			System.out.println("문장 입력해요: ");
			sc.nextLine();
			String str = sc.nextLine();
			
			byte[] arr = str.getBytes();
			fos.write(arr);
			
			System.out.println("파일이 정상 저장");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
