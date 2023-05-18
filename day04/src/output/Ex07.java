package output;

public class Ex07 {

	public static void main(String[] args) {
		// 이스케이프 스퀀스
		// 출력 시 모양으로 나타나지는 않으나 특수한 기능을 수행하는 글자
		
		char cr = '\r'; 
		//carrige return : 커서를 줄 가장 왼쪽으로 이동시킨다.
	
		
		char lf = '\n';
		// line feed : 커서를 한줄 아래로 이동시킨다.
		
		char tab = '\t';
		// tab : 프로그램에서 지정한 탭 크기(4 or 8)만큼 우측으로 이동시킨다.
		
		char bs = '\b';
		// backspace : 커서를 왼쪽으로 한칸 이동시킨다.
		
		System.out.printf("cr : %d\n", (int)cr);	// 13(enter)
		System.out.printf("lf : %d\n", (int)lf);	// 10
		System.out.printf("tab : %d\n", (int)tab);	//9
		System.out.printf("bs : %d\n", (int)bs);	//8
		System.out.println();
		
		System.out.println("A_" + cr + "B");	
		//이클립스에서 표현이 안되지만 A를 덮어서 B를 출력
		System.out.println("C_" + lf + "D");
		System.out.println("E_" + tab + "F");
		System.out.println("G_" + bs + "H");
		
		System.out.println("원빈\t: 45세");
		System.out.println("박현빈\t: 40세");
		System.out.println("지드레곤\t: 34세");
		System.out.println("저스틴비버\t: 29세");
		System.out.println("저스틴벌랜더\t: 40세");
		/// 시작점으로 부터 일정한 크기 만큼 이동한다.입력된 글의 크기도 생각해야한다.
		
		// backslash : 특수 글자의 앞에 붙어서 기능을 제거하는 역할을 한다.
		System.out.println("쌍따옴표(\")");
		System.out.println("개행문자(\\n)");
//		System.out.println("역슬래시(\\)");
		System.out.printf("%d %% \n",120); ///printf에서만!!println에서는 상관없음
		
		
		
		
		
		
	}

}
