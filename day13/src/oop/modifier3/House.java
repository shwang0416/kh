package oop.modifier3;

//집 = 지역 + 평수 + 가격
public class House {
	//멤버변수(인스턴스변수) - 반드시 잠금처리 (setter => 필터링)
	private String area;
	private int size;
	private int price;
	
	//멤버메소드(인스턴스메소드) -공개처리
	
	//setter메소드
	//앞에 접근제한자 안쓰면 package 쓴 것과 같은 효과
	public void setArea(String area) {
		this.area =area;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//getter메소드 :반환처리
	
	public String getArea() {
		return area;
		
		//== return this.area;
		//내가 가진 area값을 반환하며 종료해라
		
		//null: (저장된)내용이 없다.
		//<=> void: 반환값이 없다.
	}

	public int getSize() {
		return size;
	}
	
	public int getPrice() {
		return price;
	}

}
