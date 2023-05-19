package control;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 지하철 1구간 당 평균 이동시간이 [4분]이라고 가정한다.
		 * [이동한 구간 수를 입력]받아서, [걸린시간]을 출력하세요
		 * 단, [시간이 60분 이상]이면 [시간과 분을 구분]하여 출력하고
		 * [시간이 60분 미만]이면 [분만 출력]하세요
		 */
		Scanner sc = new Scanner(System.in);
		
		int sub,hour,min; // 이동한 구간, 시간 ,분
		
		System.out.print("지하철 이동한 구간 수 : ");
		sub = sc.nextInt();
		sub *= 4; //이동한 시간 (분)
		
		if (sub <= 60) {
			System.out.printf("총 %02d분 이동.\n",sub);
		}else{
			hour = sub / 60;
			min = sub % 60;
			System.out.printf("총 %d시간 %02d분 이동.\n",hour,min);
		}
		
		
		
		
		sc.close();
	}
		
}
