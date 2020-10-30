package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test03 {
/*
 * 멀티바이트 입출력
	Test03
	[3, 5, 2, 1, 4] 를 배열로 만들고 이 배열에 들어있는 데이터를 files/numbers.txt에 저장하도록 구현
	
	Test04
	Test03에서 저장한 파일을 불러와서 화면에 출력하도록 구현
 */
	public static void main(String[] args) throws Exception {
		//여러 개의 형태를 섞어서 출력하기보다 하나의 형태를 입출력하는 경우가 많다.
		
		//준비물 : 파일 객체, 출력용 스트림, 버퍼 스트림, 분할 스트림
		File target =new File("file/numbers.txt");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data =new DataOutputStream(buffer);
		
		//data를 이용하여 출력
		int [] num = new int[] {3, 5, 2, 1, 4};
		for(int n : num) {
			data.writeInt(n);
		}
		data.flush();//보내라
		data.close();//더이상 출력 안할거다
		
		// 멀티바이트는 보내는 과정에서 분할되었기 때문에 이클립스상에선 보이지 않음
		// in으로 읽어와봐야 안다
	}
}
