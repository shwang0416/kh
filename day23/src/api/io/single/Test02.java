package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		File target =new File("file/single.kh");
		FileInputStream in = new FileInputStream(target);
		//single.kh 파일을 읽기 위한 도구들 : 파일 객체, 입력통로
		// - 주의: target은 무조건 존재하는 파일이어야 한다.
		
		//[프로그램] <- in <- target <- [single.kh]
		// in을 이용하여 파일의 데이터들을 1 byte씩 읽는다!
		
		//1.글자 수만큼 반복해서 읽는다.
		for(int i = 0; i < target.length(); i++) {
			int data = in.read(); 
			System.out.println("data ="+ data);
		}
		in.close();
		
		//2. while문을 이용해서 EOF까지 읽는다.
		// - EOF란? : End OF File. 파일 내용의 끝을 의미하는 값
		// EOF는 입력의 형태마다 다 다른 값을 가지며, 지금(바이트 입력)은 -1 
//										(예를 들어 String은 null) 
		while(true) {
			int data =in.read();
			if(data == -1) break; //EOF : -1
			System.out.println("data ="+data);
		}
	}
}
