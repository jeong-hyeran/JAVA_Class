package student;
// 학생관리 프로그램에서 1명의 학생 정보를 저장할 객체의 클래스를 구성합니다.
// 이름, 국어, 영어, 수학, 합계, 평균(실수, 소수점둘째자리까지 출력) 정보를 저장합니다.
// 생성자에서는 이름과 국영수 점수만 전달 받습니다.
// 국영수 점수를 이용하여 합계와 평균을 계산하여 저장합니다.
// show() 함수를 작성하여 이름과 합계 및 평균을 화면에 출력합니다.
// 필드는 private, 생성자와 메서드는 public으로 설정합니다.
public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int sum;
	private double avg;

	public Student(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		
		sum = korean + english + math;
		avg = (double)sum/3;
		
	}
	
	
	/// 객체를 생성할떄는 멤버 필드가 싹다 차는게 좋다.
	/// 생성자에 멤버필드 값이 다 저장?되는 것이 좋다 
	public void show() {
		System.out.printf("학생 ) %s - 합계 : %d 점, 평균 : %.2f 점\n",this.name,this.sum,this.avg);
	}
	
//	public void showdetail() {
//		System.out.printf("학생 ) %s - 국어 : %d점, 영어 : %d점, 수학 : %d점 ,합계 : %d 점, 평균 : %.2f 점\n",this.name,korean,english,math,this.sum,this.avg);
//	}
	
	public String getName() {
		return name;
	}

}
