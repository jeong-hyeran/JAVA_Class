package control;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String id = "itbank";
		String pw = "it";
		String userid, userpw;
		
		System.out.print("ID : ");
		userid = sc.nextLine();
		
		System.out.print("pw : ");
		userpw = sc.nextLine();
		
		if (id.equals(userid)) {
			if(pw.equals(userpw)) {
				System.out.println("로그인 성공");
			}
			else {
				System.err.println("비밀번호가 일치하지 않습니다.");
			}
		}
		else {
			System.err.println("계정을 찾을 수 없습니다.");
		}
		
		sc.close();
	
	}

}
