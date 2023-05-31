package tv;



/// 서로 다른 패키지로 구성되어있는 것을 참조하려면 import가 필요하다.
public class RemoteController {

	private TV tv; // TV 객체를 참조할 수 있는 참조변수

//		boolean power;	// = false;
//		int channel;	// 1 ~ 200
//		int volume;		// 0 ~ 100
//		int mute;
//		int channerlNumber;
//		
		void setTv(TV tv) {
			this.tv = tv;
		}
		public  TV getTv() {
			return  tv;
		}
		
		
		void turn() {
			tv.turn();
		}
	
		void channelUp() {
//			this(1);
			tv.channelUp();
		}

		void setChannel(int channel) {
			tv.setChannel(channel);
		}
		
		void channelDown() {
			tv.channelDown();
		}
		
		void volumeUp() {
			tv.volumeUp();
		}
		
		void volumeDown() {
			tv.volumeDown();
		}
		
		void mute(){
			tv.mute();
		}
		

		
}

