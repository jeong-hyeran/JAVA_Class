package nestedLoop;

public class Ex01 {
	public static void main(String[] args) {
		
		int num = 1;
		for (int i = 0; i < 3; i++) {		//줄수(세로)
			for (int j = 0; j < 4; j++) {	//칸수 (가로)
				System.out.printf("%2d ",num++);
			}
			System.out.println();
		}
	System.out.println();
	
		// 상단의 이중 for문을 똑같은 결과를 단일 for문으로 출력해보기
		num = 1;
		for (int i = 0; i < 12; i++) {
			if(i !=0 && i% 4==0) {
			System.out.println();
			}
			System.out.printf("%2d ",num++);
		}
		///  이중포문으로 처리된 코드는 대부분 단일 포문으로 표현 가능하다.
		/// 그럼 왜 사용하냐
		/// 이차원 배열로 ㅁ..?
		
		
		
	}

}
