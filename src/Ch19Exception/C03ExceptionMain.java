package Ch19Exception;

public class C03ExceptionMain {

	public static void main(String[] args) {
		
		try {
			String data = null;
			System.out.println(data.toString());	// Null		--> 에러 발생하면 각 에러타입의 객체가 생성
			System.out.println(10/0);	// Arith
			int arr[]= new int[3];
			arr[3] = 10; 				// Bound out
		}
		catch(Exception e) {			// Exception 이라는 상위 객체로 UpCasting
//			System.out.println("에러발생");
			e.printStackTrace();
		}
		finally {						// 예외가 발생하든 안하든 무조건 실행
			System.out.println("예외 처리와는 무관하게 실행되는 코드");
		}
		
		
		System.out.println("실행코드 1");
		System.out.println("실행코드 2");
		
		
		
		
	}

}
