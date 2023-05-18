package operator;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in); // 키보드 입력을 받아서 처리하는 객체
		
		int n1 = ran.nextInt(9) + 1; /// (0-8)뽑아내는 함수 +1
		int n2 = ran.nextInt(9) + 1;
		Integer answer = null;
		
		System.out.println(n1 + " + " + n2 + " = ? ");
		answer = Integer.parseInt(sc.nextLine());
		
		// 삼항연산자. (둘 중 하나, 동전의 앞/ 뒤. 전원 on/off, 로그인/로그아웃 등)
		System.out.println(answer == n1 + n2 ? "정답" : "오답");
		
		// 분기문 (분기가 많거나, 수행하는 고트가 일정하지 않고, 내용이 길다면 분기문)
		if(answer == n1 +n2) {
			System.out.println("정답");
		}
		else {
			System.out.println("오답");
		}
		sc.close(); // 프로그램 끝날 때 입력통로를 닫아야 한다.
	}

}
