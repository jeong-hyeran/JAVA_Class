package static_final;

// static은 클래스에 소속되는 필드 및 메서드
// 클래스가 객체보다 먼저 메모리에 로드 된다.
// 클래스가 로드되는 시점에서 static 요소는 생성되어있다.
// 클래스만 로드된 시점에서 아직 객체는 생성되지 않았다."
// 따라서 static요소는 non-static요소를 정상적으로 참조할 수 있는 보장이 없다.

class Test1{
	int n1 = 10;
	static int n2 = 20;
	
	/// static가 먼저 생성된다. 클래스 소속이기 때문!!!
	/// 클래스는 도면이구 객체는 차다.
	/// 클래스가 없으면 객체가 만들어지지 않는다.
	/// 클래스가 먼저 준비되고 나서 클래스를 이용해서 객체를 만든다.
	/// 메모리에 클래스가 먼저 올라간다.
	/// static는 클래스에 소속
	/// static 붙어있는 필드나, 메소드는 클래스 소속이라 제일 먼저 찍힌다.
	/// static요소는 non-static요소를 참조 할 수 없다.
	/// non-static요소는  static요소를 참조 할 수 있다.
	/// static은 static끼리, non-static은 	non-static끼리 참조하는 것이 제일 좋다. 
	/// 특정 객체를 지목하지 않아도 나오는 것들은 static라 한다.
	/// EX- 카드
	/// static - 카드 뒷면으 모양, 크기
	/// non-static - 카드 앞 쪽에 있는 문양과 색
	
	/// staitc 붙이면 안된다.
	//Cannot make a static reference to the non-static field n1
	void showN1() {
		System.out.println(n1);
	}
	
	static void showN2() {
		System.out.println(n2);
	}
}

public class Ex01 {
	public static void main(String[] args) {
		//static : 객체마다 서로 다른 값이 아니라, 클래스에 '고정'된 값
		
//		System.out.println("Test1.n1 : " + Test1.n1 );  /// static이 아니라 참조를 걸 수 없다.
		System.out.println("Test1.n2 : " + Test1.n2 );
		
		Test1 ob = new Test1();
		System.out.println("ob.n1 : " + ob.n1);
//		System.out.println("ob.n2 : " + ob.n2);		
		/// static요소에 static적인 방법으로 접근 하지 않아서 노란줄
		// The static field Test1.n2 should be accessed in a static way
		// 서로 다른 객체들이 공유하는 값이 된다.
	
	/// 자바의 메인 함수 항상 static,은 클래스을 생성 할 때 당시 만들어야 한다.
	
	}
}
