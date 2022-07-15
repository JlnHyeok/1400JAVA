package Ch06IfSwitch;

import java.util.Scanner;

public class C02Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		
		switch(rank)	// break문이 없으면 해당 케이스 이후의 케이스도 다 실행된다.
		{
			case 1:
				System.out.println("금메달 입니다.");
				break;
			case 2:
				System.out.println("은메달 입니다.");
				break;
			case 3:
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("!!");
		}
		
		
		
		
	}

}
