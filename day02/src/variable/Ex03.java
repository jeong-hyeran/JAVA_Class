package variable;

public class Ex03 {
	public static void main(String[] args) {
		// 자료형 변환
		
		byte by = 10;
		int num = 20;
		
		num = by; 	//1바이트 정수값을 4바이트 변수에 담을 수 있다.
					//byte 자료형의 값이 int형으로 변경죔
					//암묵적 형 변환
		
		
		
//		by = num; 	//자료형으로만 판단하면 담을 수 없음
					// 값을 확인했을 때 대입해도 잘리는 데이터가 없은
					// 혹은, 잘리는 부분을 감안하더라도 강제로 변환하여 대입하고 싶다면
		by = (byte)num;	// 명시적 형 변화, 값 앞에 원하는 자료형을 괄호 안에 넣어준다.
						// 왼쪽이 더 크면 담아진다.-> 암묵적 형 변환(promotion)
						// 왼쪽이 더 작으면 -> 명시적 형 변환(casting)
		
		
		char ch = 65;	//2바이트 unsigned 정수 (문자를 표현하기 위한 정수)
						//0 ~ 65535
		short sh = 65;	//2바이트  signed 정수
						//-32768 ~ + 32767
		
		//값을 표현 할 수 있는 범위가 달라서 불가

		ch = (char)sh;	//Type mismatch: cannot convert from short to char
		sh = (short)ch;	//Type mismatch: cannot convert from char to short
		
		// 형변환에는 변수의 크기, 값의 유형, 값의 표현범위도 복합적으로 고려한다.
		
		ch = '가';  //44032
			//ch의 값을 sh에 강제 형변환 한 후 저장된 정수를 화면에 출력하세요.
		
		sh = (short)ch;
		System.out.println("sh : " + sh);
				//강제형 변환의 부작용 원래의 값을 나타내지 못 할 수도 있다.
		
		int n1 = Character.MAX_VALUE;
		int n2 = ch;
		//크기는 같지만 표현할 수있는 범위가 다르다.
		
		System.out.println(n2 - n1 - 1);
		
		byte b1 = 127;
		byte b2 = (byte)128;
		
		System.out.println("b1 : " + b1);
		System.out.println("b2 : " + b2);
		System.out.printf("b1 : %32s\n" , Integer.toBinaryString(b1));
		System.out.printf("b2 : %32s\n" , Integer.toBinaryString(b2));
		
		
	}

}
