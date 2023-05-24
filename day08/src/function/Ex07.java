package function;

public class Ex07 {
	
	// 가변인자 활용 예시
	static int getTotal(int...args) {
		int total = 0;
		System.out.println("args.length : " + args.length);
		for(int num : args) {
			total += num;
		}
		return total;
	}
	public static void main(String[] args) {
		// System.out.printf()는 가변 인자를 사용한다.
		/// 가변인자라는 것은 맨 마지막에 사용해욯
		/// 가변인자는 
		
		System.out.println(getTotal(1,2,3));
		System.out.println(getTotal(10,20,30,40,50));
		System.out.println(getTotal(3,5));
	}

}
