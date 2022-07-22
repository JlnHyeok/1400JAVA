package Ch11Array;

import java.util.Scanner;

public class C02Array {

	public static void main(String[] args) {
		// 문제
		// 1. 배열의 크기를 입력받음
		// 2. 크기만큼 점수를 배열에 차례대로 입력하여 저장.
		// 3. 배열에 저장된 각 요소애 접근하여 전체 합과 평균을 출력
		// 4. 배열안의 저장된 점수중에 가장 큰 값과 가장 작은값을 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 n 입력 : ");
//		int n = sc.nextInt();
//		
//		int[] score = new int[n];
//		int sum = 0;
//		for(int i=0;i<n;i++) {
//			System.out.print("점수 입력 : ");
//			score[i] = sc.nextInt();
//			sum+=score[i];
//		}
//		
//		System.out.println("총합 : "+sum+" 평균 : "+(double)(sum/n));
//		int max = score[0];
//		int min = score[0];
//		
//		for(int i=0;i<score.length;i++) {
//			if(max<=score[i]) {
//				max=score[i];
//			}
//			if(min>=score[i]) {
//				min=score[i];
//			}
//		}
//		
//		System.out.println("최대 : "+max+"/ 최소 : "+min);
		
		//문제
		int[] arr = {10,30,20,15,4};	
		sort(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

	public static void sort(int[] ar) {
		// 배열을 정렬합니다.
		// 선택/삽입/버블/기수/병합/... 선택 정렬 로직 사용

		for (int i = 0; i < ar.length - 1; i++) {
			for (int j = i+1; i < ar.length; j++) {
				if (ar[i] > ar[j]) {
					int tmp = ar[i];
					ar[i] = ar[j];
					ar[j] = tmp;
				}
			}
		}

	}

}
