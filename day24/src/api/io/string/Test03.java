package api.io.string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test03 {
	//목표: Writer 를 이용해서 문자열을 변환 없이 출력
	public static void main(String[] args) throws IOException {
		
		String text = "hello!";
		
		File target = new File("file/string2.txt");
		//FileWriter : FileOutputStream + .getBytes();
		FileWriter fw = new FileWriter(target);
		//출력
		fw.write(text);//문자열 바로 출력
		
		//fw.flush();
		fw.close();
		
	}

}
