package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) {
		List<File> disk = new ArrayList<File>();
		File f;
		for(char i = 'A';i <= 'Z';i++) {
			f =new File(i+":/");
			if(f.exists())
				disk.add(f);
		}
		System.out.println("드라이브 검색이 완료되었습니다.");
		System.out.println("결과 수 : "+ disk.size());
		for(File file: disk) {
			System.out.println(file.getAbsolutePath());
		} 
		
	}
}
