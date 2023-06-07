package abstractClass;

/// 상속과 override가 빠진 코드, 묶을 수도 힘들고 상속도 안된다.
/// 업캐스팅은 뭐지영
class TestButton2 {

	
	protected void onClick() throws Exception {
		System.out.println("Test");
		System.out.println();
	}

}

class SquareButton2  {
	private int size;
	public SquareButton2(int size) {
		this.size = size;
	}

	
	protected void onClick() throws Exception {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
		System.out.println();
	}

}

public class Ex03 {
	public static void main(String[] args) throws Exception {
		TestButton2 btn1 = new TestButton2();
		btn1.onClick();

		SquareButton2 btn2 = new SquareButton2(5);
		btn2.onClick();

//		Object[] arr = {btn1, btn2};
//		for(Object ob : arr) {
//			ob.onclick();
//			ob.click();
		}
		// Object 클래스에는 click() 혹은 onclick()이라는 함수가 없어서 호출 불가
		// 개별실행은 가능하지만, 일괄처리는 불가능하다.
		
		//// 2번이랑 3번이랑 비교해서 봐봐아아아아
		
		// 추상클래스를 활용하여 객체를 구성하면
		// 서로 다른 클래스를 작성하고, 서로 다른 내용의 함수를 구성하면서고.
		// 일관된 방식으로 접근하여 처리할 수 있게 된다.
	}


