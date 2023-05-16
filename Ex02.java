package variable;

public class Ex02 {
	public static void main(String[] args) {
		//변수의 자료형에 따라서 담을 수 있는 데이터가 다르다.
		
		boolean v1 = true;		// 1바이트 논리값을 저장할 수 있는 변수
		byte by = 100;			// 1바이트 정수를 저장할 수 있는 변수
		int num = 200;			// 4바이트 정수를 저장할 수 있는 변수
		double db = 300;		// 8바이트 실수를 저장할 수 있는 변수
		
		System.out.println("v1 : " + v1);
		System.out.println("by : " + by);
		System.out.println("num : " + num);
		System.out.println("db : " + db);
		
//		v1 = by; 
//		v1은 boolean type인데 by는 byte type으로 크기는 같은데 type이 달라서 불가
//		by = num;
		// by는 byte type이고 1byte, num은 int type이구 2byte 
		// 	-> 둘다 정수를 저장하는 타입이지만 by보다 num크기가 더 커서 불가
//		num = db;
		// num은 4byte 정수를 담을 수 있는 int type, db는 8byte 실수를 담을 수 있는 double type다
		// 소수점 이하 잘린다. 타입도 사이즈도 달라서 불가
		
		 db = num;	// 8바이트 실수형 변수에는 4바이트 정수를 저장할 수 있다.
		 num = by;	// 4바이트 정수형 변수에는 1바이트 정수를 저장할 수 있다.
//		 by = v1;	// 1바이트 정수형 변수에는 1바이트 논리값을 저장할 수 없다.(타입이 다르다.)
		 	System.out.println();
			System.out.println("v1 : " + v1);
			System.out.println("by : " + by);
			System.out.println("num : " + num);
			System.out.println("db : " + db);
		
		
	}

}
