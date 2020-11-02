package api.server2;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Test01_2 {
	
	/*
	 * TCP 클라이언트 구현
	 * - 연결 생성만 필요(Socket 객체 생성)
	 * - 연결을 위해서는 IP/Port 정보가 필요하다
	 * - IP는 자기 자신일 경우 127.0.0.1이나 localhost라고 작성할 수 있다.
	 * - Port는 정해둔 값으로 사용(33333)
	 */
	public static void main(String[] args) throws IOException {
		
//		InetAddress test =InetAddress.getByName("aadfadf ad"); 
		//이래도 오류메시지를 띄우지 않음. 사용자가 맞게 입력하지 않았을 경우를 대비한 exception

		//준비작업
		InetAddress addr =InetAddress.getByName("112.221.47.69");	//선생님 IP주소
//		InetAddress addr =InetAddress.getByName("localhost");
		int port = 33333;
		
		//연결
		Socket socket = new Socket(addr, port); //IOException
//		Socket socket = new Socket("localhost", 33333); //이렇게도 가능
	
		//연결 이후에 수행할 작업
		System.out.println("안녕하세요~");
		//연결 종료
		socket.close();
	}
}
