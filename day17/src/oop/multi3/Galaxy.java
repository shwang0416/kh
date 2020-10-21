package oop.multi3;

public class Galaxy extends Phone implements Game, MusicPlayer, Camera {

	

	@Override
	public void photo() {
		System.out.println("갤럭시의 사진기능을 실행합니다.");
	}

	@Override
	public void music() {
		System.out.println("갤럭시의 음악기능을 실행합니다.");
		
	}

	@Override
	public void play() {
		System.out.println("갤럭시의 게임기능을 실행합니다.");
		
	}

	@Override
	public void call() {
		System.out.println("갤럭시의 통화기능을 실행합니다.");
		
	}

	@Override
	public void sms() {
		System.out.println("갤럭시의 문자기능을 실행합니다.");
		
	}

}
