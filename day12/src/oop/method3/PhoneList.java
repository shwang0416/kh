package oop.method3;

public class PhoneList {
	String model;
	String carrier;
	int price;
	int contractTerm;
	
	void setModel(String model) {
		this.model = model;
	}

	void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	
	void setPrice(int price) {
		if(price >= 0)
			this.price = price;
		else
			System.out.println("잘못된 입력입니다.");
	}
	
	void setContractTerm(int contractTerm){
		if(contractTerm == 0 || contractTerm == 24 || contractTerm == 30 || contractTerm == 36)
			this.contractTerm = contractTerm;
		else
			System.out.println("잘못된 입력입니다.");
	}
	
	void setInfo(String model, String carrier, int price, int contractTerm) {
		setModel(model);
		setCarrier(carrier);
		setPrice(price);
		setContractTerm(contractTerm);
	}
	
	void basePrint() {
		System.out.println("| "+"이름"+ " | "+"통신사"+" | "+"가격"+" | "+"약정개월수"+" |");
		System.out.println("| "+"---"+ " | "+"-----"+" | "+"---"+" | "+"-------"+" |");
	}
	void print() {
		System.out.println("| "+model+ " | "+carrier+" | "+price+"만원 | "+contractTerm+"개월 |");
	}
}

