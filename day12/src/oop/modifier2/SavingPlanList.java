package oop.modifier2;

public class SavingPlanList {
	//멤버변수(인스턴스변수) -보통 private로 잠금처리
	private String name;
	private float basicRate;
	private float primeRate;
	private int monthlySaving;
	private int term;

	//멤버메소드(인스턴스메소드) - this를 사용할 수 있음
	void setName (String name) {
		this.name = name;
	}
	void setBasicRate(float basicRate) {
		if(basicRate > 0)
			this.basicRate = basicRate;
	}
	void setPrimeRate(float primeRate) {
		if(primeRate >= 0)
			this.primeRate = primeRate;
	}
	void setMonthlySaving(int monthlySaving) {
		if(monthlySaving == 100 || monthlySaving == 200 
				|| monthlySaving ==500 || monthlySaving == 1000)
			this.monthlySaving = monthlySaving;
	}
	void setTerm(int term) {
		if(term % 10 == 0 && term > 0)
			this.term = term;
	}
	
	void info(String name, float basicRate, float primeRate, int monthlySaving, int term) {
		setName(name);
		setBasicRate(basicRate);
		setPrimeRate(primeRate);
		setMonthlySaving(monthlySaving);
		setTerm(term);
	}
	void basePrint() {
		System.out.println("| "+"상품명"+" | "+ "기본이율"+" | "+ "우대이율" 
				+" | "+ "월 납입액" +" | "+"기간"+" |");
		System.out.println("| "+"---"+" | "+ "---"+" | "+ "---" 
				+" | "+ "---" +" | "+"---"+" |");
	}
	void print() {
		System.out.println("| "+name+" | "+ basicRate+"% | "+ primeRate 
				+"% | "+ monthlySaving +"만원 | "+term+"개월 |");
	}
	//+생성자(constructor)
	//+중첩클래스(nested class)

}
