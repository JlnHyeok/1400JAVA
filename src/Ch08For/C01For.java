package Ch08For;

import java.util.Scanner;

public class C01For {

	public static void main(String[] args) {
		
//		int i=1;
//		while(i<=10) {
//			System.out.println("i : " +i);
//			i++;
//		}
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("i : " +i);
//		}
		
		// 1부터 n까지의 합
		// n부터 m까지의 합
		// n부터 m까지 수 중에 3의 배수를 제외한 합
		// 구구단 출력
		// ------------ 중첩 for문 ---------------
		// 전체 구구단 출력
		// 전체 구구단 역순 출력
		// 별찍기(직삼각형, 역직삼각형, 정삼각형, 역정삼각형....)
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 n입력 : ");
//		int n = sc.nextInt();
//		int sum=0;
//		for(int i = 0; i<=n; i++) {
//			sum+=i;
//		}
//		System.out.println("sum : "+sum);
		
		
//		System.out.println("정수 n,m입력 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		if(n>m) {
//			int temp=n;
//			n=m;
//			m=temp;
//		}
//		int sum=0;
//		for(int i = n; i<=m; i++) {
//			sum+=i;
//		}
//		System.out.println(n+"부터"+m+"까지의 합 : "+sum);
		
		System.out.println("정수 n,m입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(n>m) {
			int temp=n;
			n=m;
			m=temp;
		}
		int count=0;
		int sum=0;
		for(int i = n; i<=m; i++) {
			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println(i);
			sum+=i;
			count++;
			i++;
		}
		System.out.println(n+"부터"+m+"까지 3의 배수를 제외한 값들의 합 : "+sum);
		System.out.println(n+"부터"+m+"까지의 합의 평균 : "+(double)sum/count);
		
		
	}

}
