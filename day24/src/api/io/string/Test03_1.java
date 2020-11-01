package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Test03_2 {
	//목표: Writer 를 이용해서 문자열을 변환 없이 출력
	
	// - 문자열도 여러 개의 byte를 전송하는 형태이므로 "버퍼"를 쓰면 좋다.
	// - BufferedWriter를 사용하여 버퍼 성능 향상
	// - (기능상의 차이는 없음. 성능만 향상)
	
	// 문제점: byte와 문자열만 전송이 가능하며 다른 형태는 전송 안 됨
	public static void main(String[] args) throws IOException {
		
		String text = "hello!";
		
		File target = new File("file/string2.txt");
		//FileWriter : FileOutputStream + .getBytes();
		FileWriter fw = new FileWriter(target);
		BufferedWriter bw = new BufferedWriter(fw);
		//출력
		bw.write(text);//문자열 바로 출력
		
		//bw.flush();
		bw.close();
		
	}

}
