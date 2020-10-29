package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
/*
 * Test06
	사용자에게 경로를 입력받아 해당 경로에 따른 출력을 수행하세요
	
	경로가 "디렉터리"라면 내부 목록을 (파일/폴더) 구분하여 출력
	경로가 "파일"이라면 (파일명/파일크기/최종수정시각)을 구하여 출력
 */	
		File origin = new File("file/hello.txt"); //복사할 원본 origin
		File dest = new File("file/copy.txt"); //복사된 사본 destiniation

		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(dest);
		
		List<Integer> temp = new ArrayList<> ();		//저장해놓을 임시저장List 
		
		//1 글자만 복사
//		int data = in.read();
//		out.write(data);
		
		if(origin.exists()) {
			while(true) {
				int data = in.read();
				if(data == -1) break; //EOF : -1
				temp.add(data);
				//읽기 끝
			}
			
			for(int i = 0; i < temp.size(); i++) {
				out.write(temp.get(i));
			}
		}
		else {
			System.out.println("파일이 존재하지 않습니다.");
			System.exit(-1);
		}
		
	}
}
