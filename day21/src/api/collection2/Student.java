package api.collection2;

public class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();//있으나 없으나
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
