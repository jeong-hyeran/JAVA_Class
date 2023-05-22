package loop;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 ;
		String n2 = "";
		String tmp = "";
		int tmp2;
		
		System.out.print("입력");
		n1 = sc.nextInt();
		
		while(n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
//			tmp2 = tmp.length();	/// 선생님이 사용 하신 함수
//					tmp.charAt()	/// 선생님이 사용 하신 함수
			
			if (tmp2 == 3) {
				n1 = ",";
			}
		}
		System.out.println("tmp: " + tmp);
		
		int num = 0;
		while(n1 != 0) {
			num++;
			if (num %3==0) {
				n2 = ",";
			}
			
		}
		
		
				
		
		System.out.println("n2: " + n2);
		sc.close();
	
	
	
	
	}
}
