package control;


import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 서로 다른 세 정수를 입력받아서 큰수를 출력하세요
		// 만약 같으면 아무 수나 출력해도 됩니다.
		
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3, max;
		
		System.out.print("첫번째 정수 입력 : ");
		n1 = Integer.parseInt(sc.nextLine());
	
		System.out.print("두번째 정수 입력 : ");
		n2 = Integer.parseInt(sc.nextLine());

		System.out.print("세번째 정수 입력 : ");
		n3 = Integer.parseInt(sc.nextLine());
		System.out.println();
		
//		System.out.print("세 정수를 띄어쓰기로 구분하여 입력 : ");
//		n1 = sc.nextInt();
//		n1 = sc.nextInt();
//		n1 = sc.nextInt();
///		이렇게 받을 수도 있따
		
		
		max = n1;			// n1이 가장 크다고 가정한다
		
		if(max < n2) {		// 만약, n2가 더 크면
			max = n2;		// n2의 값을 최대값으로 지정한다.
		}
		if(max < n3) {		// 만약, n3가 더 크면(이전 if의 실행여부와 상관없이 무조건 체크한다.)
			max = n3;		// n3의 값을 최대값으로 지정한다.
		}
		
		
//		if (n1 > n2 && n1 > n3) {
//			max = n1;
//		}else if (n2 > n3) {
//			max = n2;
//		}else {
//			max = n3;
//		}
//		내가 한거
		
		System.out.println("가장 큰 정수는 : "+ max);
		
		sc.close();
		
	}

}
