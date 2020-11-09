package thread;
//Multi Thread
public class Test02 {
	public static void main(String[] args) {
		//두 가지 작업을 동시에 진행
		
		//Thread 생성 - run메소드를 "반드시"재정의(규칙)
		//이 안에 시킬 작업 넣음
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println("빨래돌리기!");
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}	
				
				System.out.println("빨래돌리기 끝!");
				System.out.println("빨래널기 시작!");
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
				System.out.println("빨래널기 끝!");
			}
		};
		t.start();//구동
		
		//main이 할 일
		System.out.println("청소 시작!");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("청소 끝!");
		System.out.println("요리 시작!");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
		}
		System.out.println("요리 끝!");
	}
}
