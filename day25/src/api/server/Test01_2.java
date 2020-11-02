package api.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Test02 {
	public static void main(String[] args) throws IOException {
		//받는 프로그램 만들기
		
		//33333번 포트의 내용을 수신하는 우체국을 새엉
		DatagramSocket ds = new DatagramSocket(33333); //보낸 포트로 받아야함
		
		//어느 정도의 데이터를 수신할 것인지 미리 정한 다음 수신하도록 도구를 생성
		byte[] buffer = new byte[1024];
		
//		DatagramPacket dp = new DatagramPacket(//내용, 크기)
		DatagramPacket dp = new DatagramPacket(buffer, buffer.length);
		
//		우체국(ds)를 이용하여 편지(dp)를 수신
		ds.receive(dp);
		
//		분석
//		String text = new String(데이터, 시작위치, 개수)
		String text = new String(dp.getData(), 0, dp.getLength());
		System.out.println("text : "+text);
		
		//우체국 폐쇄
		ds.close();
	}
}
