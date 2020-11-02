package api.server2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test01_1 {
	public static void main(String[] args) throws IOException {
		//서버 켜기
		//Test01을 실행하지 않고 Test02를 실행할수는 없음
		//서버 => 클라이언트
		
		//TCP Server 구현
		// - 서버를 만들겠다는 건 접속을 받겠다는 뜻이므로 상배방이 알 수 있는 IP와 Port를 지정해야 한다.
		// - ServerSocket : 접속을 받을 수 있는 도구(가게, 전화, ...)
		
		//서버 개방 코드
		ServerSocket server = new ServerSocket(33333);
		System.out.println("서버가 실행되었습니다.");
		
		//연결 수신코드(Socket을 얻어낸다)
		Socket socket = server.accept();
		System.out.println("사용자가 접속했습니다!");
		System.out.println(socket);
		
		//연결 후에 하고 싶은 작업 수행
		
		//
		socket.close();
	}
}
