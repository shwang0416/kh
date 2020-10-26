package api.collection;

import java.util.ArrayList;
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
		while(winner.size() < 2) {
			num = (int)(Math.random()*5);
			System.out.println(num);
			System.out.println(list.get(num));
			if(!winner.contains(list.get(num))) {
				winner.add(list.get(num));
				System.out.println("넣음!");
			}
		}
		System.out.println(winner);
		
	}
}
