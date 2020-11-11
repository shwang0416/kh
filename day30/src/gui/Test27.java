package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame27 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	//- 목표: root라는 JPanel에 어떻게 하면 그림을 그릴 수 있는가?
	//- 가장 유사한 프로그램은 그림판
	
	//- 모든 컴포넌트는 paint() 메소드로 그림을 그리게 되어 있다.
	//- 내마음대로 그림을 그리고 싶다면 paint 메소드를 재정의해야한다. => 익명중첩클래스!!!
	/*
	 * paint가 실행되는 상황
	 * 1. 최초 실행시 자동 호출
	 * 2. 크기 변경시 자동 호출 : 크기 변화로 인해 추가되거나 제거되는 부분을 표현하기 위해
	 * 3. 내가 원하는 시점에 호출: .repaint() 명령
	 */
	private Image image = Toolkit.getDefaultToolkit().getImage("img/Julian_NH.png");
	
	private int width = 100;
	private int height = 100;
	private int x = 100;
	private int y = 100;
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
			g.clearRect(0,0,getWidth(), getHeight());
			g.drawImage(image, x, y,this);
		};
	};
	
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		small.addActionListener(e-> {
			//뭐라고 써야 그려진 사각형이 작아질까??
			// - 가로 세로 값만 변경
			// - 폭과 높이를 -20씩 변경하고 다시 그려라
			width -=20;
			height-=20;
			root.repaint();
		});
		big.addActionListener(e-> {
			width +=20;
			height+=20;
			root.repaint();
		});
		up.addActionListener(e-> {
			y-=20;
			root.repaint();
		});
		down.addActionListener(e-> {
			y+=20;
			root.repaint();
		});
		left.addActionListener(e-> {
			x-=20;
			root.repaint();
		});
		right.addActionListener(e-> {
			x+=20;
			root.repaint();
		});
	}
	
	private JMenuBar bar =new JMenuBar();
	
	private JMenu menu = new JMenu("메뉴");
	private JMenuItem small = new JMenuItem("작게");
	private JMenuItem big = new JMenuItem("크게");
	private JMenuItem up = new JMenuItem("위로");
	private JMenuItem down = new JMenuItem("아래로");
	private JMenuItem left = new JMenuItem("왼쪽으로");
	private JMenuItem right = new JMenuItem("오른쪽으로");
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		this.setJMenuBar(bar);
		bar.add(menu);
		menu.add(small);
		menu.add(big);
		menu.add(up);
		menu.add(down);
		menu.add(left);
		menu.add(right);
		

	}
	
	//생성자 : 창에 대한 설정
	public MyFrame27() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 27");
		this.setLocation(100, 100);
		this.setSize(1200, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}

public class Test27 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame27 frame = new MyFrame27();
	}
}