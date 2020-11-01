package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test03_2 {
	//목표: Writer 를 이용해서 문자열을 변환 없이 출력
	
	public static void main(String[] args) throws IOException {
		
		String text = "hello!";
		
		File target = new File("file/string2.txt");
		//FileWriter : FileOutputStream + .getBytes();
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		//출력
		pw.write(text);
		pw.println("hi");
		pw.println("안녕");
		pw.println(100);
		pw.println(3.14);
		pw.println(true);
		pw.print("hi");
		//콘솔출력 때 쓰는 println과 동일
		
		//pw.flush();
		pw.close();
		
	}

}
