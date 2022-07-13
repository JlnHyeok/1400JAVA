package Ch05Operator;

import java.util.Scanner;

public class C01Basic {

	public static void main(String[] args) {
//		// 산술 연산자
//		int a =10, b=3, c;
//		System.out.println("a + b = "+(a+b));
//		System.out.println("a - b = "+(a-b));
//		System.out.println("a * b = "+(a*b));
//		System.out.println("a / b = "+(a/b));		// 몫 계산
//		System.out.println("a % b = "+(a%b));		// 나머지 계산 % 연산자 중요!
//																	// 1) 짝홀수   / 2) 배수   3) 끝자리  4) 수 범위 제한
//		
//		System.out.println("-a = "+(-a));				// a = -a랑 혼돈 주의!
		
		// 복합대입연산자
//
//		int a = 10;
//		a+=10;		// a = a+10
//		System.out.println("a : " +a);
//		a-=5;			// a = a-5
//		System.out.println("a : " +a);
//		a*=7;		// a = a*7
//		System.out.println("a : " +a);
//		a/=7;		// a = a/7
//		System.out.println("a : " +a);
		
		// 비교 연산자
		// > >= < <= == !=
		
//		int a= 10, b= 20;
//		// System.out.println("a == b ? "+(a=b)); 	// = <- 대입 연산자이다.
//		System.out.println("a == b ? "+(a==b));
//		System.out.println("a >= b ? "+(a>=b));
//		System.out.println("a > b ? "+(a>b));
//		System.out.println("a <= b ? "+(a<=b));
//		System.out.println("a < b ? "+(a<b));
//		System.out.println("a != b ? "+(a!=b));

		// 논리 연산자
		// and 연산자(&&)	:	둘 다 참이면 참(true)반환
		// or 연산자(||) 	:	둘 중 하나라도 참이면 참(true)반환
		// ! 부정 연산자 : true 인 경우 false반환, false 인 경우 true 반환
		
//		System.out.println("true && true ? "+ (true&&true));
//		System.out.println("false && true ? "+ (false&&true));
//		System.out.println("true && false ? "+ (true&&false));
//		System.out.println("false && false ? "+ (false&&false));
		
//		int a=10, b=20, c=15;
//		System.out.println("a>=b && a>=c ? "+ (a>=b && a>=c));
//		System.out.println("b>=c && b>=a ? "+ (b>=c&& b>=a));
//		System.out.println("true && false ? "+ (true&&false));
//		System.out.println("false && false ? "+ (false&&false));
		
		
//		System.out.println("true||true ? " + (true||true));
//		System.out.println("false||true ? " + (false||true));
//		System.out.println("true||false ? " + (true||false));
//		System.out.println("false||false ? " + (false||false));
		
//		boolean flag = true;
//		System.out.println(!flag);
		
		// 증감 연산자(++ , --)
		// 전치 연산자 : ++a, --a 	-- 1증가, 1감소		-> 변수안의 값을 먼저 증가 or 감소 시키고 다른 연산처리
		// 후치 연산자 : a++, a--		-- 1증가, 1감소		-> 해당 연산 처리를 먼저 한 후 증가 or 감소 시킴
		
//		int a=10, b=20, c,d;
//		c=--a + b--;
//		d=a-- + --b;
//		System.out.printf("%d %d  %d %d\n",a,b,c,d);
		
		// 삼항 연산자 (if 문으로 대체가능, 단순구조의 분기문)
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int score = sc.nextInt();
		char grade = (score>90)? 'A' : 'B' ;
		System.out.println("grade : " + grade);
		
		//문제
		// 두 수를 입력받아 큰 수를 출력하세요.
		
		System.out.println("첫번째 수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("두번째 수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("둘 중 큰 수 : "+ ((num1>num2)?num1:num2));
		
	}

}
