package constructor;

class Pos{
	int x;
	int y;
	
	// 생성자 오버로딩, 같은 이름의 여러 생성자를 작성할 수 있다.
	// 이때 구분하는 기준은 매개변수의 자료형, 개수이다.
	Pos(int x, int y){		/// 받고 싶을떄. 두개다 적는다!?
							/// 생성자 호출은 클래스의 모양을 본떠서 공간을 만들어두는 것
							/// 공간을 만들어 두고 대입을 해야하는데..
							/// 대입 후에 다시 생성자를 호출한다는 것은 만들어둔 공간에 대입되어있는 것들이 다 무너지는 것
		this();	// 생성자 내부에서 또다른 생성자를 호출할 경우에는 this를 이용한다.
				// 생성자 내부에서 또다른 생성자를 호출하는 코드는 반드시 첫줄에만 작성할 수 있다.
				// Constructor call must be the first statement in a constructor
				/// 생성자가 2개 이상이면?! this를 불러오면 어떤 생성자를 불러와아아아아!?
				/// -> 매개변수를 보고 맞는 생성자를 찾아간다.!!!
		
//		System.out.println("Pos 객체 생성!!"); //// 요아이 똑같이 출력
		this.x = x;
		this.y = y;
	}
	
	Pos(){
		System.out.println("Pos 객체 생성!!");
	}		/// 매개변수를 안 받고 하고 싶고
}
/// 생성자를 어떻게 형성하느냐에 따라.. 뭐가 달라져?! 흐이이이
public class Ex04 {
	public static void main(String[] args) {
		// 자바에서는 몇몇 특수상황을 제외하면 생성자를 호출해야만 객체를 생성할 수 있다.
		
		// Member m1;				// 참조변수는 있으나. 변수가 가리키는 대상을 지정하지 않았다.
		// m1.name = "이지은";		// 대입 불가
		
		// Member m1 = new Member();		// 생성한 객체를 참조변수가 참조한다.
		// m1.name = "이지은"; 				// 대입 가능
		
		Pos ob1 = new Pos();
		ob1.x = 2;
		ob1.y = 5;
		System.out.printf("[%d, %d]\n",ob1.x,ob1.y);
		
		Pos ob2 = new Pos(3,4);
		System.out.printf("[%d, %d]\n",ob2.x,ob2.y);
		
	}

}
