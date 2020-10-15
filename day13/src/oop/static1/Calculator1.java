package oop.static1;

/*
 * TIP
 * 프로그래밍을 시작할 땐,
 * 제일 쉬운 부분부터 만들어 본다.
 * 전체를 보면 너무 많아져서 포기하기 쉬움
 *
 */

//더하기만 하는 계산기 만들기!

public class Calculator1 {
	//멤버변수
	private long a;
	private long b;
	
	//생성자
	
	public Calculator1(long a, long b) {
		this.a = a;
		this.b = b;
	}
	
	//합계 getter
	public long getTotal() {
		return this.a + this.b;
	}
}
