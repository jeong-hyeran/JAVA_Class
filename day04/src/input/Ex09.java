package input;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		// java 1.5부터 사용 가능해졌다.
		Scanner sc = new Scanner(System.in);

		//정수 입력받기
		int num;
		System.out.println("정수 입력 : ");
		num = sc.nextInt(); // 숫자, \r, \n
		sc.nextLine(); ///버퍼에 남아있는 엔터를 요 아이가 처리한다.
		
		//실수 입력받기
		double db;
		System.out.println("실수 입력 : ");
		db = sc.nextDouble(); // 숫자, \r, \n ///여기는 실수만 뽑아서 출력..
		sc.nextLine();///버퍼에 남아있는 엔터를 요 아이가 처리한다.
		
		//문자열 입력받기
		String str;
		System.out.println("문자열 입력 : ");
//		str = sc.next();	// 입력데이터의 기본처리 자료형은 문자열이다.!!
		str = sc.nextLine(); //줄단위, 엔터키를 입력할때까지의 내용을 가져온다.
		
		/// 엔터키를 버리고 앞에꺼만 출력가능하다.
		/// 버퍼에 남아 있는 엔터를 비워야 한다.
		/// .parse를 쓰는게 편하지 않을까?
		// 버퍼가 정리되지 않았다면 정상적으로 처리할 수 없다.
		
		//퀴즈 강사님 풀이 가져와서 참고 함
		/*int num;
		
		System.out.println("정수 하나 입력 : ");
		num = Integer.parseInt(sc.nextLine());
		/// -> sc.nextLine()를 쓰는 이유가 엔터 없애기 위해서다!?
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " : " + result);
		
		*/
		
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		System.out.println("str : " + str);
		
		/* 내가 연습해본것, 문자열로 입력을 받아서 실수형으로 변환해서 실수형변수를 출력
		double db1;
		System.out.println("실수를 입력하시오");
		db1 = Double.parseDouble(sc.nextLine()); //-> 입력을 받는것! 버퍼공간을 생성
		System.out.println("db1 : " + db1);
		*/
		sc.close();  // 다 사용한 통로는 반드시 닫아주기!
		
	}

}
