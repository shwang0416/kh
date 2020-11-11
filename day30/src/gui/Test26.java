package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame26 extends JFrame{
	
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
	private JPanel root = new JPanel() {
		@Override
		public void paint(Graphics g) {
//			System.out.println("그림 그리는 메소드가 실행되었습니다!");
//			root가 도화지, g가 펜
			g.drawLine(50, 50, 150, 150); // (50,50)에서  (150,150)까지
			g.drawLine(50, 150, 150, 50); // (50,50)에서  (150,150)까지
			
			g.setColor(Color.red);
			//두께는 기본형에서 설정 안됨
			g.drawLine(50, 150, 150, 150);
			
			//사각형
			g.drawRect(100, 100, 200, 200);
			g.fillRect(100, 200, 40, 40);
			
			//원
			g.drawOval(100, 100, 200, 200);
			g.fillOval(100, 200, 40, 40);
		
//			다각형: polygon
//			문자열: string
		}
	};
	
	
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame26() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 26");
		this.setLocation(100, 100);
		this.setSize(400, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setVisible(true);
	}
}

public class Test26 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame26 frame = new MyFrame26();
	}
}