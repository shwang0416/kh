package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//객체의 출력
		// [프로그램] -> object -> buffer -> File -> [object.text]
		// object는 원시형 데이터 뿐 아니라 객체도 전송할 수 있다.
		 
		Date d = new Date();
		
		File target = new File("file/object.txt");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer =new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		object.writeObject(d);
		
		//object.flush
		object.close();
	}
}
