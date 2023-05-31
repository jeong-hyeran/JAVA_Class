package tv;

//

public class Main {
	public static void main(String[] args) {
		TV tv = new TV();
		RemoteController remocon = new RemoteController();
		
		// 리모컨의 메서드를 호출하면, TV의 기능이 작동하도록 코드를 작성하여
		// 아래에서 테스트하세요
		remocon.setTv(tv);  ///이걸 왜 !!! 해야하는지 이해하쟈아아
		
		remocon.turn();
		remocon.channelUp();
		remocon.setChannel(5);
	}

}
