package oop.basic2;

public class winterSportsScore {
	String name;
	String sports;
	int gold;
	int silver;
	int copper;
	
	
	
	void print() {
		System.out.println("----------------------------");
		System.out.println("이름: "+this.name);
		System.out.println("종목: "+this.sports);
		System.out.println("금메달: "+this.gold+" 개");
		System.out.println("은메달: "+this.silver+" 개");
		System.out.println("동메달: "+this.copper+" 개");
		System.out.println("----------------------------");
		System.out.println();
	}

	//초기화할 메소드 == 생성자
	public void info(String name, String sports, int gold, int silver, int copper) { 
		//매개변수(준비물) ==외부 데이터를 전달받는 것

		this.name = name;
		this.sports = sports;
		this.gold = gold;
		this.silver = silver;
		this.copper = copper;
	}

}
