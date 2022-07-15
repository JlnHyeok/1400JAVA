package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		// 기본
		// while(조건식){}	--> 조건식이 false 가 될 때 까지 {}안의 명령문 반복.
		// 1. 탈출용 변수 지정
		// 2. 탈출용 조건식
		// 3. 조건식이 false가 되도록 하는 연산식
		
//		System.out.println("Hello World!!");	// 10번 찍고싶다.
//		int i=0; // 1. 탈출용 변수
//		while(i<10) {	// 2. 탈출용 조건식
//			System.out.println((i+1)+"번째 Hello World!!");
//			i++;	// 3. 조건식이 거짓이 되기까지위한 연산식
//		}
		
		// 02 1부터 10까지 합 구하기
		
//		int k=1;
//		int sum=0;
//		while(k<=10) {
//			sum+=k;
//			k++;			
//		}
//		System.out.println("1부터 10까지의 합 : "+sum);
		
		
		// 문제
		// 정수값 하나(n)을 입력받아
		// 1부터 n까지의 합을 구한다.
		
//		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 n을 입력 : ");
//		int n = sc.nextInt();
//		int j = 0 ,sum2=0;
//		
//		while(j<=n) {
//			sum2 += j;
//			j++;
//		}
//		System.out.println("1부터 "+n+"까지의 합 : "+sum2);
		
		// 문제2 
		// 정수값 두개(n,m)을 받아 n부터 m까지의 합을 구하라.
		
//		System.out.println("정수값 두개을 작은수 부터 입력하세요 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		// swap
//		if(n>m) {
//			int temp = n;
//			n=m;
//			m=temp;
//		}		
//		
//		i=n;
//		sum = 0;
//		while(i<=m) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(n+" 부터 "+ m+" 까지의 합 : "+sum);
		
		// 2단 구구단
//		int i=1;
//		while(i<=9) {
//			System.out.println("2단 구구단 : 2 X "+i+" = "+i*2);
//			i++;
//		}
		
		// 2단 역순
//		int i = 9;
//		while(i>0) {
//			System.out.println("2 X "+i+" = "+(2*i));
//			i--;
//		}
//		
//		// n단 역순
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나 입력 : ");
//		int n = sc.nextInt();
//		int k = 9;
//		while(k>0) {
//			System.out.println(n+" X "+k+" = "+n*k);
//			k--;
//		}
		
		// 1부터 n까지 수 중에 3의 배수의 합만 구해라
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n을 입력하세요 : ");
		int n = sc.nextInt();
		int i=0,sum = 0;
		while(i<=n) {
			if(i%3 == 0) {
				sum+=i;
			}
			i++;
		}
		
		System.out.println("1부터 n까지 3의 배수의 합은 : "+sum);
			
		
	}

}
