package api.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Test01 {
	public static void main(String[] args) throws IOException {
		
		String text = "Hello";
		
		DatagramSocket ds = new DatagramSocket();
		DatagramPacket dp = new DatagramPacket(
				text.getBytes(),		//보낼 String
				text.getBytes().length, //그 String 길이
				InetAddress.getByName("127.0.0.1"),		
				// 127.0.0.1은 This같은 것
				// 자기자신의 IPv4주소를 의미함
				33333	// 포트 번호
			);
		
		ds.send(dp); //보내기
		ds.close();  //종료
	}
}
