package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;

//창 클래스(기본 폼)

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Myframe24 extends JFrame {
	// 폰트
	private JPanel root = new JPanel(new FlowLayout());
	private JButton[] bt = new JButton[4];
	private String[] title =new String[] {
			"버튼1", "버튼2","버튼3","버튼4"
	};
	
	public void place() {
		
		this.setContentPane(root);
		for(int i = 0; i < bt.length; i++) {
			bt[i] = new JButton(title[i]);
			root.add(bt[i]);
		}
	}

	
	/*
	 * e.getActionCommand() : 이벤트 발생한 컴포넌트의 글자를 반환(ActionEvent에만 있다)
	 * e.getSoruce() : 이벤트 발생한 컴포넌트를 반환 (모든 이벤트 )
	 */
	
	public void event() {
		ActionListener listener = e ->{
			System.out.println("이벤트 발생!");
			//System.out.println(e.getActionCommand());
			//System.out.println(e.getSource());
			
			if(e.getSource() == bt[0]) {
				System.out.println(bt[0].getText()+"감지!");
			}
		};
		
		
		for(int i=0; i < bt.length; i++) {
			bt[i].addActionListener(listener);
		}
	}

	public Myframe24() {
		this.setTitle("로그인화면");
		this.place();
		this.event();
		this.setTitle("계산기");
		this.setLocationByPlatform(true);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(400, 500);// 크기(폭,높이) - px(pixel,화소)
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);// 창 크기변경 불가

		this.setVisible(true);// 창을 보이게 하는 명령
	}
}

public class Calculator2 {
	// 클래스를 분리해 코드 짜기
	public static void main(String[] args) {
		Myframe24 frame = new Myframe24();
	}
}
