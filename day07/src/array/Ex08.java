package array;

public class Ex08 {
	public static void main(String[] args) {
		
		int n1 = 5, n2 = 2, n3 = 4;
		int max;
		
		max = n1;
		if(max < n2){
			max = n2;
		}
		if(max < n3){
			max = n3;
		}
		System.out.println("max : " + max);
		System.out.println();
		
		int[] arr = {17,26,33,52,46,87,69,92,73};
		max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("max : " + max);
		System.out.println();
		
		// 1) arr의 값 중에서, 홀수이면서 가장 큰 값을 찾아서 출력하세요
		int oddmax=0;

		for (int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 != 0 && oddmax< arr[i]) {
				oddmax = arr[i]; 				
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			if (oddmax < arr[i]) {
//				oddmax = arr[i];
//			}
//		}
		System.out.println("oddmax : " + oddmax);
		System.out.println();
		// 2) arr의 값 중에서, 짝수인 값의 합계를 구하여 출력하세요
		int evensum=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evensum+=arr[i];
			}
		}
		
		System.out.println("evensum : " + evensum);
		System.out.println();
		
		// 3) arr의 모든 값의 평균을 구하여 소수점 둘째자리까지 출력하세요
		
		int sum = 0;
		for(int num:arr) {  /// arr에 변수를 num에 반복해서 넣겠다
			sum += num;
		}
		
		double avg = sum/(double)arr.length;
		System.out.printf("전체 평균: %.2f\n",avg);
	}

}
