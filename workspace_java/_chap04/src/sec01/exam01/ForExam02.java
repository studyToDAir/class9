package sec01.exam01;

public class ForExam02 {

	public static void main(String[] args) {

		int sum = 0;
//		for(int i=1; i<=100; i++) {
//		for(int i=1; i<=100; i = i + 1) {
//		for(; i<=100; i = i + 2) {
		
//		int i;
//		i = 1;
		for(int i = 1  ; i<=100; i = i + 1) {
			sum = sum + i;
		}
		System.out.println(sum);
//		System.out.println(i);
		
		// 1씩 증가하는걸 10번 하고 싶다
		int sum1 = 0;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		sum1 = sum1 + 1;
		System.out.println(sum1);
		
		sum1 = 0;
		// for문으로 변경
		for(int i = 1; i <= 10; i = i + 1) {
			sum1 = sum1 + 1;
		}
		System.out.println("sum1 : "+ sum1);

		int limit = 10;
		for(int i = 1; i <= limit; i = i + 1) {
			sum1 = sum1 + 1;
		}

		// 1~5까지의 합을 구하는 것
		/*
		 for(int i = 1  ; i<=5; i = i + 1) {
			sum = sum + i;
		 }
		 분해해 보자
		 */
		int i = 1;
		sum = 0;
		
		sum = sum + i; // i:1
		i++;
		
		sum = sum + i; // i:2
		i++;
		
		sum = sum + i;
		i++;
		
		// 구구단 2단을 출력하시오
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");
		System.out.println("2 x 3 = 6");
		
		sum = sum + 1;
		sum = sum + 2;
		sum = sum + 3;
		sum = sum + 4;
		/*
		 * 반복문 만드는 원리
		 * 
		 * 1. 반복 되는 것 찾기
		 * 		ctrl + c, v 했을 때 바뀌지 않는 것
		 * 2. 반복 되지 않는 것에서
		 * 		규칙(패턴) 찾기
		 * 		변수를 활용해서 더 이상 바뀌지 않게 만들기
		 * 3. 시작 조건 파악
		 * 4. 종료 조건 파악
		 * 
		 * for : 반복 횟수를 아는 경우
		 * while : 반복 횟수를 모르는 경우
		 */
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		int i2 = 1;
		System.out.println( i2 );
		i2 = i2 + 1;

		System.out.println( i2 );
		i2 = i2 + 1;

		System.out.println( i2 );
		
		for(int i3 = 1; i3 <= 3; i3++) {
			System.out.println( i3 );
		}
		
		// 1. 2~10까지 짝수만 출력
		System.out.println(2);
		System.out.println(4);
		System.out.println(6);
		System.out.println(8);
		System.out.println(10);
		
		// 다시 쓰면(슬로우모션)
		System.out.println(2);
		System.out.println(4);
		System.out.println(6);

		// 이번엔 변수를 활용해서 다시 쓰기
		int i3 = 2;
		System.out.println(i3);	// 변수로 바꿈
		i3 += 2;	// 아래줄을 그냥 쓰기 위해
					// 수정 변조
		System.out.println(i3); // 그대로 복사해서 놓음
		
		i3 += 2;
		System.out.println(i3);
		
		i3 += 2;
		System.out.println(i3);
		
		for(int i4 = 2; i4 <= 10; i4 += 2) {
			System.out.println(i4);
		}
		
		int a1;
		int a2;
		int b1=1, b2=2;
		for(int i1=0, j1=100; i1<=50 && j1>=50; i1++, j1-- ) {
			
		}
		
		// 2. 10 ~ 1 출력
		System.out.println(10);
		System.out.println(9);
		int i6 = 10;
		System.out.println(i6);
		i6 -= 1;
		System.out.println(i6);
		i6 -= 1;
		i6--;
		System.out.println(i6);
		for(int i7 = 10; i7 >= 1; i7--) {
			System.out.println(i7);
		}
		
		// 3. 1~10까지 다음과 같이 출력
		//     1: 홀수
		//     2: 짝수
		System.out.println("1: 홀수");
		System.out.println("2: 짝수");
		int i8 = 1;
		String s1 = "홀수";
		System.out.println(i8 + ": "+ s1);
		i8++; // 2
//		만약에 (i8이 짝수면)
//			s1 = "짝수";
//		그렇지 않으면
//			s1 = "홀수";
		if(i8 % 2 == 0) {
			s1 = "짝수";
		} else if(i8 % 2 == 1) {
			s1 = "홀수";
		}
		System.out.println(i8 + ": "+ s1);
		
		i8++; // 3
		if(i8 % 2 == 0) {
			s1 = "짝수";
		} else if(i8 % 2 == 1) {
			s1 = "홀수";
		}
		
		System.out.println(i8 + ": "+ s1);
		
		
		System.out.println("문제3------------");
		for(int i9=1; i9<=10; i9++) {
			String s2 = "";
			if(i9 % 2 == 0) {
				s2 = "짝수";
			} else if(i9 % 2 == 1) {
				s2 = "홀수";
			}
			
			System.out.println(i9 + ": "+ s2);
		}
		
		// 4. 구구단 2단 출력

		
		System.out.println("2 x 1 = 2");
		System.out.println("2 x 2 = 4");

		int num = 1;
		System.out.println("2 x "+ num +" = "+ (2*num));
		num++;
		System.out.println("2 x "+ num +" = "+ (2*num));
		
		System.out.println("문제4------------");
		for(int j=1; j<=9; j++) {
			System.out.println("2 x "+ j +" = "+ (2*j));	
		}
		
		// 5. 1~10까지 3개씩 옆으로 찍기
		//		1 2 3
		//		4 5 6
		//		7 8 9
		//      10
		System.out.println("1 2 3");
		System.out.println("4 5 6");
		int i10 = 1;
		System.out.println(i10 +" "+ (i10+1) +" "+ (i10+2));
		
		i10 = i10 + 3;
		System.out.println(i10 +" "+ (i10+1) +" "+ (i10+2));
		
		System.out.println("문제5.1 ------------");
		for(int j=1; j<=10; j += 3) {
			if(j != 10) {
				System.out.println(j +"  "+ (j+1) +"  "+ (j+2));
			} else {
				System.out.println(j);
			}
		}
		
		/*
		 * 1 2 3 
		 * 4 5 6
		 */
		int i11 = 1;
		System.out.print(i11 + " ");
		if(i11 % 3 == 0) {
			System.out.println();
		}
		i11++;
		System.out.print(i11 + " ");
		if(i11 % 3 == 0) {
			System.out.println();
		}
		
		System.out.println("문제5.2 ------------");
		for(int j=1; j<=10; j++) {
			System.out.print(j + " ");
			if(j % 3 == 0) {
				System.out.println();
			}
		}
		
		// 6. 1부터 100까지 홀수의 개수
		// 1 2 3 4 5
		System.out.println("문제6 ------------");
		int count = 0;
		for(int j=1; j<=100; j++) {
			if(j % 2 != 0) { // 홀수
				count++;
			}
		}
		System.out.println("count: "+ count);
		
		
		// 7. 구구단 전체 출력 (2단부터 9단까지)
		
		for(int j=1; j<=9; j++) {
			System.out.println("2 x "+ j +" = "+ (2*j));	
		}
		for(int j=1; j<=9; j++) {
			System.out.println("3 x "+ j +" = "+ (3*j));	
		}
		
		int i12 = 2;
		for(int j=1; j<=9; j++) {
			System.out.println(i12 +" x "+ j +" = "+ (i12*j));	
		}
		i12++;
		for(int j=1; j<=9; j++) {
			System.out.println(i12 +" x "+ j +" = "+ (i12*j));	
		}
		i12++;
		for(int j=1; j<=9; j++) {
			System.out.println(i12 +" x "+ j +" = "+ (i12*j));	
		}
		
		System.out.println("문제7 ------------");
		for(int k=2; k<=9; k++) {
			System.out.println(k +"단");
			for(int j=1; j<=9; j++) {
				System.out.println(k +" x "+ j +" = "+ (k*j));	
			}
			System.out.println();
		}
		
		// 8. 한줄 1단 씩 출력
		System.out.println("문제8 ------------");
		for(int k=2; k<=9; k++) {
			for(int j=1; j<=9; j++) {
				System.out.print(k +" x "+ j +" = "+ (k*j) + " ");	
			}
			System.out.println();
		}
		
		// 9. 두~세단씩 옆으로 출력
		// 2x1=2 3x1=3
		// 2x2=4 3x2=6
		// ...   ...
		// 4x1=2 5x1=3
		// 4x2=4 5x2=6
		
		for(int j=1; j<=9; j++) {
			System.out.print(2 +" x "+ j +" = "+ (2*j) + " ");	
			System.out.println(3 +" x "+ j +" = "+ (3*j) + " ");	
		}
		System.out.println();
		
		for(int k=2; k<=9; k+=2) {
			
			for(int j=1; j<=9; j++) {
				System.out.print(k +" x "+ j +" = "+ (k*j) + " ");
//				if(!(k > 9)) {
				if( (k+1) <= 9) {
					System.out.println((k+1) +" x "+ j +" = "+ ((k+1)*j) + " ");	
				}
			}
			System.out.println();
			
		}
		
		// 별찍기 피라미드찍기는 PyramidExam에 있음
		
		// 문제 1
		// 주사위 2개를 굴려서 나올 수 있는 모든 조합을 출력한다
		// [1,1] [1,2]
//		for(int j=1; j<=6; j++) {
//			System.out.print("[1, "+ j +"] ");
//		}
//		System.out.println();
//		for(int j=1; j<=6; j++) {
//			System.out.print("[2, "+ j +"] ");
//		}
//		System.out.println();
		for(int k=1; k<=6; k++) {
			for(int j=1; j<=6; j++) {
				System.out.print("["+ k +", "+ j +"] ");
			}
			System.out.println();
		}
		
		// 문제 2
		// 주사위 2개의 합 별로 나올 수 있는 조합
		// 합2 : [1,1]
		// 합3 : [1,2] [2,1]
		System.out.println("문제 2 ----------- ");
//		for(int k=1; k<=6; k++) {
//			for(int j=1; j<=6; j++) {
//				if(k+j == 4) {
//					System.out.print("["+ k +", "+ j +"] ");
//				}
//			}
//			System.out.println();
//		}
//		for(int k=1; k<=6; k++) {
//			for(int j=1; j<=6; j++) {
//				if(k+j == 5) {
//					System.out.print("["+ k +", "+ j +"] ");
//				}
//			}
//			System.out.println();
//		}
		for(int l=2; l<=12; l++) {
			System.out.print("합이 "+ l +": ");
			for(int k=1; k<=6; k++) {
				for(int j=1; j<=6; j++) {
					if(k+j == l) {
						System.out.print("["+ k +", "+ j +"] ");
					}
				}
			}
			System.out.println();
			
		}

		
		// 문제 3
		// 합 별 조합의 수 출력
		System.out.println("문제 3 ----------- ");
		for(int l=2; l<=12; l++) {
			System.out.print("합이 "+ l +": ");
			int cnt = 0; // count약자로 cnt
			for(int k=1; k<=6; k++) {
				for(int j=1; j<=6; j++) {
					if(k+j == l) {
						System.out.print("["+ k +", "+ j +"] ");
						cnt++;
					}
				}
			}
			System.out.print(": 총 개수 : "+ cnt);
			System.out.println();
		}
		
		// 문제 4
		// 순서에 관계 없이 중복 제거
		// 합2 : [1,1]
		// 합3 : [1,2]와 [2,1]는 같음
		System.out.println(">>>>> 문제 4 >>>>>>>>>>");
//		System.out.println("[1,1]");
//		System.out.println("[1,2]");
//		System.out.println("[1,3]");
//		for(int j=1; j<=3; j++) {
//			System.out.println("[1,"+ j +"]");	
//		}
//		
//		System.out.println("[2,2]");
//		System.out.println("[2,3]");
//		for(int j=2; j<=3; j++) {
//			System.out.println("[2,"+ j +"]");	
//		}
//		
//		System.out.println("[3,3]");
//		for(int j=3; j<=3; j++) {
//			System.out.println("[3,"+ j +"]");	
//		}
//		
		for(int k=1; k<=6; k++) {
			for(int j=k; j<=6; j++) {
				System.out.println("["+ k +","+ j +"]");
//				System.out.printf("[%d, %d]", k, j);	
			}
			System.out.println();
		}
		
		for(int l=2; l<=12; l++) {
			System.out.print("합이 "+ l +": ");
			int cnt = 0; // count약자로 cnt
			for(int k=1; k<=6; k++) {
				for(int j=1; j<=6; j++) {
					if(k+j == l && j >= k) {
						System.out.print("["+ k +", "+ j +"] ");
						cnt++;
					}
				}
			}
			System.out.print(": 총 개수 : "+ cnt);
			System.out.println();
		}
		
		
		// 문제 5
		// 입력받은 정수에 따라 다음과 같이 출력
		/* 3
		 * 00 01 02
		 * 10 11 12
		 * 20 21 22
		 */
		/* 4
		 * 00 01 02 03
		 * 10 11 12 13
		 * 20 21 22 23
		 * 30 31 32 33
		 */
		
		// 문제 6
		// 입력받은 정수에 따라 다음과 같이 출력
		// (정사각형)
		/* 3
		 * +++
		 * +.+
		 * +++
		 */
		/* 5
		 * +++++
		 * +...+
		 * +...+
		 * +...+
		 * +++++
		 */
		int z = 15;
		// 한 줄마다
		for(int j=1; j<=z; j++) {

			// 한 칸마다
			for(int k=1; k<=z; k++) {
				// 처음과 마지막 줄
				if(j == 1 || j == z) {
					System.out.print("+");
				}else {
					// 다른 줄에서
					
					// 처음과 마지막 칸
					if(k==1 || k==z) {
						System.out.print("+");
					} else {
						System.out.print(".");
					}
				}
			}
			System.out.println();
		}
		
	}

}
