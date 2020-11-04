package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test03 {
	public static void main(String[] args) {
		
		//Frame 생성 코드 복붙 
		JFrame frame = new JFrame();//창 생성
		frame.setTitle("자바 그래픽 예제");
		frame.setLocation(300, 100);//왼쪽 위 모서리 위치(x, y) - px
		frame.setSize(400, 400);//크기(폭,높이) - px(pixel,화소)
		frame.setResizable(false);//창 크기변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//x를 누르면 프로그램이 종료되도록 설정
		
		//GridLayout을 이용하여 컴포넌트를 배치하는 방법
		GridLayout layout =new GridLayout(2,2,5,5); //가로칸수,세로칸수,가로갭,세로갭
		frame.setLayout(layout);
		
		//set Component
		JButton a =new JButton("HI");
		JButton b =new JButton("Click here");
		JButton c =new JButton("Drink me");
		JButton d =new JButton("Lol");
		
		frame.add(a);
		frame.add(b);
		//frame.add(b); 각각의 컴포넌트들은 한번씩만 추가가 가능
//		: List보다는 Set과 비슷한 성질이라고 할 수 있음
		frame.add(c);
		frame.add(d);
		//지뢰찾기, 계산기 만들 때 활용가능
		


		frame.setVisible(true);//창을 보이게 하는 명령
	}
}
