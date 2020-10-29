package api.io.single;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
		//목표: byte 단위의 입출력을 이해하자
		//준비물 :
		//1. 파일 객체(File)
		//2. 입력일 경우 입력통로(FileInputStream), 		:
		//		출력일 경우 출력통로(FileOutputStream)	: 저장
		
		// Byte 출력
		// - 파일이 없으면 자동으로 생김 (있으면 덮어쓰기)
		// - 확장자도 이름일 뿐. 있어도 없어도 그만이고 아무렇게나 해도됨
		// 					(운영체제가 못알아들을 뿐)
		File target = new File("file", "single.kh");
/*
 * 생성자: FileOutputStream(File file) (throws FileNotFoundException)
	Creates a file output stream to write to the file 
	represented by the specified File object.
 */
		FileOutputStream out = new FileOutputStream(target);
		
		//[프로그램] -> out -> target -> [single.kh]
		// out에게 데이터(byte)를 전달하여 출력을 지시하면 
		// 물흐르듯이 single.kh파일에 들어간다.
		
		// .write으로 배운 것 써먹어보기
		out.write(65); // A
		out.write('B');
		out.write(9); //tab
		out.write(104); //h
		out.write(101); //e
		out.write(108); //l
		out.write(108); //l
		out.write(111); //o
		out.write(10); //\n
		
		out.write(30000); //30000을 넣었는데(byte범위초과) 48로 변해서 들어갔다 (byte)30000
		//=> 매개변수가 int지만 항상 byte값을 넣어야 한다!(주의)
		
		//통로는 다 썼으면 close해야한다 (Scanner와 같음)
		
		out.close();
	}
}
