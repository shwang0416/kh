package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class Test06 {
/*
 * 내가 만든 객체 입력(Test04 수정)
 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File input = new File("file/student"
				+ ".kh");
		FileInputStream out = new FileInputStream(input);
		BufferedInputStream buffer = new BufferedInputStream(out);
		ObjectInputStream object = new ObjectInputStream(buffer);
		
		Student stu = (Student)object.readObject();
		
		object.close();
		System.out.println(stu.getName());
		//May
		System.out.println(stu.getScore());
		//입출력 제한키워드 transient때문에 0출력
	}
}
