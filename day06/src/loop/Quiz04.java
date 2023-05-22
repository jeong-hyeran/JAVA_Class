package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// 랜덤을 활용한 업다운 게임을 작성하세요
		
		int n1, n2; //n1은 랜덤, n2지정값, n3횟수
		int n3 = 1;
				
		Random ran = new Random();
		n1 = ran.nextInt(100)+1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("100 이하의 숫자를 입력하세요 : ");
		n2 = sc.nextInt();
		
		while (n1 != n2) {
			if (n1 < n2) {
				System.out.println("DOWN");
				n2 = sc.nextInt();
			}else {
				System.out.println("UP");
				n2 = sc.nextInt();
				}
				n3++;
		}
		System.out.printf("%d번만에 지정 값 -> [%d]맞춤", n3,n2);
	
		sc.close();
}
}
