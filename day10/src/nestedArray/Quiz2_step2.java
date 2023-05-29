package nestedArray;

public class Quiz2_step2 {
	static void show(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int size = 5;
		int num = 1;
		int x =-1, y = 0;
		int sign = 1;
		int [][] arr = new int[size][size];
		
		// 다음형태로 출력하세요
		// 1   2   3   4   5
		// 16  17  18  19  6
		// 15  24  25  20  7
		// 14  23  22  21  8
		// 13  12  11  10  9
		/// if, for, while
		
		
		for (int i = 0; i < size; i++) {	// 5회 반복
			x+=sign;						// x가 1씩 증가
			arr[y][x] = num++;
		}
		
		size--; //길이 감소
		
		for (int i = 0; i < size; i++) {	// 반복 4회
			y += sign;						//y가 1씩 증가
			arr[y][x] = num++;
		}
		
		sign = -sign;  //분호 반전
		
		for (int i = 0; i < size; i++) {	// 4회 반복
			x+=sign;						// x가 1씩 감소
			arr[y][x] = num++;
		}
		
		size --;	// 길이 감소
			for (int i = 0; i < size; i++) {	// 반복 3회
			y += sign;							// y가 1씩 감소
			arr[y][x] = num++;
		}
		
		sign = -sign;  //분호 반전
		
		for (int i = 0; i < size; i++) {	// 3회 반복
			x+=sign;						// x가 1씩 증가
			arr[y][x] = num++;
		}		

		size --;	// 길이 감소
		for (int i = 0; i < size; i++) {	// 반복 2회
			y += sign;							// y가 1씩 증가
			arr[y][x] = num++;
		}
		
		sign = -sign;  //분호 반전
		
		for (int i = 0; i < size; i++) {	// 2회 반복
			x+=sign;						// x가 1씩 증가
			arr[y][x] = num++;
		}		

		size --;	// 길이 감소
		for (int i = 0; i < size; i++) {	// 반복 1회
			y += sign;							// y가 1씩 증가
			arr[y][x] = num++;
		}

		sign = -sign;  //분호 반전
		
		for (int i = 0; i < size; i++) {	// 1회 반복
			x+=sign;						// x가 1씩 증가
			arr[y][x] = num++;
		}		
		
		size --;
		System.out.println("size :"+size+"\n");
		
		show(arr);
		
	
	
	
		
	
	}

}
