package api.io.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

//안녕하세요 의 텍스트파일크기는?
//=> 10 byte
//UTF-8이면 초중종성 구성이므로 15바이트
public class Test02 {
	/*
	 * File
		Test02
		file 폴더에 있는 hello.txt와 hello2.txt를 제어할 수 있도록 객체를 만들고 다음 내용을 출력
		
		파일 이름을 각각 출력
		파일 경로를 각각 출력
		크기가 큰 파일의 이름을 출력
		최신 파일의 이름을 출력
	 */
	public static void main(String[] args) {
		File hello = new File("file","hello.txt");
		File hello2 = new File("file/hello2.txt"); //확장자명 잊지말기
		
		//0. 파일 있는지 확인
		if(!hello.exists() || !hello2.exists()) {
			System.out.println("파일이 없습니다.");
			System.exit(-1);	//운영체제에게 전달할 상태메시지 : 일반적으로 0아니면 다 비정상
								// return도 되긴 하나 메소드에 쓰는 방식임
			}
		
		//1. 파일 이름 출력
		System.out.println(hello.getName());
		System.out.println(hello2.getName());
	
		//2. 파일 경로 출력
		//2 -(1).상대 경로
		System.out.println(hello.getPath());
		System.out.println(hello2.getPath());
		//2 -(2).절대 경로
		System.out.println(hello.getAbsolutePath());
		System.out.println(hello2.getAbsolutePath());
		
		//3. 둘 중 크기가 더 큰 파일의 이름을 출력(메소드로 만듬)
		System.out.println(isBigger(hello, hello2).getName());
		System.out.println("hello :"+hello.length()+ "hello2 :"+hello2.length());
		
		//3. 둘 중 더 최근에 수정된 파일의 이름을 출력(메소드로 만듬)
		System.out.println(isNewer(hello, hello2).getName());
		System.out.println("hello :"+hello.lastModified()+ "hello2 :"+hello2.lastModified());
		
		
		Date d = new Date(hello.lastModified());
		SimpleDateFormat f =new SimpleDateFormat("yyyy MM dd E h시 m분 s초");
		System.out.println(f.format(d));
	}
	
	public static File isBigger(File hello, File hello2) {
		if(hello.length() > hello2.length())
			return hello;
		else 
			return hello2;
		
	}
	
	public static File isNewer(File f, File f2) {
		if(f.lastModified()> f2.lastModified())
			return f;
		else
			return f2;
	}
}
