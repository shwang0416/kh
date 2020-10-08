package Array;

public class Test07 {

	public static void main(String[] args) {
		/*
		 * 우리반 학생들의 시험점수가 다음과 같을 때 문제를 푸세요.
		 * {60, 80, 75, 85, 90, 95, 93, 77, 62, 85}
		 * 1. 우리반 학생시험점수의 평균을 구하여 출력(소수점 출력)
		 * 2. 만약 새로 들어온 학생의 점수가 82점이라면 이 학생은 몇 등인지 구해서 출력.
		 */
		
		int stu = 82;
		int score [] = new int [] 
				{60, 80, 75, 85, 90, 95, 93, 77, 62, 85, stu};
		
		double total = 0;
		int count = 1;
		for(int i = 0; i < score.length-1; i++) {
			total += score[i];
			if(score[i] > stu)
				count++;
		}
		double average = total/(score.length-1);
		double newAverage = (total+stu)/score.length;
		System.out.println("기존 반 평균점수 :	" + average);
		System.out.println("새로운 반 평균점수 :	" + newAverage);
		System.out.println("전학생 등수 :		"+ count);
		
	}

}
