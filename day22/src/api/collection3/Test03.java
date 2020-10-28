package api.collection3;

import java.util.Set;
import java.util.TreeSet;

public class Test03 {
	public static void main(String[] args) {
		//Set은 "집합연산"에 특화되어 있다.
		// - 합집합 : 두 집합의 합
		// - 교집합 : 두 집합의 곱
		// - 차집합 : 두 집합의 차

		Set<Integer> a = new TreeSet<> (); //HashSet도 상관X
		a.add(10);
		a.add(20);
		a.add(30);
		
		Set<Integer> b = new TreeSet<> (); //HashSet도 상관X
		b.add(20);
		b.add(30);
		b.add(40);
		b.add(50);
		
		
		//합집합: 10 20 30 40 50
		//교집합: 20 30
		//a - b: 10
		// b -a : 40 50
		//중복은 자동으로 사라짐.
		
		//합집합: 비어있는 Set을 만들어서 a와 b를 몽땅 추가 (.addAll)
		Set<Integer> c = new TreeSet<> ();
		c.addAll(a);	//a를 c에 전부 추가
		c.addAll(b);	//b를 c에 전부 추가
		System.out.println(c);
		
		//교집합: retainAll
		Set<Integer> d = new TreeSet<> (a); //a를 복제해서 d를 생성
		d.retainAll(b);
		System.out.println(d);
		
		//차집합: removeAll
		Set<Integer> e = new TreeSet<> (a);
		e.removeAll(b); // a - b
		System.out.println(e);
	}
}
