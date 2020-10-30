package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Test01 {
	/*
	 * 멀티바이트(multibyte)의 입출력
	 */
	public static void main(String[] args) throws Exception {
		//멀티바이트 출력
		// - 준비물 : 파일 객체, 출력용 스트림, 버퍼(스트림), 분해도구(스트림)
		// - byte[]은 제어가 수월하지 않으므로 클래스 형태로 제어하기 쉽게 구성해두었다.
		File target = new File("file/multi.txt");	
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out/*, 8912*/);
		DataOutputStream data = new DataOutputStream(buffer);//버퍼가 준비한 byte크기
		
		//[프로그램] -> data -> buffer -> out -> target -> [multi.txt]
		//출력은 data를 이용하여 진행
		data.writeInt(100); //100을 int형태로 분해하여 저장(출력)하라!
		data.writeChar(100); //100을 char형태로 분해하여 저장(출력)하라!
		data.writeDouble(100); //100을 double형태로 분해하여 저장(출력)하라!
		data.writeLong(100); //100을 long형태로 분해하여 저장(출력)하라!
		data.writeFloat(100); //100을 float형태로 분해하여 저장(출력)하라!
		
		//기본자료형 중 byte보다 큰 것은 전부 명령어가 있음
		
		//문제점:
		//버퍼는 애초에 빠른 전송을 위해 임시 저장을 하는 목적으로 만들어졌다.
		//현재 8192칸 중에 27칸만 사용 중이기 때문에 "더 들어올 것"이라고 생각한다.
		//해결:
		// - 이제 그만 보낼 예정이니까 그냥 남은 데이터를 전송하라고 얘기한다(: flush)
		data.flush(); 	//강제 전송
//		buffer.flush(); //버퍼한테 말해도 되는데 data한테 해도 어차피 흐름 따라 버퍼도 그만함
	
		data.close();	//강제 전송 + 통로 소멸
		//data하나 닫으면 연결된 통로는 자동 닫힘
		
		
		
	}	
}
