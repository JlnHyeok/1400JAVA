package Ch04Scanner;

import java.util.Scanner;

public class C05연습2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수 : ");
		String strNum1 = sc.next();
		System.out.print("두번째 수 : ");
		String strNum2 = sc.next();
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("덧셈 결과 : "+result);
		String space = sc.nextLine();
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름 : ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 6자리 : ");
		String pnum1 = sc.nextLine();
		System.out.print("3. 전화번호 : ");
		String mob = sc.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println("이름 : "+name);
		System.out.println("주민번호 : "+pnum1);
		System.out.println("전화번호 : "+mob);
		
		
	}

}
