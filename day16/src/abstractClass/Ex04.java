package abstractClass;

import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

// 인터페이스는 추상 클래스의 한 종류이다.
// 인터페이스는 자료형으로 사용할 수 있다.
// 인터페이스의 모든 필드는 public static final이다.
// 인터페이스의 모근 메서드는 public abstract이다. /// 일반 메서드를 사용 할 수 없고, 무조건 추상 메서드로 된다. 
// 인터페이스는 extends대신 implements 키워드 상속(구현)처리한다. ///extends는 하나만 상속 받을 수 있다.
// 인터페이스는 일반적인 상속과는 달리, 다중 상속을 허용한다.

interface Test1{
//	Illegal modifier for the interface field Test1.n1; 
//			only public, static & final are permitted
	public static final int n1 = 10;
	int n2 =20;
	
	/// Abstract methods do not specify a body
	/// 추상 메서드라 바디를 가질 수 없고, ;으로 마무리해야한다.
	// Illegal modifier for the interface method show; 
	// only public, abstract, default, static and strictfp are permitted
	// default를 함수에 지정하면 인터페이스 내부에서도 코드를 작성할 수 있따.
	public abstract void show();
}

class Test2 implements Test1, Serializable, Closeable{
	private static final long serialVersionUID = 1L;

	@Override
	public void show() {
		System.out.printf("%d, %d\n",n1,n2);
	}

	@Override
	public void close() throws IOException {
		System.out.println("close!!");
		
	}
}

public class Ex04 {
	public static void main(String[] args) throws Exception{
		Test2 ob = new Test2();
		ob.show();
		ob.close();
		
	}

}
