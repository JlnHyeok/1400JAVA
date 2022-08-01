package Ch19Exception;

// throws : 생성된 예외객체의 위치값을 실행한 블럭의 catch 로 전달하는 코드
// throw  : 예외객체 생성 예약어

public class C04ExceptionMain {

	public static void div(int n1, int n2) throws Exception{	// 이 객체에서 예외발생시 만들어진 예외객체를 본문의 catch로 던진다.
		if (n2 ==0) {
			throw new Exception(" 산술 예외발생! 0으로 못나눈다");	// 여기에서 예외 객체를 만들어서 throws를 통해 본문의 catch로 던진다.
		}
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {
		
		try {
			div(10,0);
			
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("MAIN에서 예외 처리!");
		}
	}

}
