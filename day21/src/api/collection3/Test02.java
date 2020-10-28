package api.collection3;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
//		이번주 로또 예상 번호를 "중복없이 내림차순"으로 출력하기 위한 저장소를 선택하시고 코드를 구현하세요
//		(로또 번호는 1부터 45개, 뽑는 개수는 6개)
		
//		Set은 중복이 나올 수 없는 구조

		
		Comparator<Integer> c = (a, b) -> a - b;
//		TreeSet(Comparator<? super E> comparator)
//		Constructs a new, empty tree set, sorted according to the specified comparator.
//		TreeSet의 생성자 중 comparator를 매개변수로 받는 생성자가 있다!
		
		//		TreeSet은 HashSet과 다르게 자동으로 순서를 정렬해 줌. (오름차순)
//		Set<Integer> lotto = new HashSet<>();
		Set<Integer> lotto = new TreeSet<>(c);
		
		Random r = new Random();
		
		while(lotto.size() < 6) {
			int n =r.nextInt(45) + 1;
			lotto.add(n);
		}
		
//		Collections.sort(lotto, c); //이미 생성된 뒤에 재정렬 불가능
		
		for(int n: lotto) {
			System.out.println("번호: "+ n);
		}
		
	}
}
