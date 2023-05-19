package control;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		Random ran = new Random();
		int num;
		
		num = ran.nextInt();
		num %= 6;	// num의 값을 6으로 나눈 나머지를 저장한다.
					/// 6으로 나눈 이유가 뭘까융?
		num += 1;	// num의 값을 1증가시킨다.
		
		if(num % 2 == 0) {	// 만약
			System.out.println(num + " : 짝수");
		}
//		if(num%2!=0) {
		else {	// (이전에 제시한 조건이 true가) 아니면
			System.out.println(num + " : 홀수");
			}
		
	/// 삼항연산자는 둘중하나를 고를때 많이 사용	
		
		
		
		
		}

}
