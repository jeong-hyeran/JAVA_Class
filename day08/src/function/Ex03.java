package function;


public class Ex03 {
	
	static int absolute(int num) {  /// 반환 형 / 함수명 / 매개변소
		int answer = 0;				/// 반환 형과 같은 변수
		// 여기에 코드를 작성한다 (매개변수를 활용한 코드)
		if(num < 0 ) answer = -num;
		else answer = num;
		return answer;				/// 마지막에 return해서 변수를 내보내면 된다.
	}
	
	// main함수가 static 속성이므로, main에서 바로 호출하려면 함수도 static이여야한다.
	public static void main(String[] args) {
		// 정수를 하나 전달받아서 정수의 절대값을 반환하는 함수
		// int를 하나 전달받아서, int를 반환한다. (반환값은 하나만 가능)
		System.out.println("absolute(-3) : " + absolute(-3));
		System.out.println("absolute(3) : " + absolute(3));
		
		// 정수로 반지름을 전달 받아서, 원의 넓이를 계산하여 반환하는 함수를 작성하세용
		// 원의 넓이 = 반지름 * 반지름*3.14
		double s1 = getCircieSize(3);
		double s2 = getCircieSize(4);
		System.out.printf("s1 : %.2f\n", s1);
		System.out.printf("s2 : %.2f\n", s2);
		System.out.println();
		
		// 두 정수를 전달하여, 큰 값을 반환하는 함수를 작성하세요
		int n1= getbignumber(5,3);
		int n2= getbignumber(-5,3);
		
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		System.out.println();
		
	}
	
	static int getbignumber(int i, int j) {
//		 return i>j ? i : j ;
//	} /// 한줄로 완료 할 수 있다!
		
		int answer = 0;
		if(i>j) answer = i;
		else answer = j;
		return answer;
	}
	
	static double getCircieSize(int num) {
		double answer = 0.0;
		answer = num *num*3.14;
		return answer;
	}
	
	
}
