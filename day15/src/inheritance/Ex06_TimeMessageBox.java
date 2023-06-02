//// 서브에는 필드, 메서드 안 적었다. 슈퍼클래스에서 가져오기 때문!!
package inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex06_TimeMessageBox extends Ex06_MessageBox {

	// Implicit super constructor Ex06_MessageBox() is undefined for default constructor.
	// Must define an explicit constructor

	// 서브클래스는 반드시 슈퍼클래스의 생성자를 호출해야한다.
			/// 생성자의 형식을 맞춰야한다.
	// 슈퍼클래스의 기본생성자가 없으므로, 생성자를 작성하여 직접 연결해야 한다.

	public Ex06_TimeMessageBox(Scanner sc) {
		super(sc);	 // 자신의 생서자를 호출할때는 this(), 슈퍼클래스의 생서자는 super()
	}
	
	
	@Override
	public void input() {  /// 형식 반환형 매개변수만 같으면 자유롭게 쓸수있다.
		System.out.print("메시지 입력 : ");
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String time = sdf.format(d);
		String msg = time + "]" + getScanner().nextLine();
		setMessage(msg);
	}
	

	
}
