package string;

import java.util.Arrays;

public class Quiz01 {
	public static void main(String[] args) {
		
		// Luhn 알고리즘
		
		/*
 			카드번호 16자리의 글자를 이용하여 카드번호의 유효성을 검증하는 알고리즘
 			우측부터 세어서 홀수번째는 그대로 두고 짝수 번째는 두배로 만든다.
 			만약 두배로 만들어진 값이 두자리수가 되면 각 자릿수를 합한다.
 			이렇게 만들어진 16자리의 정수를 모두 더하여 그 합이
 			10으로 나누어 떨어지면 유효한 카드번호, 그렇지 않으면 유효하지 않은 카드번호이다.
 			
 			문자열로 카드번호를 xxxx-xxxx-xxxx-xxxx 형식으로 전달받아서
 			유효성을 true/false로 반환하는 함수를 작성하고 테스트하세요

		 */
		// 2720-1234-5678-1357
		// 4740-2264-1658-2317 (62, false)
		// => 모든 것을 다 더해서 10으로 나누어 떨어지면 유효한 카드
		
		// 1720-1234-5678-1357
		// 1740-2264-1658-2317 (60.true)
		// => 모든 것을 다 더해서 10으로 나누어 떨어지면 유효한 카드
		
		
		/*
		 함수를 따로 만들어야 한다.
		 AAAA-BBBB-CCCC-DDDD
		 1111-2222-3333-4444	
		 
		 문자열로 받고 true/false로 출력해야한다.
		 데시가 포함되어있는지 확인
		 데시 제외 해서 16자리가 아니면 애초에 false
		 숫자로만 구성되어있냐
		 indexof,????
		 */
		//             0123456789012345678
		
		///*********내가 한거
	
		String card = "1720-1234-5678-1357";
		
		String s1 = card.substring(0,4);
		String s2 = card.substring(5,9);
		String s3 = card.substring(10,14);
		String s4 = card.substring(15);
		String str = s1+s2+s3+s4;
		
		System.out.println(str);	/// '-'제거
		String[] arr = new String[16];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i,i+1);
		}
		System.out.println("card : " + Arrays.toString(arr));
		int [] arr2 = new int[16];					// 문자형 배열은 int형 배열로 변환
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = Integer.parseInt(arr[j]);
			}
		for (int i = 1; i < arr2.length; i++) { 	// 홀수 번째 2배
			if (i % 2 !=0) {
				arr2[i] *=2;
			}
		}	
		
		for (int i = 1; i < arr2.length; i++) {
		if (arr2[i]>=10) {
			arr2[i] = (arr2[i]/10)+(arr2[i]%10);  ///???????10자리 넘어가는 거 더해야한다.
			}
		int sum =0;
//		for (int i = 1; i < arr2.length; i++) {
//			if (arr2[i] /// 모든 수 합하기
		}
		System.out.println("card2: " + Arrays.toString(arr2)); // 홀수번 쨰 2배
//		if(str.length()!=16) {
//			System.out.println("잘못된 카드 번호 입니다.");
//		}else {
//			
//			for (int i = 1; i < str.length(); i++) {
//				if(i) {
//					n1 = str.length(i)
//					
//				}
//				
//			}
//			
//		}
//		
		
		
		/* 강사님
		String t1 = "2720-1234-5678-1357";
		String t2 = "1720-1234-5678-1357";
		
		boolean b1 = checkCardNumber(t1);
		boolean b2 = checkCardNumber(t2);
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		*/
		
	}
	/*강사님
	 static boolean checkCardNumber(String cardNumber) {
	 		boolean answer = false;
		cardNumber = cardNumber.replace("-", "");
		if(cardNumber.length() != 16) { //'-'를 제외한 카드번호의 길이가 맞지 않으면
			return false;				// 함수를 중단하면서 false를 반환한다.
		}
		
		int sum =0;
		for (int i = 0; i < cardNumber.length(); i++) {
			char ch = cardNumber.charAt(i);
			int num = ch -48;
			System.out.printf("ch : %c %d\n",ch,(int)ch); // 아스키 코드를 이용 하여 
			System.out.println(num);	// 문자열의 숫자와 int형의 숫자의 차이가 48이여서
			// 홀수번째는 그대로, 짝수번째는 두배	//num = ch-48 (글자 0을 숫자 0으로 변환하는 작업)
			if(i % 2 ==0){
				num*=2;
				if(num>=10) { // 만약 더한 값이 두자리수 이상이면 (10이상이면)
					num = num/10 + num%10; // 10의 자리와 1의 자리를 더한다.
				}
			}
			sum+= sum; //합계에 누적시킨다.
		}
		answer = sum % 10 ==0;	//그 합이 10으로 나누어 떨어지면 true
		return answer;
	}
	*/
	}
