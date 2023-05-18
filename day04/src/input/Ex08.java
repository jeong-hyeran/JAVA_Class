package input;

// Sacnner가 나오게 된 경로
import java.io.*;

public class Ex08 {
	// 입력
	public static void main(String[] args) throws IOException{
		// 사용자의 입력 및 출력에서 다양한 예외 상황이 발생할 수 있어서 처리해주어야 한다.
		
		int num;
		System.out.println("에러 출력 스트림");
		System.out.println("표준 출력 스트림");
		System.out.print("글자 하나 입력(1바이트) : ");
		num = System.in.read(); // \r
		num = System.in.read(); // \n
		
		System.out.printf("num : %c, %d\n ", num ,num);
		
		int num2;
		System.out.println("다시 한 글자 입력 (1바이트) : ");
		num2 = System.in.read();
		System.in.read();
		System.in.read();
		System.out.printf("num2 : %c, %d\n", num2, num2);

		// 1바이트 입력객체를 기반으로 2바이트 단위 입력 객체를 생성
		InputStreamReader isr = new InputStreamReader(System.in);
		System.out.print("한글자 입력(2바이트) : ");
		int num3 = isr.read();
		System.out.printf("num2 : %c, %d\n", num3, num3);
		
		// 2바이트 입력객체를 기반으로 줄단위(버퍼단위)입력 객체를 생성
		BufferedReader br = new BufferedReader(isr);
		br.readLine(); // 이전까지 입력한 내용 버리기
		
		System.out.print("문장 입력 : ");
		String str = br.readLine();
		System.out.println("str : " + str);
		
		// 위 과정을 간편화하고, 어느 정도의 예외까지 내장 처리하게 만든 클래스가 scanner
		// Scanner를 이용하면 편리하게 입력받을 수 있다.
		
	}

}
