package ch08.sec05;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 종료합니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 볼륨 : " + volume);
	}

}
