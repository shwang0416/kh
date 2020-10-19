package oop.inherit6;

public final class AVI extends MediaFile {

	public AVI(String filename) {
		super(filename);
	}

	@Override
	public void forward() {
		System.out.println("영상 빨리감기");
	}

	@Override
	public void rewind() {
		System.out.println("영상 되감기");
		
	}

	@Override
	public void execute() {
		System.out.println("영상 실행");
		
	}

}
