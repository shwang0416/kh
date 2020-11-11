package gui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame31 extends JFrame{
	
	//멤버 변수 : 필요한 컴포넌트를 정의
	//- 모든 컴포넌트를 배치할 수 있는 ContentPane을 생성(JPanel)
	private JPanel root = new JPanel();
	
	//아이콘(Icon) : 컴포넌트(label, button등)에 삽입하는 이미지
	// - 크기변경이 불가능하며 바꾸고 싶다면 Image로 변환하여 조정한 뒤 다시 돌려야 한다.
	private ImageIcon icon = new ImageIcon("image/Julian_NH.png");
	private JButton bt =new JButton();
	//멤버 메소드 : 배치기능
	public void place() {
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
		
		root.setLayout(new BorderLayout());
		root.add(bt);
		
		
	}
	
	//멤버 메소드 : 이벤트 설정
	public void event() {
		/*
		 *버튼을 누르면 아이콘이 나타났다 사라졌다한다.
		 */
		bt.addActionListener(e->{
			if(bt.getIcon() == null) {
				bt.setIcon(icon);
			}
			else {
				bt.setIcon(null);
			}
		});
	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame31() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 31");
		this.setLocation(100, 100);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
}

public class Test31 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame31 frame = new MyFrame31();
	}
}
