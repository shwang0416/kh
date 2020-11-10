package thread;

import javax.swing.JOptionPane;

public class Test05 {
	public static void main(String[] args) {
		/*
		 * 쓰레드를 만드는 또 다른 방법
		 * - Runnable을 활용
		 * - Runnable은 start()가 없기 때문에 Thread를 결국 사용해야 한다.
		 */
		
//		Runnable r =new Runnable() {
//			@Override
//			public void run() {
//				//쓰레드에서 구동될 코드를 작성
//				System.out.println("커스텀 스레드!");
//			}
//		};
		//r.start();
		
//		Runnable은 함수형 인터페이스이므로 람다식 사용 가능
		Runnable r = ()-> {
			System.out.println("커스틈 스레드!!");
		};
		
		Thread t =new Thread(r);
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
