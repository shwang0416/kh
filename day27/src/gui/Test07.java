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

class LoginFrame extends JFrame{
	//멤버변수: 이 클래스에서 필요한 데이터들을 저장
	// - 화면을 구성하기 위한 컴포넌트들을 변수로 선언
	// - Jpanel 3개, JLabel 2개, JTextField 2개, JButton 1개
	
	private JPanel a = new JPanel(new BorderLayout());
	private JPanel b = new JPanel(new BorderLayout());
	private JPanel c = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	
	private JLabel lb1 = new JLabel("아이디", JLabel.CENTER);
	private JLabel lb2 = new JLabel("비밀번호", JLabel.CENTER);
	

	
	private JTextField f1 =new JTextField();
	private JTextField f2 =new JTextField();
	
	private JButton bt = new JButton("로그인");

	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		
		this.setLayout(new GridLayout(3,1));
		//this =>frame
		this.add(a);
		this.add(b);
		this.add(c);
		
		a.add(lb1, BorderLayout.WEST);
		a.add(f1, BorderLayout.CENTER);
		
		b.add(lb2, BorderLayout.WEST);
		b.add(f2, BorderLayout.CENTER);
		
		c.add(bt, BorderLayout.WEST);
		
		lb1.setPreferredSize(new Dimension(70,50));
		lb2.setPreferredSize(new Dimension(70,50));
	}
	
	public LoginFrame() {
		this.setTitle("로그인화면");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(300, 150);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test07 {
	public static void main(String[] args) {
		
		LoginFrame log = new LoginFrame();

	}
	
	
}