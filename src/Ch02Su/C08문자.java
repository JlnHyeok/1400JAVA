package Ch02Su;

public class C08문자 {

	public static void main(String[] args) {
		
		System.out.println((int)'A');
		System.out.println('A');
		
		char a=44032;
		
		System.out.println(a);
		System.out.printf("%x\n",(int)'가');
		System.out.printf("%x\n",(int)'나');
		
		System.out.println('\ub090'); 	// b090: '낏'의 유니코드 번호
		System.out.println((char)65);
		
	}

}
