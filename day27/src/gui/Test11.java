package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;

//창 클래스(기본 폼)

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame11 extends JFrame{
	//폰트
	Font f =new Font("KoPub",Font.BOLD, 20);
	//제목
	
	private JLabel title = new JLabel("Survey", JLabel.CENTER);
	private JLabel question = new JLabel("카페에서 가장 좋아하는 음료는?",JLabel.CENTER);
	
	private JCheckBox c1 = new JCheckBox("얼죽아");
	private JCheckBox c2 = new JCheckBox("아이스초코");
	private JCheckBox c3 = new JCheckBox("허브티");
	
	private JPanel bottom = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	private JButton confirm = new JButton("제출");
	JCheckBox b1 = new JCheckBox("라이브러리");
	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		this.setLayout(new GridLayout(6,1));
		

		this.add(title);
		this.add(question);
		this.add(c1);
		this.add(c2);
		this.add(c3);
		this.add(bottom);
		bottom.add(confirm);
	}
	
	public MyFrame11() {
		this.setTitle("로그인화면");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(720, 400);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test11 {
	//클래스를 분리해 코드 짜기
	public static void main(String[] args) {
		MyFrame11 frame = new MyFrame11();
	}
}
