package oop.constructor3;

public class Test {

	public static void main(String[] args) {
		Charactor c1 = new Charactor("PI", "전사");
		Charactor c2 = new Charactor("Jin", "마법사");
		Charactor c3 = new Charactor("Cat", "마법사", 3, 5000);

		
		Charactor.basePrint();
		c1.setLevel(3);
		c2.setMoney(500);
		c1.print();
		c2.print();
	}

}
