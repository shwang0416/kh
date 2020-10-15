package oop.modifier5;

public class Test {

	public static void main(String[] args) {
		List p1 = new List();
		List p2 = new List();
		List p3 = new List();
		
		p1.info("PI", 170, 63);
		p2.info("J", 151, 50);
		p3.info("Yen", 180, 75);
		
		List.basePrint(); 
		/*static 메소드이므로 
		 * 클래스이름.메서드이름();
		 * 이렇게 호출
		*/
		//1.기본 정보 출력
		p1.print();
		p2.print();
		p3.print();
		
		//2.세명의 키 평균 출력 
		// 평균 = 합계 / 개수
		//:getter메소드 사용이유!
		double totalH = p1.getHeight()+p2.getHeight()+p3.getHeight();
		double averageH = totalH / 3.0;
		System.out.println("평균 키: "+averageH);
		
		//3.p1의 BMI 출력
		// BMI = 체중(kg) / 키(m) / 키(M)
		System.out.println(p1.getName()+"의 BMI:"+p1.getBMI());
	}

}
