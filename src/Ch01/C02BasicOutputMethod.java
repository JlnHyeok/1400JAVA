package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		// System.out : 표준 출력 스트림(해석: 표준 출력 장치(모니터)에 데이터 전달)
		
		// System.out.print() : 콘솔화면에 내용 출력
		// Escape 문자 사용을 통한 개행(줄바꿈)
		// Escape : 탈출하다, 벗어나다
		// Escape 문자 : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 문자
		// \n : 줄바꿈 (개행)
		// \b : 한문자 삭제(한 문자 삭제)
//		// \r : 8칸 커서 이동
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		System.out.print("Hello World\n");
//		// 문제
//		System.out.print("   *\n");
//		System.out.print("  ***\n");
//		System.out.print(" *****\n");
//		System.out.print("*******\n");
		
		// System.out.printf()
		// printf의 f는 format : 형식/서식
		// 서식 : 서류를 꾸미는 일정한 양식
		// % : 서식 문자
		
		// %d : 10진 정수문자
		// %f : 실수 서식문자
		// %c : 한문자 서식문자
		// %s : 문자열 서식문자
//		System.out.printf("%d\n",10);
//		System.out.printf("%d + %d = %d\n",10,20,10+20);
//		System.out.printf("%f + %f = %f\n", 10.23,20.75, 10.23+20.75); // 원하는 자릿수 까지 나타낼려면 %.2f 라고 적어준다.
//		System.out.printf("%c %c %c\n",'A','B','C'); 	// 한문자는 홑따옴표(')로 나타낸다.
//		System.out.printf("%s %s %s \n", "This is","String","Test");	// 문자열은 쌍따옴표(")로 나타낸다.
//		System.out.printf("%d.%s : %d\n", 1,"성적",100);
//
//		//문제
//		// 서식문자를 이용해서 다음과 같은 문장을 완성합니다.
//		// 나의 이름은 %s 입니다.
//		// 나의 나이는 %d 세 입니다.
//		// 나의 성별은 $c 입니다.
//		
//		System.out.printf("나의 이름은 %s 입니다.\n","허진혁");
//		System.out.printf("나의 나이는 %d 세 입니다.\n",27);
//		System.out.printf("나의 성별은 %c 입니다.\n",'M');
		
		// 서식문자 정렬/자리수 지정
//		System.out.printf("%-10d%d\n", 1234,5678); // 서식 문자 앞에 숫자 입력하면 해당 자릿수 확보한 다음 오른쪽 정렬, -적으면 왼쪽 정렬
//		System.out.printf("%10.2f\n", 10.123456);	// f앞에 .2 적어주면 2번째 짜리까지 반올림해서 보여줌.
//		
//		// 주의! 프린트 문 안에 문자열을 출력하고싶으면 역슬래쉬를 앞뒤로 해준다.
//		System.out.print("I say \"Hello?\" ");
		
		// System.out.println()
		// println 은 자동 줄바꿈이 된다.
		// println 은 서식문자를 지원하지 않는다.
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		// 문제
		// 다음과 같이 출력해봅시다. (서식문자,이스케이프문자 사용할것!)
		// NO		이름		나이		주소
		// 1		홍길동	20		대구		
		// 2		남길동	30		서울
		// 3		서길동	40		울산
		// 4		동길동	50		김해
		System.out.printf("%-10s%-10s%-10s%-10s\n", "NO","이름","나이","주소");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 1,"홍길동",20,"대구");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 2,"남길동",30,"서울");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 3,"서길동",40,"울산");
		System.out.printf("%-10d%-10s%-10d%-10s\n", 4,"동길동",50,"김해");
		
		System.out.printf("%-10s%-10s%-10s%-10s\n","Code","Title","Publisher","Price");
		System.out.printf("%-10d%-10s%-10s%-10d\n",1010,"DoItJava","00미디어",29000);
		System.out.printf("%-10d%-9s%-9s%-10d\n",2020,"윤성우C","오렌지미디어",25000);
		
		System.out.printf("   %c\n",'*');
		System.out.printf("  %s\n","***");
		System.out.printf(" %s\n","*****");
		System.out.printf("%s\n","*******");
		System.out.printf(" %s\n","*****");
		System.out.printf("  %s\n","***");
		System.out.printf("   %c\n",'*');
		
		System.out.println("Github Test");
		
	}

}
