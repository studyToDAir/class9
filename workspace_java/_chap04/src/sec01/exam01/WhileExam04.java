package sec01.exam01;

import java.util.Scanner;

public class WhileExam04 {

	public static void main(String[] args) {
		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
//		
//		int menu = scan.nextInt();
//		
//		if(menu == 1) {
//			System.out.println("커피 드릴께요");
//		} else if(menu == 2) {
//			System.out.println("차 드릴께요");
//		} else if(menu == 0) {
//			System.out.println("주문을 종료합니다. 다음에 뵈요");
//		} else {
//			System.out.println("주문을 확인하세요");
//		}
//		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
//		
//		menu = scan.nextInt();
//		
//		if(menu == 1) {
//			System.out.println("커피 드릴께요");
//		} else if(menu == 2) {
//			System.out.println("차 드릴께요");
//		} else if(menu == 0) {
//			System.out.println("주문을 종료합니다. 다음에 뵈요");
//		} else {
//			System.out.println("주문을 확인하세요");
//		}
		
		int menu = -1;
//		for( ; menu != 0; ) {
		while(menu != 0) {

			System.out.println("메뉴를 고르세요");
			System.out.println("1:커피, 2:차, 0:종료");
			
			menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("커피 드릴께요");
			} else if(menu == 2) {
				System.out.println("차 드릴께요");
			} else if(menu == 0) {
				System.out.println("주문을 종료합니다. 다음에 뵈요");
			} else {
				System.out.println("주문을 확인하세요");
			}
			
		}
		
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1:커피, 2:차, 0:종료");
//		
//		menu = scan.nextInt();
//		while(menu != 0) {
		do {

			System.out.println("메뉴를 고르세요");
			System.out.println("1:커피, 2:차, 0:종료");
			
			menu = scan.nextInt();

			if(menu == 1) {
				System.out.println("커피 드릴께요");
			} else if(menu == 2) {
				System.out.println("차 드릴께요");
			} else if(menu == 0) {
				System.out.println("주문을 종료합니다. 다음에 뵈요");
			} else {
				System.out.println("주문을 확인하세요");
			}
			
		} while(menu != 0);

		
		
		
		
		
		
	}

}
