package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	public static void main(String[] args) {

		System.out.println(1);


		
		System.out.println(2);
		
		System.out.print(3);
		System.out.print(4);
		
		System.out.println();
		System.out.println(5);
		System.out.println(6);
		
		System.out.printf("이름: %s", "김자바");
		System.out.println();
		
		System.out.printf("이름: %s, 나이: %d", "김자바", 25);
//		System.out.printf("이름: "+ name +", 나이: "+ age);
		System.out.println();
		
		System.out.printf("이름: %6s, 나이: %04d", "김자바", 25);
		System.out.println();
		
		///////////////////////////////////
		// 입력
		int keyCode;
		
//		String a = "abc";
//		try {
//			Integer.parseInt(a);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		/*
		 * Scanner 연습하려고 주석 처리
		try {
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);

			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
			
			keyCode = System.in.read();
			System.out.println("keyCode: "+ keyCode);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		// 엔터까지의 모든 글씨
		String inputData = scan.nextLine();
//		String inputData = "a";
		System.out.println("inputData : "+ inputData);
		
		// 엔터쳤을 때 띄어쓰기까지의 모든 글씨
		String inputData2 = scan.next();
		System.out.println("inputData2 : "+ inputData2);
		
		// 엔터쳤을 때의 숫자
		int input = scan.nextInt();
		System.out.println("input: "+ (input*10));
		
		System.out.print("x값을 입력하시오 :");
		int input2 = scan.nextInt();
		System.out.println("입력한 x 값: "+ input2);
	}

}
