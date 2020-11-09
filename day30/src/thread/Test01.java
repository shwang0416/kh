package thread;
//Single Thread
public class Test01 {
	public static void main(String[] args) {
		
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
