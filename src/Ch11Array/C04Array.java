package Ch11Array;

import java.util.Scanner;

public class C04Array {

	public static void main(String[] args) {
		
		// 1. 행,열의 크기를 기본으로 받습니다.
		// 2. 행,열 안에 각각의 위치에 값을 입력
		// 3. 각 행의 값의 총합을 따로 출력
		// 4. 각 열의 값의 총합을 따로 춣력
		// 5. 모든 값의 합을 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행, 열의 크기를 입력 : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int[][] arr = new int[row][col];
		int[] rowsum = new int[row];
		int[] colsum = new int[col];
		int total = 0;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length ;j++) {
				System.out.print("arr["+i+"]["+j+"] 값 입력 : ");
				arr[i][j] = sc.nextInt();
				rowsum[i]+=arr[i][j];
			}
			System.out.println();
		}
		for(int i=0;i<rowsum.length;i++) {
			System.out.println(i+"번째 행의 합 : "+rowsum[i]);
			total += rowsum[i];
		}
		for(int j=0;j<col;j++) {
			for(int i=0;i<row;i++) {
				colsum[j] += arr[i][j];
			}
		}
		for(int j=0;j<colsum.length;j++) {
			System.out.println(j+"번째 열의 합 : "+colsum[j]);
			
		}
		
		System.out.println("모든 값의 총합 : "+total);
	}

}
