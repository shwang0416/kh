package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		//바이트 배열 출력!
		//준비물 : 파일 객체, 출력용 스트림, 배열(칸수는 마음대로)
		
		File target = new File("file/array.txt");
		FileOutputStream out = new FileOutputStream(target);
	
		byte[] data = new byte[] {104, 101, 108, 108, 111, 10};
									// hello
		
		//인덱스 0부터 4까지만 출력하고 싶다면?
		//※ 프로그래밍 언어에서는 절대 '까지'의 개념이 없다!
		
		 out.write(data, 0, 4); // data에 들어있는 값을 0부터 4개 출력해라
		 out.write(data, 1, 4); // data에 들어있는 값을 1부터 4개 출력해라
		
		//연결되어있는 구조는 동일하다
		//[프로그램] -> out -> target -> [array.test]
		
		out.write(data);	//data에 들어있는 값을 다 출력해라
	}

}
