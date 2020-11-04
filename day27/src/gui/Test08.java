package gui;

//창 클래스(기본 폼)

import javax.swing.JFrame;

class MyFrame08 extends JFrame{

	//멤버 메소드: 이 클래스에 필요한 기능(코드)를 저장
	// - 컴포넌트 배치 기능, 이벤트 설정, 메뉴 설정
	// - 주인공(frame)은 this라고 부른다.
	public void place() {
		
	}
	
	public MyFrame08() {
		this.setTitle("로그인화면");
		this.place();
		this.setLocation(300, 100);// 왼쪽 위 모서리 위치(x, y) - px
		this.setSize(300, 150);// 크기(폭,높이) - px(pixel,화소)
		this.setResizable(false);// 창 크기변경 불가
		this.setVisible(true);// 창을 보이게 하는 명령
	}
}
public class Test08 {
	//클래스를 분리해 코드 짜기
	public static void main(String[] args) {
		
	}
}
