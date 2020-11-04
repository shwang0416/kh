package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {

		// Frame 생성 코드 복붙
		JFrame frame = new JFrame();// 창 생성
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		frame.setSize(400, 400);// 크기(폭,높이) - px(pixel,화소)
		frame.setResizable(false);// 창 크기변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x를 누르면 프로그램이 종료되도록 설정
		
		
		//BorderLayout
		// - 방향을 기준으로 배치
		BorderLayout layout = new BorderLayout();
		frame.setLayout(layout);
		
		JButton b1 =new JButton("NORTH");
		JButton b2 =new JButton("WEST");
		JButton b3 =new JButton("SOUTH");
		JButton b4 =new JButton("EAST");
		JButton b5 =new JButton("CENTER");
		
		
//		frame.add( , 방향);
		frame.add(b1, BorderLayout.NORTH);
		frame.add(b2, BorderLayout.WEST);
		frame.add(b3, BorderLayout.SOUTH);
		frame.add(b4, BorderLayout.EAST);
		frame.add(b5, BorderLayout.CENTER);
		//각 방향에는 1개씩 배치가능
		//CENTER가 중요한 레이아웃(무조건 있어야함)
		//무한도전 레이아웃..
		frame.setVisible(true);// 창을 보이게 하는 명령
	}
}
