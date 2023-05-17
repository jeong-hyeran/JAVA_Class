package wrapperClass;

import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		
		//primitive type
		//boolean, byte,char,short,int,long,float,double
		
		//wrapperClass : 원시 자료형의 값을 객체 형태로 저장하기 위해 사용하는 클래스
		//Boolean,Byte,Character,Short,Integer,Long,Float,Double
		
		byte by1 = 10;		//비 객체형(원시적)
		Byte by2 = 20;		// 객체형
		
		System.out.println("by1 : " + by1);
		System.out.println("by2 : " + by2);
		// 기본자료형/Wrapper Class 모두 값을 저장하는데 이용할 수 있다.
		// Wrapper Class는 값에 대한 [기능], 자료형에 대한 [기능]이 내장되어있다.
		////by1은 함수가 안나오는데, by2는 함수가 나온다.
		
		//자바의 객체 지향 언어 특성을 제대로 활용하기 위해서 사용해야 할 경우가 있다.
		
		// 1) 여러 정수가 포함된 배열에서 짝수만 골래내서 새로 담아서 출력하기
		int[] arr = {7, 5, 4, 2, 8, 1, 9, 5};
		int[] arr2 = new int[3];
		
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] %2 == 0) {
				arr2[index++] = arr[i];
			}
		}
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println();
		
		// 2) 객체 지향 특성을 활용하여 간단하게 처리하기(배열, 생성자, 오버로딩.. 등등 배워야할게 많다.)
		// Syntax error, insert "Dimensions" to complete ReferenceType
		
		//List<int> list = Arrays.asList(arr);
		//primitive type인 int는 사용불가해서 wrapper Class인 Integer을 사용해서 출력한다.
		
		Integer[] arr3 = {7, 5, 4, 2, 8, 1, 9, 5};
		List<Integer> list = new ArrayList<>(Arrays.asList(arr3));
		
		System.out.println("list : " + list);
		
		list.removeIf(num -> num % 2 != 0);
		
		System.out.println("list : " + list);
		
		// (변수나 값이 아닌) Wrapper Class 자체에 내장된 기능을 활용하는 경우
		String s1 = "1234";
//		int num = (int)s1;	//강제 형변환도 자료형간의 호환성이 바탕이 되어야 한다.


		int num = Integer.parseInt(s1);		// 문자열의 내용을 정수로 변환하는 과정
		System.out.println(s1 + 1);			// 문자열 + 숫자, 모양을 합친자.
		System.out.println(num + 1);		// 숫자 + 숫자, 값을 합니다.
		
		
		
		
	}

}
