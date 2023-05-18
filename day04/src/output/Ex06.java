package output;

public class Ex06 {

	public static void main(String[] args) {
		// 서식 제어 문자
		
		// printf 혹은 String.format 함수를 사용할 때
		// 다른 값을 채워넣을 수 있는 빈 칸을 만들어주는 문다
		// 서식 제어 문자에 맞는 자료형의 값을 전달해야 한다.
		
		// System.out.printf("pi : %f\n", "3.14"); /// 서식을 맞춰서 해야한다.
		// IllegalFormatConversionException: 잘못된 서식 변환 예외
		
		// %s : string, 문자열을 출력핟.
		// %d : decimal, 정수를 10진수 형식으로 출력한다.
		// %o : octal, 정수를 8진수 형식으로 출력한다.
		// %x : HexaDecimal, 정수를 16진수 형식으로 출력한다.
		// %f : floating number, 실수를 출력한다.
		// %c : character, 정수에 맞는 글자를 출력한다.
		
		System.out.printf("num : %c\n", 79);
		System.out.printf("num : %d\n", 79);
		System.out.printf("num : %s\n", 79);
//		System.out.printf("num : %f\n", 79);
		System.out.printf("num : %o\n", 79);
		System.out.printf("num : %x\n", 79); /// 16진수에는 알파벳도 취급한다.
		System.out.printf("test : %d\n", 9876543210L); ///롱타입을 넣어도 정수로 출력됨
		System.out.println();
		
		
		// 서식 문자에 일부 기호 및 수자를 이용하여 서식을 제어할 수 있다.
		System.out.printf("num : %d\n" , 79);		// 그냥 10진수 출력
		System.out.printf("num : %3d\n" , 79);		// 3칸 확보 후  출력
		System.out.printf("num : %03d\n" , 79);		// 3칸 확보 후 빈칸은 0으로 채운후  출력
		
		// 서식을 활용한 말짜 및 시간 출력 예시
		int yyyy = 2023;
		int MM = 5;
		int dd = 18;
		String ampm = "오후";
		int hh = 6;
		int mm = 12;
		
		
		String format = "%d-%02d-%02d %s %02d:%02d\n";
		System.out.printf(format, yyyy, MM, dd, ampm, hh, mm);
		System.out.println();
		
		
		// 실수는 그냥 출력하면 기본 소수점 이하 6자리까지 출력하게 되어 있다.
		System.out.printf("pi : %f\n", 3.14);
		System.out.printf("pi : %.0f\n", 3.14);
		System.out.printf("pi : %.1f\n", 3.14);
		System.out.printf("pi : %.2f\n", 3.14);
		System.out.printf("pi : %.3f\n", 3.14);
		
		// 문자열을 칸을 확보한 후 왼쪽 혹은 오른쪽으로 배치 가능
		System.out.printf("name : [%15s]\n", "star Load");
		System.out.printf("name : [%-15s]\n", "star Load");
		
		// 자바의 모든 데이터는 문자열로 표현가능하기 때문에ㅡ 어떤 형식이든 %s로 출력할 수 있다.
		System.out.printf("System.out : %s\n", System.out);
		System.out.printf("정수 : %s\n", 55);
		System.out.printf("실수 : %s\n", 3.14);
	}

}
