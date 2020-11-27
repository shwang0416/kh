package test;

import beans.PersonDto;

public class Test03 {
	public static void main(String[] args) {
		//데이터준비
		PersonDto dto = new PersonDto();
		dto.setPerson_name("마사토끼");
		dto.setJavascore(90);
		dto.setDbscore(80);
		dto.setGender("여자");
	}
}
