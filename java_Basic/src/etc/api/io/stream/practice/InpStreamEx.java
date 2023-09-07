package etc.api.io.stream.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InpStreamEx {

	public static void main(String[] args)  {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("C:/MyWork/test.txt");
			
			byte[]arr = new byte[100];
			int result = fis.read(arr);
			System.out.println(Arrays.toString(arr));
			System.out.println(result);
			
			int i = 0;
			while(arr[i] !=0) {
				System.out.println((char)arr[i]);
				i++;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
