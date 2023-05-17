package wrapperClass;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		int age;
		boolean beforeBirth;
		
		System.out.print("나이를 정수로 입력하세요: ");
		s1 = sc.nextLine();	//엔터를 누르는 곳 까지 변수에 저장한다.
		
		System.out.print("생일이 지났는지 true/false로 입력하세요 : ");
		s2 = sc.nextLine();

		// s1과 s2를 형대에 맞게 변화하여 값을 담아주세요
		age = Integer.parseInt(s1);
		beforeBirth = Boolean.parseBoolean(s2);
		
		if(beforeBirth) {	//만 나이
			age = age - 1;
		}
		else {
			age = age - 2;
		}
		System.out.println("당신의 만 나이는"+ age + "입니다.");
		sc.close();
	}

}
