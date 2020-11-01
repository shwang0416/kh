package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Test04 {
/*
 * Test03에서 구현한 내용 출력
 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File input = new File("file/numbers.kh");
		FileInputStream out = new FileInputStream(input);
		BufferedInputStream buffer = new BufferedInputStream(out);
		ObjectInputStream object = new ObjectInputStream(buffer);
		
		int [] arr = (int[])object.readObject();
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
