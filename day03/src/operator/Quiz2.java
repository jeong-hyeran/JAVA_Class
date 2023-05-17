package operator;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		
		long cardNumber;
		Scanner sc = new Scanner(System.in);
		String answer = "";
		
		System.out.println("카드번호 16자리를 입력 : ");
		cardNumber = Long.parseLong(sc.nextLine());
		
		System.out.println("cardNumber : " + cardNumber);
		// 위 숫자를 4자리씩 분리하여 사이에 "-"를 더하여 다시 출력하세요
		// 나머지 연산을 사용하여 
		
		// 4자리씩 나눠서 문자열로 변환해서 출력
//		long num4 = cardNumber % 10000;
//		long num3 = cardNumber / 10000;;
//		num3 = num3 % 10000;
//		
//		long num2 = cardNumber / 100000000;;
//		num2 = num2 % 10000;
//		
//		long num1 = cardNumber / 10000000;;
//		num1 = num1 % 10000;
				
		long num1 = cardNumber / 100000000;
		long num2 = cardNumber % 100000000;
		long num1_1 = num1 / 10000;
		long num1_2 = num1 % 10000;
		long num2_1 = num2 / 10000;
		long num2_2 = num2 % 10000;
		
		
//		System.out.println(num1_1 + "-" + num1_2 + "-" +num2_1 + "-" +num2_2);
				
		answer = num1_1 + "-" + num1_2 + "-" +num2_1 + "-" + num2_2;		
				
		System.out.println("answer : " + answer);
		sc.close();
		
		//강사님 풀이
		long n1,n2,n3,n4;
		n4 = cardNumber % 10000;
		cardNumber = cardNumber / 10000;
		
		n3 = cardNumber % 10000;
		cardNumber = cardNumber / 10000;
		
		n2 = cardNumber % 10000;
		n1 = cardNumber / 10000;
		
		answer = n1 + "-" + n2 + "-" +n3 + "-" + n4;		
		System.out.println("**answer : " + answer);
	
	}

}
