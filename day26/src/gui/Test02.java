package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
/*
 * 목표: 앞에서 배운 창에 버튼과 같은 컴포넌트를 배치
 */
import javax.swing.JFrame;

public class Test02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();//창 생성
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300, 100);//왼쪽 위 모서리 위치(x, y) - px
		frame.setSize(400, 400);//크기(폭,높이) - px(pixel,화소)
		frame.setResizable(false);//창 크기변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 누르면 프로그램이 종료되도록 설정
		
		
		FlowLayout layOut = new FlowLayout();//flow형식의 자리배치 규칙
		//frame에 layout을 설정
		frame.setLayout(layOut);
		//버튼 배치
		JButton bt = new JButton("눌러봐!");
		JButton bt2 = new JButton("눌러봐!");
		
		//frame에 bt를 배치
		//frame이 주어가 되어 bt를 배치하는 것
		frame.add(bt);
		frame.add(bt2);

		frame.setVisible(true);//창을 보이게 하는 명령
		//항상 창 세팅 맨 마지막에 창을 보이게 해야한다.
	}
}