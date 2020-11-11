package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

//나만의 창 클래스 템플릿(기본폼)
class MyFrame30 extends JFrame{

	private List<julian> julians = new ArrayList<> ();
	int x,y;
	private JPanel root = new JPanel() {

		@Override
		public void paint(Graphics g) {
			
			g.drawImage(julians.getImage(), 50, 100, this);
			root.repaint();
		}
	//멤버 메소드 : 배치기능
	public void place() {
		
		//root를 Frame의 ContentPane으로 설정
		// - 이제부터는 모든 컴포넌트는 this가 아니라 root에 추가
		this.setContentPane(root);
	}
	
	//멤버 메소드 : 이벤트 설정
	
	public void event() {
		//root에  MouseEvent를 설정
		root.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				//julian을 만들어 위치 정하고, 저장소에 추가한 뒤에 repaint
				for(int i = x; i <= 250; i++)  {
					root.repaint();
					
					//1000분의 24초만큼 휴식(24fps)
					Thread.sleep(24/1000);
				}
			}
		});

	}
	
	//멤버 메소드 : 메뉴 설정
	public void menu() {
		
	}
	
	//생성자 : 창에 대한 설정
	public MyFrame30() {
		this.place();
		this.menu();
		this.event();
		this.setTitle("GUI 예제 28");
		this.setLocation(100, 100);
		this.setSize(1500, 800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

}

public class Test28 {
	public static void main(String[] args) {
		//main에 더이상 모든 코드를 적지 않겠다
		MyFrame30 frame = new MyFrame30();
	}
}
