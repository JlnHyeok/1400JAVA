package Ch10ClassBasic;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {
		String str1 = new String("JAVA IS");
		String str2 = new String(" Powerful");
		String str3 = str1 + str2;
		
		System.out.println(str3);
		
		System.out.println("길이 : "+str1.length());
		System.out.println("단일문자 찾기 : "+str1.charAt(1));		// 1번 위치에 있는 문자
		System.out.println("문자열 Idx 검색 : "+str1.indexOf("V"));
		System.out.println("문자열 자르기 : "+str1.substring(1,2)); // 1번부터 (n-1)번까지 
		System.out.println("포함문자열 검색 : "+str1.contains("VA"));	// true, false 로 나타남
		System.out.println("문자열 교체하기 : "+str1.replace('A', 'a'));
		
		// 단일 한문자 받기 연습
//		Scanner sc = new Scanner(System.in);
		char tmp = "안녕하세요".charAt(0);
		
		System.out.println("단일문자 확인 : "+tmp);
		Scanner sc = new Scanner(System.in);
		// String 클래스로 문자열을 하나 입력받습니다
		String str4 =sc.nextLine(); 
		// 1 입력받은 문자열의 길이 출력
		System.out.println("길이 : " + str4.length());
		// 2 문자열의 idx중에 2,3,4 만 출력
		System.out.printf("%c %c %c\n", str4.charAt(2),str4.charAt(3),str4.charAt(4));
		// 3 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 포함되어
		// 있는지 여부 확인
		String str5 = sc.nextLine();
		System.out.println("포함여부  : " +str4.contains(str5));
		// 4 다른 문자열을 하나 더 받아서 이전에 저장된 문자열에 해당 문자열이 
		// 일치하는지 여부 확인
		System.out.println("일치여부  : " +str4.equals(str5));
		// 5 저장된 문자열의 길이를 확인해서, 특정문자열 위치 idx 확인후
		// 확인된 idx 위치에서 마지막 idx까지 잘라내기
		System.out.println("N부터 마지막까지 자르기 : " + str1.substring(2,str4.length()));
		
	}

}
