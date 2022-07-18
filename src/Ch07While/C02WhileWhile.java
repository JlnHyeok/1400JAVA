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
		
//		int i=4;
//		int j=1;
//		while(i>0) {			
//			int k=1;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}
//			k=1;
//			while(k<=2*j-1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i--;
//			j++;
//		}
		
		// 문제 5
		//*******
		// *****
		//  ***
		//   *
		
//		int i=1;
//		int j=4;
//		while(i<=4) {			
//			int k=1;
//			while(k<i) {
//				System.out.print(" ");
//				k++;
//			}
//			k=1;
//			while(k<=2*j-1) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//			j--;
//		}
		
		// 문제 6
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
		
		int i = 1;
		int j = 1;
		int k = 1;
		while (i <= 7) {
			while (i <= 4) {
				k = 1;
				while (k <= 4 - i) {
					System.out.print(" ");
					k++;
				}
				j = 1;
				while (j <= i * 2 - 1) {
					System.out.print("*");
					j++;
				}
				System.out.println(" ");
				i++;
			}
			while (i > 4) {
				k = 1;
				while (k <= i - 4) {
					System.out.print(" ");
					k++;
				}
				j = 1;
				while (j <= 7 - 2 * (i - 4)) {
					System.out.print("*");
					j++;
				}
				System.out.println(" ");
				i++;
				if (i == 8) {
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
