package api.server2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Test02_2 {
	public static void main(String[] args) throws IOException, IOException {
		//목표: 서버에 접속한 뒤 문장 하나를 서버에 전송하고 연결을 종료
		
//		InetAddress addr = InetAddress.getbyName("localhost");
//		String addr = "112.221.47.69";
		String addr = "localhost";
		int port = 33333;
		Socket socket = new Socket(addr, port);
		
		//문장을 전송하기 위한 준비
		// - OutputStreamWriter : socket의 출력부에 연결하여 내보낼 수 있는 writer(인코딩 지정가능)
//		지정안하면 한글 깨질 가능성 있음
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw =new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		pw.println("TCP통신 완료");
		pw.flush();//파일 통신과의 차이점. 네트워크는 실시간 전송이 생명!(무조건 출력 후 flush를 수행)
					//파일은 효율성이 우선될 경우가 있음(모아서 한번에 전송)
		
		socket.close();
		
	}
}
