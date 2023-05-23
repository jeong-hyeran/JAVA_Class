package loop;

import java.util.Scanner;

public class Ran {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String str = sc.nextLine();
		String str2 = "";
		
		for(int i=str.length()-1, j=1; i>0; i--,j++) {
			str2+=str.charAt(i);
			if(j!=str2.length()-1 && j%3 == 0)
				str2+=",";
		}
		
		System.out.println(str2);
		sc.close();
		
	}

}
