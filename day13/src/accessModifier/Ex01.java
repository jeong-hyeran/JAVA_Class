package accessModifier;

import org.omg.SendingContext.RunTime;

/*
 	접근 제한자 : 클래스 내부 구성요소에 대한 접근을 통제하는 요소
 	
 	private		: 클래스 내부에서만 해당하는 요소에 대한 접근을 허용한다.
 	package		: 같은 패키지 내부의 클래스끼리 접근을 허용한다.
 	protected	: 같은 패키지 내부 + 다른 패키지라도 상속관계로 묶여있다면 접근을 허용한다.
 	public		: 모든 클래스로부터 접근을 허용한다.
 */

class Test1{
	private int n1 = 10;
	/*package*/ int n2 = 20; /// 패키지는 기본이라 안적는다???.
	protected int n3 = 30;
	public int n4 = 40;
	
	void show() {
		// private 이더라도 내부에서는 자유롭게 접근할 수 있다.
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println("n3 : " + n3);
		System.out.println("n4 : " + n4);
		System.out.println();
	}
	
}
public class Ex01 {
	public static void main(String[] args) {
		Test1 ob = new Test1();
		
//		ob.n1 = 15;	//private이므로 접근(대입연산)불가.
		ob.n2 = 25;
		ob.n3 = 35;  // ob.setN3(35);
		ob.n4 += 5;
		
		// The field Test1.n1 (is not visible- 안보인다.)
		// Test1.n1 필드가 보이지 않습니다.
//		System.out.println("ob.n1 : " + ob.n1);  /// 다른 클래스여서 불러와지지 않는다.
		System.out.println("ob.n2 : " + ob.n2);
		System.out.println("ob.n3 : " + ob.n3);	// ob.getN3();
		System.out.println("ob.n4 : " + ob.n4);
		System.out.println();
		
		ob.show(); 				/// n1이 실행 된다. 내 클래스에서 내꺼를 끌고와서 문제 없음
		
		// 필드의 접근제한자를 private으로 설정한 이후
		// 외부로부터의 접근을 허용하고 싶다면 public으로 관련 함수를 작성하면 된다.
		// 접근을 허용하고 싶지 않다면, 함수를 작성하지 않으면 된다.
		
		//보통, 필드는 private, 메서드는 public으로 설정하는 것이 일반적이다.
		//단, 객체 생성을 막기 위해서 생성자에 private을 지정하는 경우가 있고(싱글톤)
		//static final 필드에 대해서는 public으로 지정한다.
		
		// 생성자에   private을 지정하여 생성자를 호출할 수 없는 클래스
		// The constructor Runtime() is not visible
//		Runtime rt = new Runtime();
		Runtime rt = Runtime.getRuntime();

		
		// 필드에 public를 지정한 static final 필드
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		
		
		
		
		
	}

}
