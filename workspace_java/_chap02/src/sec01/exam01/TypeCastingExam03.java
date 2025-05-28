package sec01.exam01;

public class TypeCastingExam03 {

	public static void main(String[] args) {
		
		// 형 변환 연산자
		// type casting operator
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		// 여기서 () 우선 순위 연산자
		int a = 2 * (3 + 4);
		
		// 여기서 () 형 변환 연산자
		// byte byteValue = (byte)intValue;

		intValue = 200;
		byteValue = (byte)intValue;
		// 127을 넘어가니까 예상하기 힘들다
		// 비트를 2의 보수로 계산한 결과가 나온다
		System.out.println(byteValue);
		
		double d = -3.14;
		int i = (int) d;
		System.out.println("i: "+ i);
		
		int i2 = 100;
		long l1 = (long)i2;
		long l2 = i2;
		
		int i3 = 3;
		long l3 = 4L;
		long l4 = i3 + l3;
		// (long)i3 + l3;
		
		int i4 = 2100000000;
		int i5 = 2100000000;
		int i6 = i4 + i5;
		System.out.println(i6); //-94967296
		
		int i7 = 10;
		double d7 = 5.5;
		double d8 = i7 + d7;	// (double)i7 + d7
		System.out.println("d8: "+ d8);
		
//		double d9 = 10.0 / 4;
//		double d9 = (double)10 / (double)4;
		double d9 = (double)10 / 4;
		System.out.println("d9: "+ d9);
		
		// 문자를 숫자로 바꾸기
		String s1 = "123";
//		String s1 = "123a";
//		int i8 = (int)s1;
		int i8 = Integer.parseInt(s1);
		
		// 가장 쉽게 숫자를 문자로 바꾸는 방법
		String s2 = ""+i8;
		
		// 퀴즈
		// 회식비 4.3만원
		// 참석인원 4명
		// 이 때 인당 얼마 내야 하는가?
		// 1. 디테일하게 원단위까지
		// 2. 참석인원은 만원단위로만 회식비를 낸다
		// [3]. 2번처럼 받으면 주최자는 얼마를 내야 하나?
		double total = 4.3;
		int count = 4;
//		double result1 = total / (double)count;
		double result1 = total / count;
		System.out.println("1번 : "+ (result1 * 10000));
		
		int result2 = (int)result1;
		System.out.println("2번 : "+ (result2 * 10000));
		
		double result3 = total - ((count-1) * result2);
		System.out.println("3번 : "+ (result3 * 10000));
		
		System.out.println("3번 : "+ (Math.ceil(result3*10000)));
	}

}
