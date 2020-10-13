package oop.basic2;

public class Test {

	public static void main(String[] args) {
		winterSportsScore a = new winterSportsScore();
		winterSportsScore b = new winterSportsScore();
		winterSportsScore c = new winterSportsScore();
		winterSportsScore d = new winterSportsScore();
		
		a.name = "이름";
		a.sports = "종목";

		b.name= "김연아";
		b.sports ="피겨스케이팅";
		b.gold= 2;
		b.silver = 0;
		b.copper = 1;
		
		c.name= "이상화";
		c.sports ="스피드스케이팅";
		c.gold= 1;
		c.silver = 2;
		c.copper = 1;
		
		d.name= "윤성빈";
		d.sports ="스켈레톤";
		d.gold= 1;
		d.silver = 0;
		d.copper = 1;
		
		System.out.println("|	"+a.name+"	|	"+a.sports+"	|	금메달	|	은메달	|	동메달	|");
		System.out.println("|	---	|	---	|	---	|	---	|	---	|");
		System.out.println(print(b));
		System.out.println(print(c));
		System.out.println(print(d));
	}
	
	public static String print (winterSportsScore p) {
		return "|	"+p.name+"	|	"+p.sports+ "	|	" + p.gold +"	|	"+ p.silver +"	|	"+p.copper;
	}

}
