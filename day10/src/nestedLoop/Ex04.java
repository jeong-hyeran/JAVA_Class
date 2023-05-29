package nestedLoop;

public class Ex04 {
	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					boolean flag = true;
				flag =j+i>=4;
				System.out.print(flag?"* ":"  ");
			}
			System.out.println();
		}
		System.out.println();
		
		int space = 4;
		int star = 1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < space; j++) {
				System.out.print("  ");
				}
				for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
			space -= 1;
			star += 1;
		}
		System.out.println();
		
		//    *
		//  * * *
		//* * * * *
		//  * * * 
		//    *
		int space1=2 ;
		int star1 =1;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < space1; j++) {
				System.out.print("  ");
				}
				for (int j = 0; j < star1; j++) {
					System.out.print("* ");
		}
			System.out.println();
			
			if(i<2) {
				space1 -= 1;
				star1 += 2;
			}else {
				space1 += 1;
				star1 -= 2;
			}
	}
		System.out.println();
		
		for (int i = 0; i < 5; i++) {		//5줄 
			for (int j = 0; j < 5; j++) {	//5칸
				boolean flag1 = (i==2||j==2);
				boolean flag2 = (i%2!=0&&j%2!=0);
				System.out.print(flag1||flag2?" *":"  ");
				
			}
			System.out.println();
		}
		System.out.println();
		
		
		
		
	}
}
