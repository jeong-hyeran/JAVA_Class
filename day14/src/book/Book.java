package book;

// 도서 관리 프로그램에서 다룰 도서를 나타내는 클래스
// 도서 제목	(문자열)
// 저자		(문자열)
// 출판일자	(문자열)
// 평점		(실수, 소수점 첫 째 자리 까지)
// 가격		(정수, 출력시 천단위 구분기호를 포함)
/// 전체 목록, 추가, 검색(포함), 삭제(제목 다정확하게 넣어서)
/// 핸들러에서 함수를 작성할떄 작업 순서도 주석을 달아라
/// 변수에 무엇을 담을 것인지 주석 처리를 하자

public class Book {
	// 멤버필드
	private String name;		// 도서 제목
	private String writer;		// 저자
	private String date;		// 출판일자
	private double avg;			// 평점
	private int price;			// 가격
	
	// 생성자
	public Book(String name,String writer,String date,double avg,int price) {
		this.name = name;
		this.writer = writer;
		this.date = date;
		this.avg = avg;
		this.price = price;
	}
	
	// 메소드
	public void show() {
		System.out.printf("도서명 : %s, 저자 : %s, 출판일자 : %s, 평점 : %.1f, 가격 : %,d원\n",name,writer,date,avg,price);
			}
	
	public String getName() {
		return name;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void addCart() {
		System.out.print("cart list \n");
	}
//	System.out.print("삭제 할 독서명 : ");
//	name = sc.nextLine();
//	row = handler.delete(name);
//	System.out.print(row!=0?"삭제 성공":"삭제 실패");
	
	
	
	
	
}
