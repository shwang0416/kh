package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test06 {
	public static void main(String[] args) {

		// Frame 생성 코드 복붙
		JFrame frame = new JFrame();// 창 생성
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		frame.setSize(300, 150);// 크기(폭,높이) - px(pixel,화소)
		frame.setResizable(false);// 창 크기변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x를 누르면 프로그램이 종료되도록 설정
		
		//1층 : JFrame - GridLayout
		//2층 : JPanel - 
		//3층 : 		
			//	id pw 	: 한쪽이 넓으면 BorderLayout (넓은 쪽이 Center), FLowLayout
			// login 버튼: 방향 설정해야하면 FlowLayout
		
		//2층 1번째 패널
		JPanel panel1 = new JPanel(new BorderLayout());
		
		JLabel idlabel = new JLabel("아이디", JLabel.CENTER);
		JTextField id = new JTextField("",20);
		
		panel1.add(idlabel, BorderLayout.WEST);
		panel1.add(id, BorderLayout.CENTER);
		
		
		//2층 2번째 패널
		JPanel panel2 = new JPanel(new BorderLayout());

		JLabel pwlabel = new JLabel("비밀번호", JLabel.CENTER);
		JTextField pw = new JTextField("",20);
		
		panel2.add(pwlabel, BorderLayout.WEST);
		panel2.add(pw, BorderLayout.CENTER);
		
		
		//2층 3번째 패널
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));

		JButton login = new JButton("login");
		panel3.add(login);
		
		//1층에 2층 패널들을 배치
		frame.setLayout(new GridLayout(3,1));
//		frame.setLayout(new GridLayout(3,1,5,5));
		
		//폭 설정 - 레이아웃이 있으면 setSize()로 설정이 안되고 setPrefferedSize()로 설정해야함
		idlabel.setPreferredSize(new Dimension(70,50));
		pwlabel.setPreferredSize(new Dimension(70,50));
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		

		
		



		
		frame.setVisible(true);// 창을 보이게 하는 명령
	}
}
