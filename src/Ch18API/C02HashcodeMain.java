package Ch18API;

class C01Simple{

	@Override
	public int hashCode() {
		System.out.println("해시코드 함수 호출!");
		return 1;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}

public class C02HashcodeMain {

	public static void main(String[] args) {
		
		C01Simple ob = new C01Simple();
		System.out.println(ob.toString());	// 해시코드 먼저 호출한 다음 toString에 출력
//		System.out.printf("%x\n",ob.hashCode());
		
	}

}
