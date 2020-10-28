package api.collection3;

import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		/*
		 * Set
			Test04
			Pi와 Sigma가 올해 본 영화는 다음과 같습니다.
			
			Pi : 살아있다, 반도, 다만 악에서 구하소서, 다크나이트, 단 하루의 기적
			Sigma : 다크나이트, 사바하, 테넷, 반도, 살아있다
			둘 다 본 영화를 출력
			철수만 본 영화를 출력
			영희만 본 영화를 출력
			시청한 모든 영화 목록을 출력
		 */
		Set<String> pi = new TreeSet<>();
		pi.add("살아있다");
		pi.add("반도");
		pi.add("다만 악에서 구하소서");
		pi.add("다크나이트");
		pi.add("단 하루의 기적");
		Set<String> sigma = new TreeSet<>();
		sigma.add("다크나이트");
		sigma.add("사바하");
		sigma.add("테넷");
		sigma.add("반도");
		sigma.add("살아있다");
		
		//교집합 retainAll
		Set<String> both = new TreeSet<> (pi);
		both.retainAll(sigma);
		
		//차집합 pi - sigma removeAll
		Set<String> onlypi = new TreeSet<> (pi);
		onlypi.removeAll(sigma);
		
		//차집합 sigma - pi removeAll
		Set<String> onlysigma = new TreeSet<> (sigma);
		onlysigma.removeAll(pi);
		
		//합집합 addAll
		Set<String> all = new TreeSet<> (pi);
		all.addAll(sigma);
		
		//출력
		System.out.println("둘 다 본 영화: "+both);
		System.out.println("pi만 본 영화: "+onlypi);
		System.out.println("sigma만 본 영화: "+onlysigma);
		System.out.println("한 쪽이라도 본 모든 영화: "+all);
	}
}
