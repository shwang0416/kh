package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test05 {
	public static void main(String[] args) throws IOException {
		// - "내가 만든 클래스"의 객체 출력
		// - 원래 객체 입출력은 아무 객체나 되는 것이 아니라 "인증마크(자격)"이 있어야 한다.
		// - 내가만든 클래스의 객체에 자격을 부여하려면 그 클래스가 상속을 받아야한다. =>
		//		Serializable 인터페이스(마킹 인터페이스 : 자격 부여를 위한 인터페이스)
		
		Student stu = new Student("May",50);
		
		//import 단축키는 ctrl + shift + o
		File target = new File("file", "student.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream object = new ObjectOutputStream(buffer);
		
		object.writeObject(stu);

	
		object.close();
	}
}
