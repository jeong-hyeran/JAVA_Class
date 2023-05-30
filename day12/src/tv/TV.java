package tv;

// 필드와 메서드 
// 필요하다면 생성자를 활용하여
// TV객체의 구성을 클래스로 나타냅니다.

// 속성(명사형)은 필드
// 기능(동사형)은 메서드로 나타냅니다.

public class TV {
	
	//필드
	boolean power;		// = false
	int mute = 0;		
	int channel;
	int volume = 1;
	int m = 0;
	
	
	/// 채널, 음향, 
	
	//메서드
	void turn() {

		power = !power;
		if(power) {
			System.out.println("전원이 켜집니다.");
		}else {
			System.out.println("전원이 꺼집니다.");
		}
	}
	
	void channelup(){
		if (power) {
			channel++;
			if (100 <= channel) {
				channel = 0;
			}
			System.out.printf("채널이 올라갑니다. 현재 채널 [%s번]\n",channel);
		}else {
			System.err.println("전원이 꺼져있습니다.");
		}
		
	}

	void channeldown() {
		if (power) {
			channel--;
			if (0 >= channel) {
				channel = 100;
			}
			System.out.printf("채널이 내려갑니다. 현재 채널 [%s번]\n",channel);
		} else {
			System.err.println("전원이 꺼져있습니다.");
		}
	}
	
	void volumeup() {
		if (power && volume!=mute) {
			volume++;
			if (100 >= volume && volume > 0) {
				System.out.printf("볼륨이 1 올라갑니다. 현재 볼륨[%s]\n", volume);
			} else {
				System.err.printf("현재 볼륨[%s],최대 음량입니다\n.", volume);
			}
		} else {
			System.err.println("음소거 상태입니다.");
		}
	}
	
	void volumedown() {
		if (power && volume!=mute) {
			volume--;
			if (100 >= volume && volume > 0) {
				System.out.printf("볼륨이 1 내려갑니다.현재 볼륨[%s]\n",volume);
			} else {
				System.err.printf("현재 볼륨[%s], 최소 음량입니다.\n",volume);
			}
		} else {
			System.err.println("음소거 상태입니다.");
		}
	}
	
	void muteon() {
		if (volume!=0) {
			m = volume;
			volume = mute;
			System.out.printf("음소거 됩니다.현재 볼륨[%s]\n",volume);
		}
	}
	
	void muteoff() {
		if (power) {
			volume = m;
			System.out.printf("음소거 해제됩니다.현재 볼륨[%s]\n",volume);
		}
	}
}
