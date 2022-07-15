package Ch06IfSwitch;

import java.util.Scanner;

public class C01If {

	public static void main(String[] args) {
		
		// 단순 if 문 
//		int age=7;
//		
//		if(age>=8) 
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		System.out.println("첫번째 if문 벗어남.");
//		if(age<8) 
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("두번째 if문 벗어남.");
//		System.out.println("프로그램을 종료합니다.");
		
		// if(조건식) else 문
//		int age=7;
//		
//		if(age>=8) 
//		{
//			System.out.println("취학 아동입니다.");
//		}
//		else
//		{
//			System.out.println("미취학 아동입니다.");
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		// 문제
		// 정수 하나를 받아서 짝수면 "짝수입니다"
		// 홀수면 "홀수입니다" 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수 하나를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		if(n1%2==0)
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
//		sc.close();
		
		// 문제
		// 정수 하나를 받아서 3의 배수면  "3의 배수입니다"
		// 4의 배수면 "4의 배수입니다" 출력
		
//		Scanner sc1 = new Scanner(System.in);
//		System.out.println("정수 하나를 입력 : ");
//		int n2 = sc1.nextInt();
//		if(n2 % 3 == 0)
//		{
//			System.out.println("3의 배수입니다.");
//		}
//		if(n2 % 4 == 0) 
//		{
//			System.out.println("4의 배수입니다.");}
//		sc1.close();
		
		// 문제
		// 두 정수를 받아서 큰 수를 출력하세요
		
//		Scanner sc2 = new Scanner(System.in);
//		System.out.println("첫번째 정수를 입력하세요 : ");
//		int nn1 = sc2.nextInt();
//		System.out.println("두번째 정수를 입력하세요 : ");
//		int nn2 = sc2.nextInt();
//		if(nn1 > nn2)
//		{
//			System.out.println("큰 수는 "+nn1+"입니다");
//		}
//		else
//		{
//			System.out.println("큰 수는 "+nn2+"입니다");
//		}
//		sc2.close();
		
		// 문제
		// 3의 배수이면서 4의 배수라면 출력
		// 3의 배수가 아니면서 5의 배수면 출력
		
//		Scanner sc4 = new Scanner(System.in);
//		System.out.println("정수 하나 입력 : ");
//		int num1 = sc4.nextInt();
//		if(num1 % 3 == 0)
//		{
//			if(num1 % 4 == 0)
//			{System.out.println("3의 배수이면서 4의 배수 입니다.");}
//		}
//		else 
//		{
//			if(num1 % 5 ==0)
//			{System.out.println("3의 배수가 아니면서 5의 배수 입니다.");}
//		}
		
//		if(num1 % 3 == 0 && num1 % 4 == 0)
//		{
//			System.out.println("3의 배수이면서 4의 배수 입니다.");
//		}
//		if(num1%3!=0 && num1 % 5 ==0)
//			{
//			System.out.println("3의 배수가 아니면서 5의 배수 입니다.");
//			}
//		else
//		{
//			System.out.println("아무것도 아닙니다.");
//		}
		
		// else if 문
		// 
			
		
		// 예제
		// 국어 , 영어, 수학 각각의 점수가 40점 이상이 되어야하고,
		// 총 평균이 60점 이상이 되면 "합격"출력
		// 그게 아니면 "불합격" 출력
		
//		Scanner sc5 = new Scanner(System.in);
//		System.out.println("국어 점수를 입력 :");
//		int kor = sc5.nextInt();
//		System.out.println("영어 점수를 입력 :");
//		int eng = sc5.nextInt();
//		System.out.println("수학 점수를 입력 :");
//		int mat = sc5.nextInt();
//		double avg = (double)(kor+eng+mat)/3;
//		
//		if(avg>=60 && kor>=40 && mat>=40 && eng>=40) {
//			
//			System.out.println("합격");
//		}
//		else
//		{
//			System.out.println("불합격");
//		}
		
		
		// 평균점수를 입력받아 그 점수가
		// 90점 이상이면 'A' 출력
		// 80점 이상이면 'B' 출력
		// 70점 이상이면 'C' 출력
		// 60점 이상이면 'D' 출력
		// 60점 미만이면 'F' 출력
		
//		Scanner sc6 = new Scanner(System.in);
//		System.out.println("평균 점수를 입력 : ");
//		int av = sc6.nextInt();
//		if(av>=90) {
//			System.out.println("A");
//		}
//		else if(av>=80) {
//			System.out.println("B");
//		}
//		else if(av>=70) {
//			System.out.println("C");
//		}
//		else if(av>=60) {
//			System.out.println("D");
//		}
//		else {
//			System.out.println("F");
//		}
		
			
		
		
		
		
		// 문제(강사와 같이)
		// 세 정수를 입력받아서 큰 수를 출력(단순 if문으로만)
			
		Scanner sc3 = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하세요 : ");
		int nu1 = sc3.nextInt();
		System.out.println("두번째 정수를 입력하세요 : ");
		int nu2 = sc3.nextInt();
		System.out.println("세번째 정수를 입력하세요 : ");
		int nu3 = sc3.nextInt();
		sc3.close();
//		
//		if(nu1 > nu2)
//		{
//			if(nu1 > nu3)
//			{System.out.println("가장 큰 수는 "+nu1+"입니다.");}
//		}
//		if(nu2 > nu1)
//		{
//			if(nu2>nu3)
//			{System.out.println("가장 큰 수는 "+nu2+"입니다.");}
//		}
//		if(nu3>nu1)
//		{
//			if(nu3>nu2)
//			{System.out.println("가장 큰 수는 "+nu3+"입니다.");}
//			
//		}
		
		if (nu1>=nu2 && nu1>=nu3) {
			System.out.println("큰 수 : "+nu1);
		}
		else if(nu2>=nu1 && nu2>=nu3) {
			System.out.println("큰 수 : "+nu2);
		}
		else {
			System.out.println("큰 수 : "+nu3);
		}
			
			
	}

}
