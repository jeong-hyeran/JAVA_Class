package function;

public class Quiz02 {
	//	String s = String.format("%2d : %2d", hour, minute);
	
	// 1) 정거장 구간 수에 따른 걸린 시간을 문자열로 반환하기
	// (구간당 4분으로 계산하며, 60분을 초과하면 시간과 분으로 구분하여 반환하기)
	/// if
	
	/*static String quiz1(int sub) {
		String answer =null;
		int time ;	// 총 이동시간
		int hour = 0 , min = 0;
		
		time = sub*4;
		
		if(time >= 60) {
			hour = time/60;
			min = time%60;
			answer = String.format("소요 시간 : %d시간  %d분", hour, min);
		}else{
			min = time;
			answer = String.format("소요 시간 : %d분", min);
		}
		return answer;
	}*/
	
	
	// 2) 놀이기구 이용 시간에 따른 요금을 문자열로 반환하기
	// 기본 30분까지는 3천원, 이후 10분당 500원의 추가 요금 발생
	// (천단위 구분기호를 찍어서 처리해야함)
	/// if
	
	/*static String quiz2(int min1) {
			int cost = 3000;
		
		min1 -= 30;
		if (min1 > 0) {
			if (min1 % 10 == 0) {
			cost += (min1/10*500);
			}else {
				cost += (min1/10*500+500);			
			}
		}
		String answer = String.format("총 요금은 %,d원", cost);
		return answer;
	}*/
	
	// 3) 두 정수를 전달 받아서, 두 정수 사이의 모든 수의 합을 구하여 반환하기
	// (두 정수의 대소관계는 정해져있지 않음)
	/// for문
	
	static int quiz3(int n1, int n2) {
		int answer = 0;
		// 먼저, 두 수의 대소관계에 따라 새로운 변수에 대입하거나 값을 바꾼다.
		if(n1 > n2) {
			int tmp = n1;
			n1 = n2;
			n2 = tmp;
		}
//		for(int i = n1; i <= n2; i++) {
//			answer+=i;
//		}
		
		answer = (n1 + n2) * (n2 -n1 +1) / 2;
/// 등차 수열의 합을 쓸 때도 큰수를 뽑아 낼 줄 알아야 한다.
		return answer;
	}
	
	/// ====> 내가 하다가 못함!!!
	
	/*static int quiz3(int first, int second) {
		int sum=0;
		if (first > second) {
			for (int k = 0; k < (first-second); k++) {
				sum+=second;
			}
		}else {
			for (int k = 0; k < (second-first); k++) {
				sum+=first;
		}
		}
		return sum;
	}*/
	
	
	public static void main(String[] args) {
//		String s1 = quiz1(12);	// 48분
//		String s2 = quiz1(16);	// 1시간 4분
//		
//		System.out.println(s1);
//		System.out.println(s2);
		
//		String s3 = quiz2(25);	// 3,000원
//		String s4 = quiz2(40);	// 3,500원
//		String s5 = quiz2(41);	// 4,000원
//		
//		System.out.println(s3);
//		System.out.println(s4);
//		System.out.println(s5);
//		
		int n1 = quiz3(1,10);	//55
		int n2 = quiz3(10,1);	//55
		
		System.out.println(n1);
		System.out.println(n2);
//		
		
		
		
	}




}
