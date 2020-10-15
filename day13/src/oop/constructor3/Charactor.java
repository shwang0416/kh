package oop.constructor3;

public class Charactor {
	private String id;
	private String job;
	private int level;
	private int money;
	
	//print
	public void print() {
		System.out.println("| "+ id+ " | "+ job+" | "+ level+" | "+ money+" |");
	}
	public static void basePrint() {
		System.out.println("| "+ "ID"+ " | "+ "JOB"+" | "+ "LEVEL"+" | "+ "MONEY"+" |");
		System.out.println("| "+ ":---:"+ " | "+ ":---:"+" | "+ ":---:"+" | "+ ":---:"+" |");
	}
	
	//constructor
	public Charactor(String id, String job) { 
		this(id,job,1,0); //자기 생성자를 부를 때!
	}

	public Charactor(String id, String job, int level, int money) { 
		setId(id);
		setJob(job);
		setLevel(level);
		setMoney(money);
	}
	
	//setter
	public void setId(String id) {
		this.id = id;
	}
	
	public void setJob(String job) {
	//	if(job == "전사" || job == "마법사") 
	//		this.job = job;
		switch(job) {
			case "전사":
			case "마법사":
				this.job = job;
		}
	}      
	       
	public void setLevel(int level) {
		if(level >= 1 && level < 100)
			this.level = level;
	}      
	public void setMoney(int money) {
		if(money >= 100)
			this.money = money;
	}
	//getter
	
	public String getId() {
		return id;
	}
	public String getJob() {
		return job;
	}
	public int getLevel() {
		return level;
	}
	public int getMoney() {
		return money;
	}

	
}
