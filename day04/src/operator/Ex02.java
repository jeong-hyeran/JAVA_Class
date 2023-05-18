package operator;

public class Ex02 {
	public static void main(String[] args) {
		// 논리 연산자의 특징
		
		// 1) A && B 는 양쪽 모두 true이여야 전체 결과가 true이다.
		// 만약, A가 false라면 B의 결과에 상관없이 전체 결과는 false이다.
		// 따라서, A가 false라면 B의 내용은 체크하지 않는다.(코드를 수정하지 않는다.)
		
		// 2) A || B 는 양쪽 모두 false이여야 전체 결과가 false이다.
		// 만약, A가 true라면 B의 결과에 상관없이 전체 결과가 true이다.
		// 따라서, A사 true라며 B의 내용은 체크하지 않는다.( 코드를 수행하지 않는다.)
			
		int a = 2, b = 1, c = 0, d = -1;
		System.out.printf("%d, %d, %d, %d\n",a,b,c,d);
		
		boolean bo1 = (a++ + ++b < 0) && (c++ - d-- == 0); ///후위증감식은 한 줄이 끝난 후 실행 
		System.out.println("bo1 : " + bo1);
		/// 앞의 조건이 false가 나와서 뒤에 조건을 실행하지 않는다.
		/// 그래서 c,d의 증감연산은 진행 되지 않는다.
		System.out.printf("%d, %d, %d, %d\n",a,b,c,d);
		
		
		boolean bo2 = ((a *=2)> b ) || ((d *= c) != 0); ///복합연산자도 괄호로 묶어주면 한줄로 사용 할 수 있다.
		System.out.println("bo2 : " + bo2);
		System.out.printf("%d, %d, %d, %d\n",a,b,c,d);
		/// 논리 연산자 순서도 신경을 써야 한다. 우선순위를 잘 살펴 봐야한다.
		
		// 제어문의 조건으로 활용할 때 !flag 형식으로 사용하거나.
		// flag == false 형식으로 사용할 수 있다.
		
		int age = 15;
		boolean isAdult = age >= 20;
		
		if(!isAdult) { // 간결하게 표현하고 싶을 때
			System.out.println("성인이 아닙니다!!");
		}
		
		if(isAdult == false) { // 명확하게 표현하고 싶을 때
			System.out.println("성인이 아닙니다!!");
		}
		/// 두개가 같은 표현이다.
		
		
		
		
		
	}

}






