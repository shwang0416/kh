package oop.inherit6;

//추상클래스(abstract class)
// - 상속 관계에서 상위 클래스의 역할을 수행하는 클래스
// - 일반 클래스와 다르게 인스턴스 생성이 안 됨.
// - 일반 클래스와 다르게 추상메소드(abstract method)를 가질 수 있음.
public abstract class File {
	protected String filename;
	protected long filesize;
	
	//생성자
	public File(String filename) {
		this.filename = filename;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public long getFilesize() {
		return filesize;
	}

	public void setFilesize(long filesize) {
		this.filesize = filesize;
	}
	
	//추상메소드
	//이름 O, 코드 X (간판 역할)
	//재정의를 강요하는 역할
	public abstract void execute(); 
	//abstract 붙이고  블럭 (== {}) 안붙임.
	
	
	

}
