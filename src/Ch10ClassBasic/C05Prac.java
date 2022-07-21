package Ch10ClassBasic;

import java.util.Scanner;

public class C05Prac {

	public static void main(String[] args) {
		// String 클래스로 문자열을 하나 입력받습니다.
		// 1. 입력받은 문자열의 길이 출력
		// 2. 문자열의 idx중에 2,3,4만 출력
		// 3. 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어
		//	  있는지 여부 확인
		// 4. 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 일치하는지
		//	  여부 확인
		// 5. 저장된 문자열의 길이를 확인해서 특정문자열 위치 idx확인 후, 검색된 위치에서 마지막 idx까지 잘라내기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문장 입력(5단어 이상) : ");
		String str1 = sc.nextLine();
		System.out.println("문자열 길이 : "+str1.length());
		for(int i=2;i<5;i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		System.out.print("다른 문장 입력 : ");
		String str2 = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < str2.length(); i++) {

			for (int j = i; j < str1.length(); j++) {
				if (str2.charAt(i) == str1.charAt(j)) {
					cnt++;
					break;
				}
			}
			if (i == str2.length() - 1) {

				if (cnt == str1.length()) {
					System.out.println("문장 일치");
				} 
				else if (0 < cnt && cnt < str1.length()) {
					System.out.println("포함");
					System.out.println("검색부터 마지막까지 잘라내기");
					for(int k=cnt;k<str1.length();k++) {
						System.out.print(str1.charAt(k));
					}
				}
				else {
					System.out.println("아예 다름");
				}
			}
		}

	}

}
