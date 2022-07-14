package Ch05Operator;

import java.util.Scanner;

public class C03PercentOper {

	public static void main(String[] args) {
		
		// % 나머지 연산자
		Scanner sc = new Scanner(System.in);
		// 01 짝홀수 구분
//			System.out.println("확인 : "+(10%2));		//0 (짝수)
//			System.out.println("확인 : "+(11%2));		//1 (홀수)
//			System.out.println("확인 : "+(12%2));
//			System.out.println("확인 : "+(13%2));
//			System.out.println("확인 : "+(14%2));
//			System.out.println("확인 : "+(15%2));
			
//			int num = sc.nextInt();
//			String result = (num%2==0)?"짝수입니다.":"홀수입니다.";
//			System.out.println(result);
			
		// 02 배수 구분
		// 수 % 3 == 0 수 는 3의 배수
//			System.out.println("확인 : "+(10%3));
//			System.out.println("확인 : "+(11%3));
//			System.out.println("확인 : "+(12%3));
//			System.out.println("확인 : "+(13%3));
//			System.out.println("확인 : "+(14%3));
//			System.out.println("확인 : "+(15%3));
		
		// 03 자리수 확인
		
			System.out.println(123456789);
			System.out.println(123456789%10);
			System.out.println(123456789%100);
			System.out.println(123456789%1000);
			System.out.println(123456789%10000);		// 뒷자리 확인
			
			System.out.println(123456789/100000000);	// 앞자리 확인
			System.out.println(123456789/10000000);
			System.out.println(123456789/1000000);
			
		
		// 04 범위 제한
			// N % 2 => 0-1
			// N % 3 => 0-2
			// N % 4 => 0-3
			// N % 10 => 0-9
			// N % 100 => 0-99
				
		
	}

}
