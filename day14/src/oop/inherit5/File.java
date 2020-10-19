package oop.inherit5;

//추상메소드를 가진 클래스: 추상클래스
public class File {
	
	String filename;
	
	public File(String filename) {
		setFilename(filename);
	}

	long filesize;
	
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
	//메소드 : 재정의(override)여부를 신중하게 판단
	
	// 추상메소드
	public void execute() {}

}
