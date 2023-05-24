package function;

public class Ex04 {
	public static void main(String[] args) {
		// 1) 정수를 하나 전달 받아서 절대값을 반환하는 함수
		int t1 = getAbsolute(5-7);
		
		// 2) 세 정수를 전달 받아서 최소값을 반환하는 함수
		int t2 = getMinValue(7, 2, 5);
		
		
		// 3) 길이가 3인 배열을 전달 받아서 최소값을 반환하는 함수
		int[] arr = {7,2,5};
		int t3 = getMinValue(arr);
		
		// 하나의 함수이름으로, 여러개의 함수 정의를 별도로 만들 수 있다.
		// 함수 오버로딩, 메서드 오버로딩
		// 구분 기분 : 함수이름 + 매개변수의 자료형, 개수, 순서 
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		System.out.println("t3 : " + t3);
	}

	static int getMinValue(int[] arr) {
		int min = 0;
		min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(min >arr[i]) {
				min =arr[i];
			}
		}
		return min;
	}

//	static int getMinValue(int i, int j, int k) {
//		int answer =0;
//		answer = i;
//			if (answer>j) answer = j;
//			if (answer>k) answer = k;
//		return answer;
//	}
	
	static int getMinValue(int n1, int n2, int n3) {
		int min = 0;
		min = Integer.MAX_VALUE;
		if (min > n1) min = n1;
		if (min > n2) min = n2;
		if (min > n3) min = n3;
		return min;
	}

	static int getAbsolute(int i) {
		int answer = 0;
		if (i<0) answer = -i;
		else answer = i;
		return answer;
	}

}
