package Ch07While;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {
		
		// -1을 입력받기 전까지는 무한대로 값을 입력받아
		// 입력된 값의 합을 출력

//		Scanner sc = new Scanner(System.in);
		
//		int sum = 0;
//		while(true) {
//		System.out.println("값을 입력하세요");
//		int n = sc.nextInt();
//		if(n==-1) {
//			break;}		// 가장 근접한 while문을 벗어남
//		sum+=n;
//		}
//		System.out.println("입력된 값의 합은 : "+sum);
		
		
		// continue
		
		// 1부터 10까지의 수 중에 3의 배수를 제외한 합을 출력 
		
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			if(i%3==0) {
//				i++;
//				continue;	// 가까이에 있는 반복문의 조건식으로 돌아감 (skip한다)
//			}
//			System.out.println("i : "+i);
//			sum+=i;
//			i++;			
//		}
//		System.out.println("10까지 3의 배수를 제외한 값의 합 : "+sum);
		
		// 문제
		// 1부터 n까지의 수 중에 4의 배수를 제외한 수의 합과 평균을 구하라. 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 n을 입력 : ");
		int n = sc.nextInt();
		int i=1,count=0,sum=0;
			
		while(i<=n) {
			if(i%4==0) {
				i++;
				continue;
			}
			count++;
			sum+=i;
			i++;
		}
		System.out.println("n까지 4의 배수를 제외한 합 : "+sum);
		System.out.println("평균 : "+(double)sum/count);
		
		
		
		
		
		
	}

}
