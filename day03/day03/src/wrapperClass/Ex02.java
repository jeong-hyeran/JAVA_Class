package wrapperClass;

public class Ex02 {
	public static void main(String[] args) {
		//Wrapper Class와 primitive type사이의 값 대인
		
		//float과 long은 대표자료형이 아니므로, F혹은 L을 값 뒤에 붙여준다.
		float fl = 1.2f;	
		double db = 0;
		
		db = fl;		//primitive type끼리는 호황되므로, 대입이 가능하다.
						// 왼쪽 변수의 자료형이 더 크기 때문에 값의 손실이 없어서 암묵적 형변환이 발생한다.
		
		System.out.println("fl : " + fl + ", db : " + db);
		System.out.println();
		
		
	
		Float fl2 = 1.2F;
		Double db2 = 0.0;		// int 0을 바로 담을 수 없어서, 실수형태로 나타내야 한다.
								// 0을 담을 수 없는 이유를 말 할 수 있어야 한다.
								// 대입은 왼쪽과 오른쪽의 값이 같아야한다.
		
//		db2 = fl2; 		//Wrapper Class 끼리는 같은 실수라도, 서로 호환되지 않는다.
//						//Wrapper Class 는 자신과 같은 타입의 primitive type만 호환된다.
//		
//		db2 = (Double)fl2;	// 간데 형변환을 시도해도, 호환되지 않으므로 처리할 수 없다.
		
		//	1) 서로 호환 되는 primitive type를 이용하여 강제 형변화으로 대입하기
		// Float -> float -> double -> Double
		db2 = (double)(float)fl2;	// 타입케스팅 중간에 호환되는 자료형끼리 호환 되서 형변환
		
		// 2) Wrapper 클래스에서 제공하는 기능(함수)을 황용한다.
		db2 = Double.valueOf(fl2);	//valueOf라는 함수를 활용해서 형변환을 한다.
		
		
		System.out.println("fl2 : " + fl2 + ", db2 : " + db2);
		System.out.println();
		
	}

}
