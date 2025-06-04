package sec01.exam01;

import java.util.Scanner;

public class PyramidExam03 {

	public static void main(String[] args) {
		////////////////////////////////////
		/*
		 * ....+.... ...+++... ..+++++.. .+++++++. +++++++++
		 */

		// 0단계
		/*
		 * + + + + +
		 */
		System.out.println("+");
		System.out.println("+");
		System.out.println("+");
		System.out.println("+");
		System.out.println("+");

		for (int j = 1; j <= 5; j++) {
			System.out.println("+");
		}

		String mark = "+";
		// 1단계
		/*
		 * +++++
		 */
		for (int j = 1; j <= 5; j++) {
			System.out.print(mark);
		}
		System.out.println();
		// 2단계
		String space = ".";
		/*
		 * +.+.+.+.+.
		 */
		for (int j = 1; j <= 5; j++) {
			System.out.print(mark);
			System.out.print(space);
		}
		System.out.println();

		// 3단계
		/*
		 * +++++ 
		 * +++++ 
		 * +++++
		 */
		// System.out.print(mark);
		// System.out.print(mark);
		// System.out.print(mark);
		// System.out.print(mark);
		// System.out.print(mark);
		// System.out.println();

		// for(int j=1; j<=5; j++) {
		// System.out.print( mark );
		// }
		// System.out.println();

		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}

		// 4단계
		/*
		 * 11111 
		 * 22222 
		 * 33333 
		 * 44444 
		 * 55555
		 */
//		for(int j=1; j<=5; j++) {
//			System.out.print(1);
//		}
//		System.out.println();
//		
//		for(int j=1; j<=5; j++) {
//			System.out.print(2);
//		}
//		System.out.println();
		System.out.println(" 4단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 5단계
		/*
		 * 1 
		 * 22 
		 * 333 
		 * 4444 
		 * 55555
		 */
//		System.out.print(1);
//		System.out.println();
//		
//		System.out.print(2);
//		System.out.print(2);
//		System.out.println();

//		for(int j=1; j<=1; j++) {
//			System.out.print( 1 );
//		}
//		System.out.println();
//		
//		for(int j=1; j<=2; j++) {
//			System.out.print( 2 );
//		}
//		System.out.println();
//		
//		for(int j=1; j<=3; j++) {
//			System.out.print( 3 );
//		}
//		System.out.println();

		System.out.println(" 5단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		// 6단계
		/*
		 * + 
		 * ++ 
		 * +++ 
		 * ++++ 
		 * +++++
		 */
		System.out.println(" 6단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		
		// 7단계
		/*
		 * 11111 
		 * 2222 
		 * 333 
		 * 44 
		 * 5
		 */
		System.out.println(" 7단계 ");
		
//		for (int j = 1; j <= 5; j++) {
//			System.out.print(1);
//		}
//		System.out.println();
//		
//		for (int j = 1; j <= 4; j++) {
//			System.out.print(2);
//		}
//		System.out.println();
		
		for(int i=5; i>=1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print( 6-i );
			}
			System.out.println();
		}
		
		System.out.println(" 7-1단계 ");
		for(int i=1; i<=5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print( i );
			}
			System.out.println();
		}
		
		// 8단계
		/*
		 * +.... 
		 * ++... 
		 * +++.. 
		 * ++++. 
		 * +++++
		 */
		System.out.println(" 8단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			
			for (int j = 1; j <= 5-i; j++) {
				System.out.print( space );
			}
			
			System.out.println();
		}
		// 9단계
		/*
		 * ....+ 
		 * ...++ 
		 * ..+++ 
		 * .++++ 
		 * +++++
		 */
		System.out.println(" 9단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print( space );
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}
		// 10단계
		/*
		 * ....+ 
		 * ...+++ 
		 * ..+++++ 
		 * .+++++++ 
		 * +++++++++
		 */
		System.out.println(" 10단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print( space );
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(mark);
			}
			System.out.println();
		}

		// 11단계
		/*
		 * ....+.... 
		 * ...+++... 
		 * ..+++++.. 
		 * .+++++++. 
		 * +++++++++
		 */
		System.out.println(" 11단계 ");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5-i; j++) {
				System.out.print( space );
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(mark);
			}
			for (int j = 1; j <= 5-i; j++) {
				System.out.print( space );
			}
			System.out.println();
		}
		// 12단계
		// 입력 받은 줄 수대로 출력
		// 예를 들어 3이면
		Scanner scan = new Scanner(System.in);
		System.out.print("총 몇줄?");
		int max = scan.nextInt();
		/*
		 * ..+.. 
		 * .+++. 
		 * +++++
		 */
		for (int i = 1; i <= max; i++) {
			for (int j = 1; j <= max-i; j++) {
				System.out.print( space );
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(mark);
			}
			for (int j = 1; j <= i-1; j++) {
				System.out.print(mark);
			}
			for (int j = 1; j <= max-i; j++) {
				System.out.print( space );
			}
			System.out.println();
		}
	}
}
