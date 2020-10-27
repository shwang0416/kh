package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test06 {
	public static void main(String[] args) {
		/*
		 * 철수, 영희, 영수, 민지, 미영, 민수가 해외여행을 다녀왔습니다.
		 * 여행 경비에서 남은 돈이 60만 원입니다.
		 * 추첨을 통해서 2명에게 몰아주려 합니다.
		 * 추첨결과에 중복이 없도록 프로그래밍 하세요.
		 */
		List<String> list = new ArrayList<> ();
		List<String> winner = new ArrayList<> ();
		list.add("철수");
		list.add("영희");
		list.add("영수");
		list.add("민지");
		list.add("미영");
		list.add("민수");
		int num;
		
		//똑같은게 나올 수 있으면 복원, 절대 안나오면 비복원
		
		//1. 복원추출 
		//(랜덤한 위치에서 1번 뽑음 => 1번 뽑음 => 두 번째로 뽑은 것이 뽑힌 리스트에 있는지 확인)
		while(winner.size() < 2) {
			num = (int)(Math.random()*5);
			System.out.println(list.get(num));
			if(!winner.contains(list.get(num))) {
				winner.add(list.get(num));
			}
		}
		System.out.println(winner);
		//2. 비복원추출 (shuffle) 
		//	섞어야하는 전체 데이터값이 커지면 비효율적
		//	복권문제도 이렇게 풀어도 됨
		Collections.shuffle(list);
		
//		2. -(1) 리스트에서 String 두 개 뽑기
		winner.set(0, list.get(0));
		winner.set(1, list.get(1));
//		2. -(2) 리스트에서 List<String> 뽑기 ☆
//		(뽑아야 할 대상이 한 개 이상이므로 현재상황에서 가장 적합)
//		(숫자가 늘어나거나 변동이 많아질 수록 유리해짐)
		winner = list.subList(0, 2); //index 0부터 2개 뽑음
		
		
		
		System.out.println(winner);
	}
}
