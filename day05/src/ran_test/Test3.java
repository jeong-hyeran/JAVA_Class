package ran_test;

import java.util.Scanner;

public class Test3 {
		public static void main(String[] args) {
//		 5개의 각 과목의 점수를 int형 타입의 변수 5개를 선언하고 입력받으세요.
//		 한 과목이라도 8개 미만인 경우, "불합격입니다!"를 출력하고 총 개수가 60개
//		 이상이면 "합격입니다!"를 출력하는 프로그램을 만들어보세요	
			
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, n4, n5;
		
		System.out.print("첫번째 과목 점수 : ");
		n1 = Integer.parseInt(sc.nextLine());
	
		System.out.print("두번째 과목 점수 : ");
		n2 = Integer.parseInt(sc.nextLine());

		System.out.print("세번째 과목 점수 : ");
		n3 = Integer.parseInt(sc.nextLine());
		
		System.out.print("네번째 과목 점수 : ");
		n4 = Integer.parseInt(sc.nextLine());

	
		System.out.print("다섯번째 과목 점수 : ");
		n5 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		int sum =(n1+ n2+ n3+ n4+ n5);
		String result;
		if(n1>=8 && n2>=8 && n3>=8 && n4>=8 && n5>=8 && sum>=60) {
			result = "합격입니다.";
			}else {
				result = "불합격입니다.";
			}
		System.out.printf(" 점수 : %d점, %d점, %d점, %d점, %d점\n 합계 : %d점 \n 결과 : %s",n1, n2, n3, n4, n5, sum, result);
		
		
		
		
		
		
		
			
			
			
			
			
		sc.close();	
		}
}
