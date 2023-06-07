package abstractClass;

// 운영체제/장치종류에 상관없이 PC주변기기를 컴퓨터에 연결할 수 있는 표준 프로토콜
interface USB {
	// USB장치는 연결되면 제 각각 서로 다른 반응을 나타내야 한다.
	void onConnect();

}

//옛날에 쓰던 저장장치
class FloppyDisk {

}

//PC에 연결하는 저장 장치
class MemorytStick extends FloppyDisk implements USB {

	@Override
	public void onConnect() {
		System.out.println("USB 메모리 연결된. 탐색기 실행");

	}

}

//PC에 연결하는 입력 장치
class keyboard implements USB {
	@Override
	public void onConnect() {
		System.out.println("키보드 연결 됨. 국가 코드 및 언어 탐색 후 적용");

	}
}

//PC에 연결하는 출력 장치
class Speaker implements USB {
	@Override
	public void onConnect() {
		System.out.println("스피커 연결 됨. 음성 채널 설정 및 볼륨 테스트");

	}
}

class PC {
//	void connect(Speaker device) {}			// AUX
//	void connect(keyboard device) {}		// PS2
//	void connect(MemorytStick device) {}	// Floppy Disk

	void connect(USB device) {
		device.onConnect();
	}
}

/// 자료형으로 묶어 놓아도 반응은 서로 다르다!!
public class Ex05 {
	public static void main(String[] args) {
		Speaker ob1 = new Speaker();
		MemorytStick ob2 = new MemorytStick();
		keyboard ob3 = new keyboard();

		PC Pc = new PC();

		Pc.connect(ob1);
		Pc.connect(ob2);
		Pc.connect(ob3);
		
		USB mouse = () -> System.out.println("마우스 연결 됨...");
		Pc.connect(mouse);
		
		/*
		 인터페이스의 추상 메서드가 오직 하나만 있으면 "함수형 인터페이스"라고 한다.
		 함수형 인터페이스는 자바 8에서 추가된 람다식(()->)을 이용하여 객체를 생성할 수 있다.
		 익명 클래스와 유사하지만, 훨씬 더 간결한 문법으로 처리할 수 있다.
		 */
	}

}
