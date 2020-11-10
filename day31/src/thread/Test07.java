package thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame07 extends JFrame{
	//멤버변수: 이 클래스에서 필요한 데이터들을 저장
	// - 화면을 구성하기 위한 컴포넌트들을 변수로 선언
	// - Jpanel 3개, JButton 2개, JTextField 2개, JButton 1개
	
	private JPanel root = new JPanel(new BorderLayout());
	
	private JButton left = new JButton("빨강");
	private JButton right = new JButton("파랑");


	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		this.setContentPane(root);
		root.setLayout(new GridLayout(1,2));
		//this =>frame
		left.setBackground(Color.RED);
		right.setBackground(Color.BLUE);
		
		left.setPreferredSize(new Dimension(70,50));
		right.setPreferredSize(new Dimension(70,50));
		
	}
	int na = 0;
	@Override
	public void setBackground(Color bgColor) {
		Runnable r1 =()->{
			while(true){
				na++;
				if(na%2 ==0) {
					left.setBackground(Color.RED);
				}
				else {
					left.setBackground(null);
				}
				try {
					Thread.sleep(2000L);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					break;
				}
			}
		};
		Thread t1 =new Thread(r1);
		
		root.add(left);
		root.add(right);
		
		t1.setDaemon(true);
		t1.start();
	}
	
	public MyFrame07() {
		this.setTitle("번쩍번쩍");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(600, 150);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test07 {
	public static void main(String[] args) {
		
		MyFrame07 log = new MyFrame07();

	}
	
	
}