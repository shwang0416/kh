package oop.modifier2;

public class Test {

	public static void main(String[] args) {
		SavingPlanList p1 = new SavingPlanList();
		SavingPlanList p2 = new SavingPlanList();
		SavingPlanList p3 = new SavingPlanList();
	
		p1.info("생애 최초 주택마련 적금", 2.3f, 0.5f, 100, 100);
		p2.info("내 꿈은 사장님 적금", 2.0f, 0.7f, 200, 20);
		p3.info("내 차는 스포츠카 적금", 2.1f, 1.1f, 500, 10);
		
		p1.basePrint();
		p1.print();
		p2.print();
		p3.print();
	}

}
