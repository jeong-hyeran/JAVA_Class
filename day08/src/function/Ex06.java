package function;

public class Ex06 {

	public static void main(String[] args) {
		System.out.println("args.length : " + args.length);
		
		/// 배열이 있다면 배열으 ㅣ요소들을 화면에 출력해볼수 있다.
		for (int i = 0; i < args.length; i++) {
			System.out.printf("args[%d] : %s\n", i, args[i] );
		}
		
		// lower case, upper case
		if(args.length>0 ) {
			switch(args[0]){
			case "/l" : System.out.println("hello world"); break;
			case "/u" : System.out.println("HELLO WORLD"); break;
			default : System.out.println("hello world"); 
			}
		
		}
		
		
		System.out.println("끝");
	}

	}
