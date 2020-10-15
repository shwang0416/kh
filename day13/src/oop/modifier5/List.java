package oop.modifier5;

public class List {

	private String name;
	private double height;
	private int weight;
	
	//info
	public void info(String name, int height, int weight) {
		setName(name);
		setHeight(height);
		setWeight(weight);
	}
	
	//print
	public static void basePrint() {
		System.out.println("| "+ "이름"+ " | "+ "키(cm)"+" | "+ "몸무게(kg)"+" |");
		System.out.println("| "+ ":---:"+ " | "+ ":---:"+" | "+ ":---:"+" |");
	}
	public void print() {
		System.out.println("| "+ name+ " | "+ height+" | "+ weight+" |");
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHeight(int height) {
		if(height > 0)
			this.height = height;
	}
	
	public void setWeight(int weight) {
		if(weight > 0)
			this.weight = weight;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public int getWeight( ) {
		return weight;
	}
	
	//존재하지 않는 변수의 getter도 생성가능
	public double getHeightMeter() {
		return height/100.0;
	}
	
	public double getBMI() {
		return weight/height/height * 10000;
	}
}
