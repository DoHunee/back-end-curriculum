package Week2_04_Interface;

public class Radio implements RemoteControl
{

	private int volume;

	@Override
	public void trunOn()
	{
		// TODO Auto-generated method stub
		System.out.println("라디오를 켭니다.");
		
	}

	@Override
	public void trunOff()
	{
		// TODO Auto-generated method stub
		System.out.println("라디오를 끕니다.");
		
	}

	@Override
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
				
				System.out.println("현재 라디오의 불륨은 " + this.volume);
		
	}

}
