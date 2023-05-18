package operator;

public class Ex03 {
	public static void main(String[] args) {
		// 삼항 연산자
		// A ? B : C
		// A조건이 참이면 B값으로 결정하고, 아니면 C값으로 결정한다.
		// 조건에 따라 서로 다른 값 중 하나를 결정짓는 연산자.
		
		// if는 조건에 따라서 서로 다른 코드를 수행하는 것이 목적 (행위)
		// 삼항 연산자는 두개의 값중 하나를 결정하는 것이 목적 (값)
		
		int age = 25;
		boolean isAdult = age >= 20;
		
		System.out.println(isAdult ? "성인" : "미성년자");
		
		String adult = isAdult ? "성인" : "미성년자";
		System.out.println("adult : " + adult);
		
		System.out.println("삼항 연산자 중첨 예시");
		
		int num = 2;
		String oddEven = num == 0  //num이 0 이면
							 ? "Zero"	// Zero를 대입
							 : num % 2 == 0 	// 0이 아니고 num이 2로 나누어 떨어지면 
									 ? "짝수" 	// 짝수를 대입
									 : "홀수"; 	// 아니면 홀수를 대입
		System.out.println("oddEven : " + oddEven);
		
		// 잘못된 예시
//		num % 2 == 0 ? System.out.println("짝수") : System.out.println("홀수");
		/// 이것은 행위여서 잘못된 예시이다. 값을 내놓는 함수가 아니다.
		/// 값을 내놓는 함수면 가능
		
		/*int num2 = 2;
		String k = num2 % 2 == 0 ? "짝수" : "홀수";
		System.out.println(k);*/
		
		String test = "123411";
		int test2 = isDigit(test) ? Integer.parseInt(test) : 0;
		System.out.println("test2 : " + test2);
		/// void는 값을 내놓는 것이 아니다.
		
	}
	// 문자열의 글자들이 모두 숫자로만 구성되었는지 검사하여 결과를 boolean으로 반환하는 함수
	static boolean isDigit (String s) {	// 문자열 s를 전달 받아서
		boolean answer = true;
		for(int i = 0; i < s.length(); i++) {	// 처음부터 끝까지 글자 하나씩 꺼내서
			if(s.charAt(i)< '0' || '9' < s.charAt(i)) {		//0보다 작거나 9보다 크면
				return false;	// false를 반화 (함수 중단)
			}
		}
		return answer;	// 문제 없이 통과하면 true를 반환
	}

}




















