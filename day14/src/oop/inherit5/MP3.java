package oop.inherit5;

//클래스에 final이 붙으면 더이상 상속이 이루어질 수 없다.(상속 금지)
public class MP3 extends MediaFile{
	//추가되는 변수가 존재
	
	protected int duration;
	//필수 아닌 선택이므로 생성자만들필요X
	//본인이 부모클래스가 될 가능성 > private => protected
	
	public MP3(String filename) {
		super(filename);
	}
	
	@Override
	public void execute() {
		System.out.println("음악 재생을 시작합니다.");
	}
	
	@Override
	public void forward() {
		System.out.println("음악을 빨리감기합니다.");
	}
	@Override
	public void rewind() {
		System.out.println("음악을 되감기합니다.");
	}
}
