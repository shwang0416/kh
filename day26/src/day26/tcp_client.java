package day26;

import java.net.InetAddress;
import java.net.Socket;

public class tcp_client {
	
	public void fileUpload() {

		int port = 3000;

		String serverIP = "localhost";

		try {

			serverIP = InetAddress.getLocalHost().getHostAddress();

			// 2. 소켓 객체 생성 : 생성과 동시에 서버에 연결 요청됨

			Socket socket = new Socket(serverIP, port);

			// 연결 실패는 null 리턴됨

			//이하 코드 중간 생략.....

		} catch (Exception e) {
				
		}
	}

}
