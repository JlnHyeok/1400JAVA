package Ch19Exception;

public class C01NullPointer {

	public static void main(String[] args) {
		try {
			String data = null;
			System.out.println(data.toString());		
		}
		catch(NullPointerException e) {		// 예외가 발생했을때 예외 객체를 생성하고 e에 담는다.
//			System.out.println("예외발생!!");
			System.out.println(e.getCause());	// 원인
			System.out.println(e.toString());	// 예외 객체 정보
			System.out.println(e.getStackTrace()); 	// 예외 객체 식별주소
			e.printStackTrace();
		}
		
		System.out.println("실행되어야 할 코드 1");
		System.out.println("실행되어야 할 코드 2");
		
		
	}

}
