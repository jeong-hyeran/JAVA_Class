package loop;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		// 정수를 하나 입력 받아서, 1부터 입력받은 수까지 한줄에 출력하는 코드를 작성하세용
		
		Scanner sc = new Scanner(System.in);
		int num; 
		
		System.out.print("정수를 입력하세요 : ");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
		
		sc.close();
		System.out.println("\n프로그램 종료");
	}

}
