package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
/*
 * 지뢰찾기 상급만들기
 * 20줄 24칸
 * 
 */
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame10 extends JFrame{

	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	private Font f1 = new Font("koPub", Font.PLAIN, 15);
	private Font f2 = new Font("koPub", Font.BOLD, 30);


	private int col = 20;
	private int row = 24;
	
	private JPanel top = new JPanel(new BorderLayout());
	private JLabel title = new JLabel("지뢰찾기", new JLabel().CENTER);
	
	private JPanel center = new JPanel(new GridLayout(col, row));
	private List<JButton> list = new ArrayList<> (); 
	
	public void place() {
		this.setLayout(new BorderLayout());
		title.setForeground(new Color(240,240,240));
		top.setBackground(new Color(0,0,0));
		this.add(top,BorderLayout.NORTH);
		title.setFont(f2);
		top.add(title);
		this.add(center);
		
		List<Integer> numbers = new ArrayList<> (); 
		for(int i = 0; i <col*row; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		
		for(int j = 0; j <col*row; j++) {
			JButton tmp = new JButton(""+numbers.get(j));
			list.add(tmp);
			list.get(j).setForeground(new Color(255,255,255));
			if((j / row % 2 == 0 && j % 2==0)
					|| (j / row %2 ==1&& j % 2==1)) 
			{
			Color c1 = new Color(j/2,50,j/10);
				list.get(j).setBackground(c1);
			}
			else {
				Color c2 = new Color(40,40,40);
				list.get(j).setBackground(c2);
		}
			list.get(j).setCursor(new Cursor(Cursor.HAND_CURSOR));
			list.get(j).setFont(f1);
			center.add(list.get(j));
		}
	}
	
	public MyFrame10() {
		this.setTitle("지뢰찾기");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(1520, 1000);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test10 {
	//클래스를 분리해 코드 짜기
	public static void main(String[] args) {
		MyFrame10 ten =new MyFrame10();
	}
}
