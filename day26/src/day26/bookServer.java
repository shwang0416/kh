package day26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class bookServer {
	public static void main(String[] args) throws IOException {
		fileSave("d");
	}
	
	public static void fileSave(String fileName) throws IOException{
		File a = new File("file", "hello.txt");
		String b = "file/"+fileName;
		File file = new File(b);
		FileOutputStream out = new FileOutputStream(file);
		ObjectOutputStream object =new ObjectOutputStream(out);
		object.writeObject(object.toString());
		object.close();
		
	}
}
