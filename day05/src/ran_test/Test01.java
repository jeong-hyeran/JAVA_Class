package ran_test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cost = 3000;
		int time;
		
		System.out.print("이용 시간(분) : ");
		time = sc.nextInt();
		
		time -= 30;
		if (time > 0) {
			if (time % 10 == 0) {
			cost += (time/10*500);
			}else {
				cost += (time/10*500+500);
			}
		}
		System.out.printf("총 요금 : %,d원",cost);
		
		
		
		
		


		sc.close();
	}

}
