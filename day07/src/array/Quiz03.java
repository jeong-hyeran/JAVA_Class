package array;

import java.util.Arrays;
import java.util.Random;

public class Quiz03 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int size = 10;
		int range = 100;
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(range);
		}
//		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println();
		// 1) arr의 값에서 홀수와 짝수가 각각 몇개인지 파악하여 출력하세요
		int odd=0,even=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				even++;			
			}else {
				odd++;	
			}
		}
		System.out.printf("짝수 개수 : %d\n홀수 개수 : %d\n", even, odd);
		
		// 2) oddArray와 evenArray를 생성하여 각각 홀수와 짝수를 담아서 출력하세요
		/// 개수를 파악해서 배열을 만들어야 한다.
		
			//내가 한거
		int []evenArray = new int[even];
		int []oddArray = new int[odd];
		int j=0,k=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evenArray[j] = arr[i];
				j++;
			}else {
				oddArray[k] = arr[i];
				k++;
			}
		}
		
		System.out.println("짝수 : "+Arrays.toString(evenArray));
		System.out.println("홀수 : "+Arrays.toString(oddArray));
		System.out.println();
		
		// 3) arr의 총합을 구하여 출력하세요
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("합계 : "+ total);
	}

}
