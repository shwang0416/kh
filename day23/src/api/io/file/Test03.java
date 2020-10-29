package api.io.file;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		//파일만 객체를 만들 수 있는 건 아니다
		// - 폴더도 되고, 드라이브도 가능
		
		File drive = new File("C:/"); //시디롬 같은 건 안됨
		System.out.println(drive.exists());
		System.out.println(drive.canRead());
		System.out.println(drive.canWrite());
		System.out.println(drive.canExecute());
		System.out.println(drive.isDirectory());	//디렉토리인가요?
	}
}
