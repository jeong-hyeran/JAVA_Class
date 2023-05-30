package tv;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//	객체 생성
		TV tv = new TV();
		
//		tv.turn();
//		tv.channelup();
//		tv.channeldown();
//		tv.volumeup();
//		tv.volumeup();
//		tv.volumeup();
//		tv.volumeup();
//		tv.volumeup();
//		tv.muteon();
//		tv.volumeup();
//		tv.volumeup();
//		tv.muteoff();
//		tv.volumeup();
//		tv.volumeup();
//		tv.volumedown();
	// 생성된 TV 개체의 기능 테스트
		int num=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("전원 on\t[1]\n채널 업\t[2]\n채널 다운\t[3]\n음량 업\t[4]\n음량 다운\t[5]\n음소거 on\t[6]\n음소거off\t[7]\n");
		System.out.println("원하는 버튼은 입력하세요");
		num = sc.nextInt();
		while(true) {
			if(tv.power!=true) {
			if(num == 1) tv.turn(); continue;
			if(num == 2) tv.channelup(); continue;
			if(num == 3) tv.channeldown(); continue;
			if(num == 4) tv.volumeup(); continue;
			if(num == 5) tv.volumedown(); continue;
			if(num == 6) tv.muteon(); continue;
			if(num == 7) tv.muteoff(); 
			}else {
				break;
			}
			
			
	}
//		while (true) {
//			switch (num) {
//			case 1:	tv.turn();			break;
//			case 2:	tv.channelup();		break;
//			case 3: tv.channeldown();	break;
//			case 4:	tv.volumeup();		break;
//			case 5:	tv.volumeup();		break;
//			case 6:	tv.muteon();		break;
//			case 7: tv.muteoff();		break;
//
//			default:
//				break;
//			}
//		}
		
		sc.close();
	}

}

