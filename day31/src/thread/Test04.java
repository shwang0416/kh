package thread;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * 쓰레드 사용 시 주의사항
		 * 
		 * - 만들 때 필요한 설정을 다 해야한다.
		 * - 구동하기 시작하면 관리가 매우 어려움
		 * - 종속관계를 설정하지 않으면 main과 무관하게 할 일을 진행한다.
		 * 		(=> main이 일을 끝내도 본인 일이 있다면 계속함)
		 * 
		 * 		- .setDemon()
		 * 		- Thread가 복수라면 전부 종속/종속X으로 둘 중 하나를 택해야 함
		 * 			(=> 일부만 종속은 불가능) 
		 */
		Thread t =new Thread() {
			public void run() {
				//이 영역에 작성하면 t가 일을 처리합니다(별도의 스레드)
				for(int i=0;i<=100;i++) {
					System.out.println("i ="+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						
					}
				}
			};
		};
		t.setDaemon(true); //t에게 종속관계를 부여(main이 퇴근하면 같이 해라~)
		
		t.setName("종업원1");	
		t.setPriority(Thread.MAX_PRIORITY); //메모리가 부족할 때 우선순위 지정
							// (1:낮음 10:높음 5:보통)
							// 상수를 쓰면 좀 더 편하다.
		t.start();
		//t가 main에 종속되어있다.
		

		JOptionPane.showMessageDialog(null,	"안녕");
	}
}
