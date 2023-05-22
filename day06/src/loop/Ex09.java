package loop;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 사용자에게 0을 입력 받을 때까지 정수를 반복하여 입력 받고 그 합계를 출력하기
		
		Scanner sc = new Scanner(System.in);
		int total = 0 ;
		int input;
		
		do {		// 일단 한번 실행하고	(input값이 없어서 진행불가해서 do,while사용)	
			///반복을 수행 할 껀데 조건을 따지지 않고 한번은 실행하고 나서 조건을 맞춰서 반복하는 것
			System.out.print("정수 입력 : ");
			input = sc.nextInt();
			total += input;
			
		}while(input != 0);	// 이후 조건을 체크 하여 반복여부를 결정한다.
		
		System.out.println("합계 : " + total);
		sc.close();
		
		
		
		
		
		
		
		
		
	}
}
