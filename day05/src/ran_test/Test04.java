package ran_test;

import java.util.Scanner;

public class Test04 {
	/* 코리아 초등학교에서 [1학년부터 4학년까지 중간고사 시험]을 보았다. 
    [4학년은 70점 이상]이면 합격, 그 [이외의 학년은 60점] 이상이면 합격이다. 
    이를 판단하는 프로그램을 작성해보자.
    [점수가 0미만 100초과이면 경고문구 출력]! */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int grade, score;
		
		System.out.print("학년을 입력 하세요 : ");
		grade = Integer.parseInt(sc.nextLine());
		System.out.print("점수를 입력 하세요 : ");
		score = Integer.parseInt(sc.nextLine());
		System.out.println();
		
		if (0 <= score && score <= 100)  {
			System.err.println("학년이 잘 못 입력 되었습니다.");
			if(grade == 4) { 
				if(score >= 70) {
					System.out.println("합격 입니다.");
				}else {
					System.out.println("불합격 입니다.");
				}
			}else if(score >= 60) {
				System.out.println("합격 입니다.");
			}else {
				System.out.println("불합격 입니다.");
			}
		}
		
		
		sc.close();
		
	}

}
