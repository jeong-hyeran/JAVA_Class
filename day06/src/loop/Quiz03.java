package loop;

public class Quiz03 {
	public static void main(String[] args) {
		/*
		 은행에 돈을 입금한다.
		 첫날에는 10원, 둘째날에는 20원,셋째날에는 40원
		 이런식으로 전날의 두배를 준비하여 30일 동안 입금한다.
		 입금이 끝나면 은행에 예금된 총 금액은 얼마인지 계산하여 출력하세요
		 출력할 때 printf()의 서식을 활용하여 천단위 구분 콤마를 찍어주세요
		 */
	
		Long money = 10L;
		Long sum = 0L;
		int day = 1;
		/// int범위를 넘어서서 Long형으로 변환해서 받아야한다.
		
	
		while (day <= 30) {
			sum += money;
			money*=2;
			day++;
		}
		System.out.printf("%2d일 입금 금액  : %,d원", day, sum);
		
	}

}
