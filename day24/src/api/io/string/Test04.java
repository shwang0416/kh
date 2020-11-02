package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
	public static void main(String[] args) throws IOException {
		/*
		 * 파일에 있는 문자열을 입력받는 방법
		 *  - 어떻게 읽을 것인가?
		 *  
		 *  - FileReadr : 입력 + 복원 기능을 가진 스트림
		 *	- FileReader : 입력 + 복원 기능을 가진 스트림
			- BufferedReader : 버퍼 기능을 이용하여 한 줄을 모두 읽을 수 있다
			- PrintReader는 없다(무조건 문자열로 읽어들임)+
		
			- 장점 : 외장 버퍼 설정을 통한 성능 향상이 가능(스트림 조합이 가능)
			- 단점 : 문자열로만 입력이 가능하다
		 */
		
			File target = new File("file/string2.txt");
			FileReader fr =new FileReader(target);
			BufferedReader br =new BufferedReader(fr);
			
			//문자열 입력에서는 EOF가 null이다.
			//몇 줄인지 모르기 때문에 for문 못 씀
			while(true) {
				String line = br.readLine();
				if(line == null) break; //EOF
				System.out.println("line: "+line);
			}
			br.close();
	}
}
