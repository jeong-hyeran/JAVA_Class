package loop;

public class Ex03 {

	public static void main(String[] args) {
		// 1) 1부터 100사이의 홀수의 합과 짝수의 합을 for문으로 계산하여 출력하세요
		int evensum=0, oldsum =0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				evensum += i;
			}else {
				oldsum+= i;
			}			
		}
		System.out.printf("짝수의 합 : %d \n홀수의 합 : %d", evensum,oldsum);
		System.out.println();
		
		// 2) A부터 Z까지 띄어쓰기로 구분하여 한 줄에 출력하세요
		// char는 글자를 표현하기 위한 정수 자료형이다.
		
		for (char j='A';j<='Z';j++) {
			System.out.print(j+" ");			
		}
		System.out.println();
		
		// 3) 빈 문자열에 *기호를 5번 추가하여 출력하세요
		/// null/ 빈문자는 다르다.
		
		String s = "";
		for(int i = 0;i < 5;i++) {
			s += '*';
		}
		System.out.print(s);
	}

}
