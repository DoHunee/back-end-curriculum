package Week2_04_Interface;

class Tv implements RemoteControl , Multichannel //이런식으로 다중인터페이스 구현 가능!!
{
	private int volume;
	
	@Override
	public void trunOn()
	{
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void trunOff()
	{
		System.out.println("TV를 끕니다.");
		// TODO Auto-generated method stub
		
	}

	public void setVolume(int volume)
	{
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume =volume;
		}                          //인터페이스 상수 필드를 이용해서 volume필드의 값을 제한
		
		System.out.println("현재 Tv의 불륨은 " + this.volume);
		
	}
	private int memoryVolume;
	
	//디폴트 메소드 재정의
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
			setVolume(MIN_VOLUME);
		}else {
			System.out.println("무음 기능 해제합니다");
			setVolume(this.memoryVolume);
		}
	}
	

}
