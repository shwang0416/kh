package gui;

import java.awt.FlowLayout;

import javax.swing.JButton;

//창 클래스(기본 폼)

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;

class MyFrame25 extends JFrame{
	private JPanel root = new JPanel(new FlowLayout());
	private JButton[] bt = new JButton[4];
	private String[] title =new String[] {
			"버튼1", "버튼2","버튼3","버튼4"
	};
	

	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		try {
			UIManager.setLookAndFeel(new AcrylLookAndFeel  ());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.setContentPane(root);
		for(int i = 0; i < bt.length; i++) {
			bt[i] = new JButton(title[i]);
			root.add(bt[i]);
		}
		
	}
	
	public MyFrame25() {
		this.setTitle("로그인화면");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(300, 150);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test25 {
	//클래스를 분리해 코드 짜기
	public static void main(String[] args) {
	MyFrame25 frame = new MyFrame25();	
	}
}
