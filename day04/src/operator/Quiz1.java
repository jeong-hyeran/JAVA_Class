package operator;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		// Ex04의 Scanner형식을 참조하여 다음 조건을 만족하는 코드를 작성하세요
		// 정수를 하나 입력 받아서, 홀수와 짝수를 문자열로 출력하는 코드를 작성합니다.
		// 단, 0은 짝수로 취급합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		int n1 = sc.nextInt();	
//		int n2 = sc.next

		
		System.out.println(n1 % 2 == 0 ? "짝수" : "홀수");
		
		//강사님 풀이
		/*int num;
		
		System.out.println("정수 하나 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " : " + result);
		
		*/
		
		
		sc.close();

	}

}
