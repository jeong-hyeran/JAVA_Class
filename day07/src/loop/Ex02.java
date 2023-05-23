package loop;

public class Ex02 {

	public static void main(String[] args) {
		//  for 문에서 ; 으로 구분된 각 절은 상황에 따라 생략할 수 있다.
		
		int i;
		
		for (i = 0; i < 5; i++) { /// 반드시 변수 선언을 할 필요는 없다.
			System.out.println("test1" + i);
		}
		System.out.println();
		
		for(; i<10; i++) {
			System.out.println("test2"+ i);
		}
		System.out.println();
		
		for(; i<15;) {
			System.out.println("test3"+ i);
			i++;
		}
		System.out.println();
		
		// 조건절을 생략하면 while(true)와 마찬가지로 무한 반복이 만들어진다.
		for(;;) {	/// ; 2개는 반드시 들어가야한다.
			System.out.println("test4 : "+ i);
			i += 1;
			if(i==1000) {
				break;
			}
		}
		System.out.println();
	}

}
