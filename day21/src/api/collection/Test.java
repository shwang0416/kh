package api.collection;

public class Test {
	public static void main(String[] args) {
		//Anonymous class 익명 클래스
//		상속용으로 클래스를 만들기는 귀찮아서
//		일회용으로 상속받아 씀
//		"함수형 객체"라고 쓴다.
		
		Car a = new Car() {
			@Override 
			public void drive() {
				System.out.println("부릉부릉");
			}
		};
		a.drive();
		
		Car b = new Car() {

			@Override
			public void drive() {
				System.out.println("뛰뛰빵빵");
			}
		};
		b.drive();
	
		//추론(Lambda)식 : 상식적으로 추리가능한 내용이라면 다 적지 않아도 완성시켜준다.
		
		Car c = ()->{	//drive메소드의 ()
			System.out.println("붕붕");
		};
		c.drive();
	}
	
}
