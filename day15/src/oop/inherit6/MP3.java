package oop.inherit6;

public final class MP3 extends MediaFile{

	public MP3(String filename) {
		super(filename);
	}

	@Override
	public void forward() {
		System.out.println("빨리감기");
	}

	@Override
	public void rewind() {
		System.out.println("되감기");
		
	}

	@Override
	public void execute() {
		System.out.println("실행하기");
		
	}

}
