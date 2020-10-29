package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	/*
	 * 바이트 배열 입력
	 * 
	 * 준비물: 파일 객체, 입력용 스트림, 저장공간(바이트 배열, 버퍼)
	 * 	-> 배열 크기를 얼마로 하는 게 좋을까?
	 */
	public static void main(String[] args) throws IOException {
		File target = new File("file/array.txt");
		FileInputStream in = new FileInputStream(target);
		byte[] data = new byte[6];	//6글자씩 읽게 해보자
		

		//예상: 총 13글자니까 6 + 6 + 1
		//배열로 입력받을 때 가장 큰 문제는 몇 개를 읽었는지 알아내야한다는 것
		int size;
		while(true) {
			size = in.read(data); //준비된 data에 되는대로 채워라 (6개
			if(size == -1) break;
			System.out.println(size);
			System.out.println(Arrays.toString(data));
		}


	}
}
