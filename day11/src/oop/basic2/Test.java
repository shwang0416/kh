package oop.basic2;

public class Test {

	public static void main(String[] args) {
		winterSportsScore a = new winterSportsScore();
		winterSportsScore b = new winterSportsScore();
		winterSportsScore c = new winterSportsScore();
		winterSportsScore d = new winterSportsScore();
		
		a.name = "이름";
		a.sports = "종목";
		
		b.info("김연아","피겨스케이팅",2,0,1);
		c.info("이상화", "스피드스케이팅",1,2,1);
		d.info("윤형빈", "스켈레톤", 1,0,1);

		b.print();
		c.print();
		d.print();
		
	}
	
	
}
