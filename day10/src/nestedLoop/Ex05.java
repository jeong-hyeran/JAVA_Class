package nestedLoop;

public class Ex05 {
	public static void main(String[] args) {
		int num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",num);
				num+=1;
			}
			System.out.println();
		}
		System.out.println();
		
		
		// i와 j를 이용하여 순서대로 출력하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int num2 = i*5+j+1;
				System.out.printf("%2d ",num2);
			}
			System.out.println();
		}
		
		
		// i와 j를 이용하여 가로세로 반전출력하기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				num = j*5+i+1;
			System.out.printf("%2d ",num);
			}
			System.out.println();
		}
		System.out.println();
		
		// 변수에 저장된 값을 일정크기만큼 증감하여 가로세로 반전 출력하기
		num = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%2d ",num);
				 num += 5;
			}
			System.out.println();
			num -= 24;
		}
		System.out.println();
		
	}

}
