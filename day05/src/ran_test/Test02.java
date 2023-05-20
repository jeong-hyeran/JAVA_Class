package ran_test;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		# 비행기를 타는데 30분 거리까지의 기본 요금은 30000원이며, 
//		# 10분 단위로 추가요금 5000원씩 부가된다. 
//		# 비행기 탈 시간을 입력하여 요금 계산기를 만드시오.
		// 31 - 40 = 35000
		// 41 - 50 = 40000
		
		Scanner sc = new Scanner(System.in);
		
		int time, cost;

		
		System.out.print("비행기 탈 시간을 입력하시오(분) : ");
		time = sc.nextInt();
		
		time-=30;
		if(time > 0) {
			if(time % 10 == 0) {
				time /= 10;
				cost = 30000+(time*5000);
				}else {
					time /= 10;
				cost = 30000+((time+1)*5000);	
				}
		}else {
			cost = 30000;
		}
		System.out.printf("총 비행기 요금 : %,d원", cost);
		sc.close();
	}

}
