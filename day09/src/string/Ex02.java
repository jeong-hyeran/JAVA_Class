package string;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		// substring : 문자열 빼기
		
		//				   012345678
		String fileName = "Home.java";
		/// 앞에서 뺀다.!?
		String s1 = fileName.substring(5);		//5부터 끝까지 잘라내기(포함해서 끝까지가져오기)
		String s2 = fileName.substring(0, 4);	// 0부터 4까지 잘라내기(포함, 미포함 : 범위 지정해서 가져오기)
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println();
		
		// split : 특정 글자를 기준으로 분리하여 배열로 만들어서 반환
		
		String url = "www.naver.com";
		String[] arr = url.split("\\.");	// .은 특수기호라 기능을 제거하기 위해 \\을 붙임
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// replace : 특정 글자 혹은 패턴을 다른 내용으로 변경한 새로운 문자열을 반환
		
		String s3 = "life is too shoat";
		String s4 = s3.replace("o","O");
		
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
		System.out.println();
		
		// indexOf : 특정 글자나 패턴의 시작 위치를 정수로 반환
		// subString과 연계하여 사용하는 경우가 있다.
		
		int index = s3.indexOf("shoat");
		System.out.println("index : " + index);
		System.out.println();

		String s5 = s3.substring(index);
		String s6 = s3.substring(0,index);
		
		System.out.println("s5 : " + s5);
		System.out.println("s6 : " + s6);
		System.out.println();
		
		// lowerCase, Uppercase
		// 모든 글자를 대문자 혹은 소문자로 변경한다.
		
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		
		System.out.println("s7 : " + s7);
		System.out.println("s8 : " + s8);
		System.out.println();
		
		// length() : 문자열의 글자수를 정수로 반환한다.
		System.out.println(s3.length());
		
		String s9 = Arrays.toString(arr);
		System.out.println(s9);
		
		s9 = s9.substring(0, s9.length()-1);	//마지막 한 글자 뺴고 남김
		s9 = s9.substring(1);					//첫번째 한 글자 뺴고 남김
		System.out.println(s9);
		
		
		
		
	}


}