package loop;

public class Ex01 {
	// for : 일정한 횟수만큼 반복할 때 주로 사용한다.
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) { // 0,1,2,3,4 /// 변수 선언 및 초기화 ,증감식
			System.out.println("Hello !!");
		}
		
		/* 변수 선언 및 초기화 (1)
		      반복조건 (2)
		      출력문 (3)
		      증감식(4)
		   진행 순서 : 12342342342(false)
		   변수 선언은 딱 한번만 확인한다.	
		   
		   향상된 for문..?!
		   다수의 데이터가 있을때 많이 사용한다.
		   배열 list에서 자주 사용한다.
		*/
		
		
		
		int cnt = 0; ///변수의 선언 및 초기화
		while(cnt < 5) {	/// 증감식
			System.out.println("java");
			cnt++;
		}
		System.out.println();
	}
}


/// while문 보다 for문을 사용하는 이유
/// 간결하게 볼수 있고, 반복 횟수가 정해져있다.