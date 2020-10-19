package oop.inherit5;

public class MediaFile extends File {
	
	public MediaFile(String filename) {
		super(filename);
	}
	
	//재정의 나중에 할 예정이므로 final을 작성하지 않는다.
	//모두 고치는 내용이므로 작성필요X
	
	public void forward() {}
	public void rewind() {}
}
