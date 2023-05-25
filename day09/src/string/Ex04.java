package string;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) throws Exception{
		String search = "지수 꽃 가사";
		search = search.replace(" ", "+");  /// 지수+꽃+가사
		String url = "https://search.naver.com/search.naver?query=" + search;
		URL requestURL = new URL(url); /// ????
		URLConnection conn = requestURL.openConnection();
		Scanner sc = new Scanner(conn.getInputStream());
		String date = "";
		
		while (sc.hasNextLine()) {
			date += sc.nextLine() + "\n";
		}
		/// 소스코드를 다 끌고 오는 코드
		System.out.println("코드 수 : " +date.length());
		
		// 문자열 함수를 이용하여 내가 원하는 부분만 남기기
		date = date.substring(date.indexOf("<div class=\"intro_box\">"));
		date = date.substring(0, date.indexOf("</div>"));
		System.out.println("코드 수 : " +date.length());
		
		date = date.replace("<br/>", "\n");
		date = date.replace("<br>", "\n");
		date = date.replace("\n ", "\n"); ///줄바꿈 + 공백을 공백없음으로 바꾼다.
		date = date.replace("</p>", "");
		date = date.substring(date.lastIndexOf(">")+1);
		date = date.replaceFirst(" ", ""); /// 첫번째 줄에 공백을 없애준다.
		
		System.out.println(date);
		System.out.println();
		System.out.println("가사 수 : " +date.length());
		
		sc.close();
			
	}

}
