package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;


public class Test02 {
	public static void main(String[] args) throws Exception {
		//멀티바이트 입력
		// - 준비물: 파일객체, 입력용 스트림, 버퍼 스트림, 복원 스트림
		//바이너리 파일을 읽으려면 그 파일의 구조를 알아야만 열 수 있는 것
		
		File target = new File("file", "multi.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in); 
		DataInputStream data = new DataInputStream(buffer);
		
		//[프로그램] <- data <- buffer <- in <- target <- [multi.txt]
		// - data를 이용하여 입력을 진행
		// - 읽어들여서 조립(복원)하는 것도 형태마다 명령이 다르다
		// - 반드시 출력된 순서로 입력을 받아야 한다.
		
		int a = data.readInt();
		char b = data.readChar();
		double c = data.readDouble();
		long d = data.readLong();
		byte e = data.readByte();
		float f = data.readFloat();
		
		data.close(); // flush는  출력만
		
		System.out.println(a);
	}
}
