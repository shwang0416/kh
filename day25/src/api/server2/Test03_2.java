package api.server2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Test03_2 {
	/*
	 * 클라이언트
	 * 
	 * 서버에 접속하여 사용자가 입력한 메시지를 지속적으로 서버로 전송하는 코드를 구현
	 * 사용자가 정료라를 키워드를 입력하면 서버로 해당 키워드를 보내고 나서 서버와의 연결을 종료하도록 구현
	 */
	public static void main(String[] args) throws IOException, IOException {
		String addr = "localhost";
		int port = 33333;
		Socket socket =new Socket(addr, port);
		
		// - OutputStreamWriter : socket의 출력부에 연결하여 내보낼 수 있는 writer(인코딩 지정가능)
		OutputStreamWriter osw = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter bw = new BufferedWriter(osw);
		PrintWriter pw = new PrintWriter(bw);
		
		Scanner sc = new Scanner(System.in);
//		String [] arr = {"종료", "연어회", "치즈케이크", "맥주"};
//		while(true) {
//			int random = (int)(Math.random()*4)+0;
//			pw.println(random);
//			pw.println(arr[random]);
//			pw.flush();
//			if(arr[random].equals("종료")) break;
//		}
		while(true) {
			String input = sc.nextLine();
			pw.println(input);
			pw.flush();
			
			if(input == null || input.equals("종료")) {
				break;
			}
		}
		sc.close();
		socket.close();
	}
}
