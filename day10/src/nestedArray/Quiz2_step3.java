package nestedArray;

public class Quiz2_step3 {
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
		int size = 9;
		int num = 1;
		int x =-1, y = 0;
		int sign = 1;
		int [][] arr = new int[size][size];
		
		while(true) {
		
		for (int i = 0; i < size; i++) {	// size회 반복
			x+=sign;						// x가 1씩 증가/감소
			arr[y][x] = num++;
		}
		
		size--; //길이 감소
		if(size==0) {
			break;
		}
		
		for (int i = 0; i < size; i++) {	// 반복 size회
			y += sign;						// y가 1씩 증가/감소
			arr[y][x] = num++;
		}
		
		sign = -sign;  //분호 반전
		}
		show(arr);
	}

}
