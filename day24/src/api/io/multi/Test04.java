package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test04 {
	/*
	 * 멀티바이트 입출력
		Test03
		[3, 5, 2, 1, 4] 를 배열로 만들고 이 배열에 들어있는 데이터를 files/numbers.txt에 저장하도록 구현
		
		Test04
		Test03에서 저장한 파일을 불러와서 화면에 출력하도록 구현
	 */
	public static void main(String[] args) throws Exception {
		File target =new File("file/numbers.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer =new BufferedInputStream(in);
		DataInputStream data =new DataInputStream(buffer);
		int i = 0,temp;
		while(true) {
			temp = data.read();
			if(temp == -1) break;
			System.out.println(temp);
		}
		
	}
}
