package oop.multi;
//여자이면서 의사이고 가수인 사람 클래스
//인터페이스의 상속키워드 implements. (<=> 클래스의 상속키워드 extends)
//인터페이스를 여러개 상속받을 때는 콤마(,)를 사용해서 구분한다.
//super는 class(여기서는 Female)만 지칭
public class Person extends Female implements Singer, Doctor{

	@Override
	public void heal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		
	}


	

}
