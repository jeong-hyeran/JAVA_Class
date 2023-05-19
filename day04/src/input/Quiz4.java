package input;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		// 생년월일을 8자리 정수로 입력받아서
		// 올해연도를 이용하여 나이를 계산하여 출력하시
		// 출생 : yyyy-MM-dd
		// 나이 : x살
		
		int currentyear = 2023;
		int birthYear;
		int month;
		int date;
		int age;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("생년월일을 입력하세요[8자리] : ");
		birthYear = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		date = birthYear % 100;
		birthYear /= 100;
		
		month = birthYear % 100;
		
		birthYear /= 100;
		
		age = currentyear - birthYear;
		
		System.out.printf("출생 : %d-%02d-%02d \n",birthYear,month,date);
		System.out.printf("나이 : %d살 \n", age);
		
		sc.close();	
		
		
	}

}
