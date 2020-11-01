package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test03 {
/*
 * Test03
	[3, 5, 2, 1, 4] 를 배열로 만들고 
	이 배열에 들어있는 데이터를 
	files/numbers.kh에 저장하도록 구현
 */
	public static void main(String[] args) throws IOException {
		
		int [] arr = new int[] {3, 5, 2, 1, 4};
		
		File target =new File("file/numbers.kh");
		FileOutputStream out =new FileOutputStream(target);
		BufferedOutputStream buffer =new BufferedOutputStream(out);
		ObjectOutputStream object =new ObjectOutputStream(buffer);
		
		object.writeObject(arr);
	
//		object.flush();
		object.close();
	}
}
