package function;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(15)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		// 3대의 엘리베이터가 있다.
		// 사용자에게 현재 층수를 입력 받아서 가장 가까운 엘리베이터가 움직이도록 출력하세요
		// 처음부터 순서대로, 엘레베이터의 이름은 A,B,C라고 하면
		// "%s 엘리베이터가 이동합니다."라고 출력해야합니다.
		// Ex04에서 작성했던 함수를 참조하여, 활용하면 좋습니다.
		
		int currentFloor; // 현재 층수
		System.out.print("현재 층 : ");
		currentFloor = sc.nextInt();
		
		char test = getnearElevatorName (arr,currentFloor);
		System.out.println(test + " 엘리베이터가 이동합니다.");
		System.out.println();
		/// 함수를 만들어 출력하는 방법
		
		
		int min = 14;
		int index = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// i번째 엘베의 층수와, 요청 받은 층수의 차이를 출력
			int diff = getAbsolute(arr[i]-currentFloor);
//			System.out.print(diff + " ");
			if(min > diff) {
				min = diff;
				index = i;
				}
		}
		System.out.println((char)(index+'A')+" 엘레베이터가 이동합니다.");
		/// index가 0+'A'(65) 여서 출력은 A가 되구 index값이 늘어나면 B,C로 바뀌어 출력됨
	
		sc.close();
	}
	static char getnearElevatorName(int[] arr,int currentFloor) {
		char ele = 'A';
		int index = 0;
		int min = 14;
		
		// 1) 현재층과 각 엘베의 차이 구하기
		for (int i = 0; i < arr.length; i++) {
			int diff = arr[i] - currentFloor;

			// 2) 차이에 절대값 처리하기 (거리)
			if(diff<0) {
				diff =-diff;
			}
			// 3) 거리중 최소값을 찾아서 index 구하기
			if(min > diff) {
				min = diff;
				index = i;
			}
		}
		// 4) index를 ele에 더하고 반환하기
		ele += index;
		return ele;
	}
	static int getAbsolute(int i) {
		int answer = 0;
		if (i<0) answer = -i;
		else answer = i;
		return answer;
	}		
}
		
		
		
		
//		int[] arr2 = new int [3];
//		for (int j = 0; j < arr.length; j++) {
//			ele = arr[j];
//			int n2 = (n1 - ele); // 현재 - 엘베 있는 층 차이
//				if (n2<0) {
//					n2 = -n2;
//				} /// 차이의 절대값
//			arr2[j]=n2;
//		}
//		System.out.println(Arrays.toString(arr2));
//		int min =0;
//		min = Integer.MAX_VALUE;
//		for (int k = 0; k < arr2.length; k++) {
//			if(min >arr[k]) {
//				min =arr[k];
//			}
//		}
//		System.out.println(min);
//		
//		String result ="";
//		if(arr2[0])  result = "A";
//		if(min==2)  result = "B";
//		if(min==3)  result = "C";
//		
//		System.out.printf("%s 엘리베이터가 이동합니다.",result);
//		
//		
