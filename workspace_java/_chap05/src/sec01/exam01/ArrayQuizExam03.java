package sec01.exam01;

import java.util.Scanner;

public class ArrayQuizExam03 {

	public static void main(String[] args) {

//		* 문제 0
//		배열 깊은 복사 : {1,2,3} -> {1,2,3}
		int[] arr0 = {1, 2, 3};
//		int[] arr01 = arr0;
//		int[] arr01 = {1, 2, 3};
		int[] arr01 = new int[ arr0.length ];
		for(int i=0; i < arr0.length; i++) {
			arr01[i] = arr0[i];
		}
		System.out.println("문제 0 ------------");
		for(int i=0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
//		* 문제1
//		배열 뒤집기 : {1,2,3} -> {3,2,1}
		arr01 = new int[ arr0.length ];
		arr01[0] = arr0[arr0.length-1];
		arr01[1] = arr0[arr0.length-2];
		arr01[2] = arr0[0];
		for(int i=0; i < arr01.length; i++) {
			arr01[i] = arr0[arr01.length - (i + 1)];
		}
		System.out.println("문제 1 ------------");
		for(int i=0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
//
//		```
//		여기서 = {3,4,7,5,1,9,4}
//		```
		int[] array = {3,4,7,5,1,9,4};
//		* 문제2
//		여기서 홀수의 개수 찾기
		int count = 0;
		for(int i=0; i < array.length; i++) {
			// 홀수 만 세기
			if(array[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println("문제 2 ------------");
		System.out.println(count);
//
//		* 문제3
//		여기서 4보다 큰 수의 개수 구하기
		count = 0;
		for(int i=0; i < array.length; i++) {
			// 4 초과
			if(array[i] > 4) {
				count++;
			}
		}
		System.out.println("문제 3 ------------");
		System.out.println(count);
//
//		* 문제4
//		여기서 최대값을 출력하시오
		// 만약에 두개라면?
//		int a = 3;
//		int b = 4;
//		if(a > b) {
//			System.out.println("둘 중에 큰 수는 "+ a);
//		} else if(a < b){
//			System.out.println("둘 중에 큰 수는 "+ b);
//		} else {
//			System.out.println("둘다 같음 "+ b);
//		}
		// 1. 일단 처음 값을 최대값 변수에 저장
		// 2. 다음부터 최대값 이었던 것과 비교해서 큰 값을 최대값으로 갱신
		// 3. 반복하다 보면 가장 큰 값이 최대값 변수에 남아있겠다
		int max = array[0];
//		max = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("문제 4 ------------");
		System.out.println(max);
		
//
//		* 문제5
//		여기서 두번째 큰 수 구하기
		// 두번째 큰 수 라는건 첫번째를 제외하고 가장 큰 수
		int max2 = Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if( array[i] != max  &&  array[i] > max2) {
				max2 = array[i];
			}
		}
		System.out.println("문제 5 ------------");
		System.out.println(max2);
//
//		* 문제6
//		오른쪽으로 한칸 밀기(왼쪽은 0으로 채우기)
//		예시 : {3,4,7,5,1,9,4} -> {0,3,4,7,5,1,9,4}
		int[] array2 = new int[array.length + 1];
//		System.out.println(array2[0]);
		array2[0] = 0;
//		array2[1] = array[0];
//		array2[2] = array[1];
		for(int i=1; i<array2.length; i++) {
			array2[i] = array[i-1];
		}
		System.out.println("문제 6 ------------");
		for(int i=0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
//
//		* 문제7
//		오른쪽이 이동 하는데 맨 끝에 값을 맨 처음으로 보내기
//		{3,4,7,5,1,9,4} -> {4,3,4,7,5,1,9}
		// 같은 크기의 배열을 일단 만들고
		// 원본의 맨 마지막 값을 사본의 맨 처음에 넣기
		// 나머지는 사본의 두번째 부터 복사
		int[] array7 = new int[array.length];
		array7[0] = array[array.length - 1];
		for(int i=1; i<array7.length; i++) {
			array7[i] = array[i-1];
		}
		System.out.println("문제 7 ------------");
		for(int i=0; i < array7.length; i++) {
			System.out.println(array7[i]);
		}
//
//		* 문제8
//		임시비밀번호 8자리 생성
//			* 8-1 : 숫자만
//			* 8-2 : 소문자만
//			* 8-3 : 숫자2개 이상, 대/소문자 각 1개 이상
		int[] arr8 = new int[8];
		for(int i=0; i<arr8.length; i++) {
			// 한자리 숫자 random
			arr8[i] = (int)(Math.random()*10);
		}
		System.out.println("문제 8-1 ------------");
		for(int i=0; i < arr8.length; i++) {
			System.out.print(arr8[i]+", ");
		}
		System.out.println();
//		char[] a = {'a','b',,,,'z'}
		// 97~122 까지 random()으로 뽑기
		// 0~25
//		(int)(Math.random()*26) + 97
		// 번외편. random 공식을 완성해보자
//		int start = 97;
//		int end = 122;
//		(int)(Math.random()* (end - start + 1) ) + start;
		char[] arr82 = new char[8];
		for(int i=0; i<arr82.length; i++) {
			int start = 97;
			int end = 122;
			arr82[i] = (char)((int)(Math.random()* (end - start + 1) ) + start);
		}
		System.out.println("문제 8-2 ------------");
		for(int i=0; i < arr82.length; i++) {
			System.out.print(arr82[i]+", ");
		}
		System.out.println();
		
		char[] arr83 = new char[8];
		// 숫자
		int start = 48;
		int end = 59;
		arr83[0] = (char)((int)(Math.random()* (end - start + 1) ) + start);
		arr83[1] = (char)((int)(Math.random()* (end - start + 1) ) + start);
		
		// 대문자
		start = 65;
		end = 90;
		arr83[2] = (char)((int)(Math.random()* (end - start + 1) ) + start);

		// 소문자
		for(int i=3; i<arr83.length; i++) {
			start = 97;
			end = 122;
			arr83[i] = (char)((int)(Math.random()* (end - start + 1) ) + start);
		}
		System.out.println("문제 8-3 ------------");
		for(int i=0; i < arr83.length; i++) {
			System.out.print(arr83[i]+", ");
		}
		System.out.println();
		
		// 8번 반복하면서
		// 이번에 나올 숫자/대문자/소문자 random()으로 선택
		// 대충 마지막 쯤에서 숫자2개/대문자1개/소문자1개 나왔었는지 판단
		
//
//		* 문제9
//		자리가 10개 있는 소극장의 예약 시스템
//		자리 번호는 1~10번까지 번호의 자리가 있습니다.
//		메뉴 : "1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료"
//		만약1 : 예약이 가능하다면 "n번 자리 예약 했습니다"
//		만약2 : 예약이 불가능하다면 "이미 예약 되어 있습니다"
		int[] seat = new int[10];	// 0:예약가능, 1:예약완료
		// 예를 들어 3번째 자리에 예약을 했다
//		seat[2] = 1;
		
//		System.out.println("1.예약 2.모든 좌석 현황 3.잔여좌석 0.종료");
//		Scanner scan = new Scanner(System.in);
//		int booking = scan.nextInt();
		int menu = -1;
		do {
			// 받기
			System.out.println("1.예약 2.모든 좌석 현황 3.잔여 좌석 0.종료");
			Scanner scan = new Scanner(System.in);
			menu = scan.nextInt();
			
			int 한글 = 10;
			
			
			switch(menu) {
				case 1:
					System.out.println("몇번 자리?(0-9)");
					int booking = scan.nextInt();
					if(booking<0 || booking>9) {
						System.out.println("자리를 확인해주세요");
					} else {
						if(seat[booking] == 1) {
							System.out.println("이미 예약된 자리");
						} else {
							seat[booking] = 1;
							System.out.println(booking +"자리 예약 했습니다");
						}
					}
					break;
				case 2:
					for(int i=0; i<seat.length; i++) {
						String a = "가능";
						if(seat[i] == 1) {
							a = "불가능";
						}
						System.out.print(i + "번 자리 : "+ a);
					}
					break;
				case 3:
					System.out.println("예약 가능 좌석 번호 : ");
					for(int i=0; i<seat.length; i++) {
						if(seat[i] == 0) {
							System.out.print(i + "번, ");
						}
					}
					System.out.println();
					break;
				case 0:
					System.out.println("종료 합니다");
					break;
			}
			
		}while(menu != 0);
		
//
//		* 문제10
//		로또 6개 생성. 단, 중복 없이
		
		// 1. 로또 번호 하나 뽑기
		// 2. 중복 체크
		/*
		int[] lotto = new int[6];
		lotto[0] = (int)(Math.random()*45) + 1; // 15
		lotto[1] = (int)(Math.random()*45) + 1;	// 15
//		if(lotto[0] == lotto[1]) {
//			// 중복발생!
//			// 다시 뽑기
//			lotto[1] = (int)(Math.random()*45) + 1;	// 15
//			// 또 반복
//			if(lotto[0] == lotto[1]) {
//				// 중복발생!
//				// 다시 뽑기
//				lotto[1] = (int)(Math.random()*45) + 1;	// 15
//				// 또 반복.... 횟수를 모르는 반복
//			}
//		}
		
		while(lotto[0] != lotto[1]) {
			lotto[1] = (int)(Math.random()*45) + 1;
		}
		// 16
		
		lotto[2] = (int)(Math.random()*45) + 1;	// 16
//		while(lotto[0] != lotto[2] && lotto[1] != lotto[2]) {
//			lotto[2] = (int)(Math.random()*45) + 1;
//		}
		// 다시 쓰면
		// 일단 추출
		boolean flag = false;
		do {
			flag = false;
			lotto[2] = (int)(Math.random()*45) + 1;
			for(int i=0; i<2; i++) {
				if(lotto[i] == lotto[2]) {
					flag = true;
				}
			}
		} while( flag );
		*/
		
		int[] lotto = new int[6];
		boolean flag = false;
		for(int i=0; i<lotto.length; i++) {
			do {
				flag = false;
				lotto[i] = (int)(Math.random()*45) + 1;
				for(int j=0; j < i; j++) {
					if(lotto[j] == lotto[i]) {
						System.out.println("중복:"+ lotto[i]);
						flag = true;
					}
				}
			} while( flag );
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+ ", ");
		}
		System.out.println();
	}

}






