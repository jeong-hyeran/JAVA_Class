package nestedLoop;

public class Ex02 {
	// 정수를 전달 받아서, 해당 정수의 구구단을 출력하고 반환값이 없는 함수
	static void gugudan(int dan) {	///void는 반환 값이 없다...?
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d X %d = %2d\n",dan,i,dan*i);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for(int dan = 2; dan<10; dan++) {
			gugudan(dan);
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d X %d = %2d\n",dan,i,dan*i);
//			}
//			System.out.println();
		}
	}

}
