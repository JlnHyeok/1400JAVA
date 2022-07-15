package Ch07While;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 전체 구구단 출력(2~9단)
		
//		int i=2, j=1;
//		while(i<=9) {
//			j=1;
//			System.out.println("-----"+i+"단-----");
//			while(j<=9) {
//				System.out.printf("%d X %d = %d\n",i,j,i*j);
//				j++;
//			}
//			i++;
//			
//		}
		
		// 문제
//		int i=2;
//		while(i<=9) {
//			int j=9;
//			while(j>0) {
//				System.out.printf("%d X %d = %d\n",i,j,i*j);
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
//		int i=9;
//		while(i>1) {
//			int j=9;
//			while(j>0) {
//				System.out.printf("%d X %d = %d\n",i,j,i*j);
//				j--;
//			}
//			System.out.println();
//			i--;
//		}
		
		// 별찍기
//		int i = 1;
//		while(i<=5) {
//			int j=1;
//			while(j<=5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		// 문제 2
//		int i = 1;
//		while(i<5) {
//			int j=1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		// 문제 3		
//		int i = 4;
//		while(i>0) {
//			int j=1;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i--;
//		}
		
		
		// 문제 4		
		//   *
		//  ***
		// *****
		//*******
		
		int i = 1;
		while(i<=4) {
			int j=1;
			while(i<=3) {
				System.out.print("");
				i++;
			}
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
	}

}
