package oop;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		
		String[] nameArray = {"짱구", "유리", "훈이", "맹구", "철수"};
		double[] heightArray = {105.9, 104.2, 106.2, 113.9, 108.7};
		
		for (int i = 0; i < 5; i++) {
			String name = nameArray[i];
			double heigh = heightArray[i];
			System.out.printf("%s의 키는 %.1fcm입니다.\n", name, heigh);
		}
		System.out.println();
		
		// 위 배열 데이터를 이용하여 이름 기준 오름차순으로 정렬하고 다시 출력하세요
		String tmp;
		double tmp1;
		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				if(nameArray[i].compareTo(nameArray[j]) > 0){
					tmp = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = tmp;
					
					tmp1 = heightArray[i];
					heightArray[i] = heightArray[j];
					heightArray[j] = tmp1;
					
				}
			}
		}
		for (int i = 0; i < 5; i++) {
			String name = nameArray[i];
			double heigh = heightArray[i];
			System.out.printf("%s의 키는 %.1fcm입니다.\n", name, heigh);
		}
			System.out.println();
			System.out.println(Arrays.toString(nameArray));
			System.out.println(Arrays.toString(heightArray));
		}
	}


