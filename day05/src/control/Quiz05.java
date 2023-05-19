package control;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		/*
		   사탕[ 1개에 500원]입니다.
		 [ 50개 이상] 구매하면 전체의 [8%]를 할인하고
		  [100개 이상] 구매하면 전체의 [12%]를 할인 합니다.
		  
		  [구매 수량]을 입력하여 [결제할 금액]을 계산하여 출력하세요
		 (단, 각각의 할인율은 중복해서 적용 할 수 없습니다.)
		 */
//		System.out.printf("결제 금액 : %,d원\n",12000);
		
		// 여러 조건이 있을 경우 우선순위를 생각하면서 코드를 작성해야 한다.
		
		// 강사님 풀이
		Scanner sc = new Scanner(System.in);

		int count;
		int price;
		double salespercent;
		
		System.out.print("구매 수량 : ");
		count = sc.nextInt();
	

		if(count >= 100) {
			salespercent = 0.12; 
		}
		else if(count >= 50) {
			salespercent = 0.08;
		}
		else {
			salespercent = 0;
		}
		
		price = count *500;
		price -= price * salespercent;
		System.out.printf("결제 금액 : %,d원\n", price);
		
		
		
		
		sc.close();
		
	}

}



//		double candy = 500.0;
//		double buy;
//		double  total;  // 총 금액
//		double discount = 1.0;  
//		double discount1 = 0.08;  //50이상 할인
//		double discount2 = 0.12;	//100 이상 할인
//		
//		System.out.print("구매 수량 : ");
//		buy = Double.parseDouble(sc.nextLine());
//		System.out.println();
//		
//		
//		total = buy * discount;
//		
//		
//		  if (buy >= 50) { 
//			  total = total * 0.08; }
//		  
//		  if (buy >= 100) { 
//			  total *= 0.12; }
//	
//		
//		System.out.printf("결재 금액 : %,d원\n", total);
//		