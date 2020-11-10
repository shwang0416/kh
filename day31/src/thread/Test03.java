package thread;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {
		/*
		 * 1 개의 Thread는 동시에 1 개의 작업만 수행 가능
		 * (작업이 늘어나면 순서대로 진행된다) => 심즈3같음
		 */
		
		JOptionPane.showMessageDialog(null,	"안녕");
		for(int i=0;i<=100;i++) {
			System.out.println("i ="+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
