package loop;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 ; // 입력 값
		String n2 = "";	// 입력된 정수를 문자형으로 변환
		String tmp = ""; //
		String tmp2 = "";  //n2의 문자를 하나씩 나열한 것
		char ch ;
		
		String tmp3 = "";
		String com = ",";
		
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
				
		while(n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
		}
		
//		n2 = Integer.toString(n1);
		System.out.println(tmp.length());
		System.out.println(tmp.charAt(0));
		System.out.println(tmp.charAt(3));
		
		for (int i = 0; i < tmp.length(); i++) { /// 0부터 입력된 갑의 길이의 수만 큼 1씩 증가하면서 반복
			ch = tmp.charAt(i); /// 입력된 값을 정수로 변환해서 0번째부터 가져오기
			tmp2 += ch;
			if(i % 3 == 0) {	/// 3번째 순서일때 숫자 뒤에 ","붙이기
				tmp2 += com;}
		}
			System.out.println(tmp2.length());
			System.out.println(tmp2.charAt(0));
			System.out.println(tmp2.charAt(3));
			
			
//			}else {
//				tmp2 += com;
//			}
//		} 
		System.out.print("tmp2 : "+tmp2);
		System.out.println();
		
		
		while(n1 != 0) {
			tmp += n1 % 10;
			n1 /= 10;
			}
		
		
		for (int j = 0; j < tmp.length(); j++) { /// 0부터 입력된 갑의 길이의 수만 큼 1씩 증가하면서 반복
			ch = tmp.charAt(j); /// 입력된 값을 정수로 변환해서 0번째부터 가져오기
			if(j % 3 == 0) {	/// 3번째 순서일때 숫자 뒤에 ","붙이기
				tmp3 += ch+",";
			}else {
				tmp3 += ch+"";
			}
		} 
		System.out.print("tmp3 : "+tmp3);
		
				
		
		sc.close();
	}
}
