package abstractClass;

import java.util.Arrays;
import java.util.Comparator;

public class EX06 {
	public static void main(String[] args) {
		/// 인터페이스를 작성 하지 않아도 사용 할 수 있다.
		
		// 인터페이스도 추상클래스에 속하기 때문에, 익명 내부 클래스 문법을 사용할 수 있다.
		/// 익명 클래스
		Runnable run1 = new Runnable() {
			@Override
			public void run() {	 				// 매개 변수의 개수가 0 (생략 불가)
				System.out.println("run1");		// 코드가 한줄( 생략 가능)
				
			}
		};
		run1.run();
		
		// 람다식을 사용하면 아래와 같이 생성한다.
		/// 미구현 메소드...!? 
		Runnable run2 = ()->{System.out.println("run2");};  ///{}; 생략 가능 맨 밖에있는 것
		run2.run();
		
		// 람다식 기본 형식 : () -> {}
		// () : 함수의 매개변수를 작성하는 공간, 매개변수가 하나라면 ()를 생략한다.
		// -> : 람다식 기호
		// {} : 함수의 실행 내용(body), 실행코드가 한 줄이면 {}를 생략한다.
		//		한줄의 실행코드가 return이면 return도 생략한다.
		
		Comparable<String> comp1 = new Comparable<String>() {
			
			@Override
			public int compareTo(String o) {	// 매개변수 1개(생략 가능)
				return "hello".compareTo(o);	// 실행 코드 1줄 (생략 가능)/// return 반드시 생략해야한다.
			}
		};
		
		int res1 = comp1.compareTo("Hello");
		System.out.println("res1 : "+ res1);
		
		
		Comparable<String> comp2 = o -> "hello".compareTo(o);
		
		int res2 = comp2.compareTo("Hello");
		System.out.println("res2 : "+ res2);
		
		
		Integer n1 = 10;
		Integer n2 = 20;
		
		Comparator<Integer> comp3 = new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1,Integer o2) {
				return o1.compareTo(o2);
//				return -o1.compareTo(o2);   /// 자료형에 의해 -를 붙이면 부호반전이 일어난다.
			}
		};
		
		int res3 = comp3.compare(n1,n2);
		System.out.println("res3 : "+ res3);
		
//		Comparator<Integer> comp4 = (o1,o2) -> o1.compareTo(o2);
		Comparator<Integer> comp4 = (o1,o2) -> -o1.compareTo(o2);  /// 자료형에 의해 -를 붙이면 부호반전이 일어난다.
		int res4 = comp4.compare(n1,n2);
		System.out.println("res4 : "+ res4);
		
		//comparator  활용
		Integer[] arr = { 4, 8, 2, 7, 6};
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, comp4);
		System.out.println(Arrays.toString(arr));
		
//		Arrays.sort(arr, (a,b)->a.compareTo(b));		// if(arr[i]- arr[j]>0)	/// sort 정렬 할꺼다?! 함수..!?
		Arrays.sort(arr, (a,b)-> a-b);		
		System.out.println(Arrays.toString(arr));
	
	
	}
}
