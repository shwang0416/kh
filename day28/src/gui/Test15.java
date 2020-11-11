package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame15 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	
	//Font
	private Font f =new Font("Kopub", Font.BOLD,40);
	private Font f2 =new Font("Kopub", Font.BOLD,20);
	//Border
	private Border b =new LineBorder(Color.RED, 5);
	
	private int time = 0;
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	private JLabel label =new JLabel(String.valueOf(time), JLabel.CENTER);
	private JPanel bottom = new JPanel(new GridLayout(1,3));
	
	private JButton start =new JButton("start");
	private JButton stop =new JButton("stop");
	private JButton reset =new JButton("reset");
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		root.setLayout(new BorderLayout());
		
		root.add(label, BorderLayout.NORTH);
		root.add(bottom, BorderLayout.CENTER);
		
		label.setFont(f);
		label.setBorder(b);
		
		
		bottom.add(start);
		bottom.add(stop);
		bottom.add(reset);
		start.setFont(f);
		stop.setFont(f);
		reset.setFont(f);
		
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		start.addActionListener(e ->{
			
		});
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame15() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 15");
		this.setLocation(100, 100);
		this.setSize(500, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test15 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame15 frame = new MyFrame15();
	}
}
