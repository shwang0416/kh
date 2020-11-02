package api.server2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Test03_1 {
	public static void main(String[] args) throws IOException {
		/*	
		 * 서버
		 * 
		 * 사용자 1명의 접속을 받아 사용자가 보내는 모든 내용을 수신하도록 구현
		 * 사용자에게서 "종료"라는 키워드가 도착한다면 모든 연결을 종료하고 서버를 닫으세요.
		 * 
		 */
		ServerSocket server = new ServerSocket(33333);
		Socket socket =server.accept();
		
		InputStreamReader isr = new InputStreamReader(socket.getInputStream(), "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String line = br.readLine();
			System.out.println("line: "+line);
			if(line == null || line.equals("종료")) break; // 종료
		}
		socket.close();
		server.close();
	}

}
