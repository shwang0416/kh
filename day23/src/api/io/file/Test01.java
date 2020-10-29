package api.io.file;

import java.io.File;

/*
 * java.io 패키지의 File 클래스 살펴보기
 * 	
 * 	파일 : 글자를 모아놓은 형태의 단위
 * => 텍스트 파일의 크기 = 모아진 글자의 크기(ASCII : 1byte. Unicode: 2byte)
 * 						윈도우에서 영어는 1, 한글은 2 byte
 * 
 *	파일의 종류
 *  - 텍스트 파일 :		글자 저장이 의미가 있는 파일
 *  - 바이너리 파일 :	글자이긴 하지만 전용프로그램으로만 열 수 있는 파일 
 *  (jpg, mp3, pdf, mp4, exe, zip ...) 
 */
public class Test01 {
	public static void main(String[] args) {
		
		//파일 객체 생성
		// = 경로 + 이름
		//객체를 생성하면 기존에 있던 이 파일을 제어할 수 있게 됨. 
		File a = new File("file", "hello.txt");
		File b = new File("file/hello.txt");
//		File c = new File("file\hello.txt"); 
//		역슬래시는 뒤에 하나씩 더 붙여줘야함 ex) \t, \\
		File c = new File("file\\hello.txt"); //역슬래시 두 개 붙이면 가능
		//원래 \\는 윈도우, /는 리눅스에서만 사용가능했으나 요즘에는 다 됨.
		
		//정보 분석
		System.out.println(a.exists()); //존재하나요?
		//객체 만들다가 오타나도 에러 안뜨는데 이 메소드로 파일이 있는지 체크해볼 수 있다.
		System.out.println(a.getName());//이름이 뭐에요?+".txt"로 끝나나요?
		System.out.println(a.getName().endsWith(".txt"));//".txt"로 끝나나요?
		System.out.println(a.getPath());//상대 경로가 어떻게 되세요?(상대 경로: 특정 기준점(프로젝트)을 기준으로 구하는 경로)
		System.out.println(a.getAbsolutePath());//절대 경로가 어떻게 되세요?(절대 경로: 전체 경로)
		System.out.println(a.length()); //파일안의 글자 수 -> 크기(byte)
		
		System.out.println(a.isHidden()); //숨김 상태인가요?
		System.out.println(a.canWrite());  //수정할 수 있나요?
		System.out.println(a.canRead());  //읽을 수 있나요?
		System.out.println(a.canExecute());//실행할 수 있나요?
	}
}
