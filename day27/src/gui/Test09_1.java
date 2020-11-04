package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame09_1 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	
	//제목
	private JPanel top = new JPanel(new BorderLayout());
	private JLabel title = new JLabel("남은시간 : 2분 30초", JLabel.CENTER);
	
	//가운데 영역
	private JPanel center = new JPanel(new GridLayout(5, 5));
	
//	private int arr[] = new int[25];
//	private JButton bt[] = new JButton[25];
	private List <JButton> btlist = new ArrayList <JButton>();
	//아래 영역
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	private JButton finish = new JButton("완료");
	private JButton retry = new JButton("다시");
	private JButton close = new JButton("닫기");
	
	//멤버 메소드 : 배치기능
	public void place() {
		this.setLayout(new BorderLayout());
		this.add(top, BorderLayout.NORTH);
		top.add(title);
		
		this.add(center, BorderLayout.CENTER);
		
//		for(int i=0; i<25;i++) {
//			bt[i] = new JButton("click");
//			center.add(bt[i]);
//		}
		for(int i=0; i<25;i++ ) {
			btlist.add(new JButton("click"));
			center.add(btlist.get(i));
		}
		
		this.add(bottom, BorderLayout.SOUTH);
		bottom.add(finish);
		bottom.add(retry);
		bottom.add(close);
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame09_1() {
		this.place();
		this.setTitle("GUI 예제 09");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test09_1 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame09_1 frame = new MyFrame09_1();
	}
}