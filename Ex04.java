package variable;

public class Ex04 {
	public static void main(String[] args) {
		
		// 기본자료형은 아니지만, 자주 사용하는 클래스 타입 자료형
		String s = "Hello";
		
		// 문자열(여러 글자로 구성된 내용)은 쌍따옴표
		// 단일 글자는 홀따옴표로 묶어주기
		
		char ch = 'A';
		
		// + 연산을 중심으로 왼쪽 혹은 오른쪽에 문자열이 있으면 그 결과는 문자열
		
		int n1 = 10;
		String s2 = "20";
		double d3 = 30.0;
		
		System.out.println(n1 + s2);	// 문자열과 다른 자료형의 값은 덧셈을 하지 않고
		System.out.println(s2 + d3);	// 각 값을 출력했을 때의 모양을 이어붙이기로 합친다.
		System.out.println(n1 + d3);
		System.out.println();
		
		System.out.println("n1 : " + n1);
		System.out.println("s2 : " + s2);
		System.out.println("d3 : " + d3);
		System.out.println();
		// 같은 기호라 하더라도, 양쪽 값의[자료형]에 따라서 서로 다른 기능을 수행한다.
		
//		n1.		//primitive type 은 순수하게 값만 저장한다.
//    s2.   //여러 합수들이 나온다.
						// 위에 두 경우가 다른 이유는 primitive 타입이라 값만저장되구, 
            // 다른 것은 기능까지 저장되기 때문
		s2.replace('0','5');
		System.out.println("s2 : " + s2 );
		// 문자열은 String 클래스 자료형으로 사용한다.
		// 클래스에 의해 만들어진 객체형 데이터는 값과 기능이 한덩어리로 묶여있다.
		// 값도 저장하고. 필요한 기능도 내장하고 있다.
		
		// 값만 저장되어 있는 형태, 예를 들면 인형 (모양은 또렷하지만 자체적인 기능은 없다.)
		// 값과 기능이 함께 있는 형태, 예를 들면 로봇(모양도 포함하고 스스로 움직이는 기능도 있다.)
		
		// primitive 타입은 값만 처리하고 기능은 사용할 수 없지만
		// primitive 타입은 값을 객체로 처리하기 위한 클래스가 있다.
		// -> Wrapper Class :  비 객체형 데이터를 객체형으로 감싸서 포장하는 클래스
		
		int num = 10;		// primitive type
		Integer num2 = num;	// wrapper class
		
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		
//		num. 	// 순수하게 값만 저장한다.
//		num2.	// 기능을 포함한다.

}
