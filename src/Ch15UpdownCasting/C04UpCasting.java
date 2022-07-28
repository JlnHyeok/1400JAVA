package Ch15UpdownCasting;

class C04Animal{
	public void Sound() {
		System.out.println("소리를 냅니다.");
	}
}

class C04Dog extends C04Animal{
	public void Sound() {
		System.out.println("멍멍 소리를 냅니다.");
	}
	public void move() {
		System.out.println("이동합니다.");
	}
}

public class C04UpCasting {

	public static void main(String[] args) {
		C04Animal ob = new C04Animal();
		ob.Sound();
		C04Animal ani = new C04Dog();	// Upcasting
		ani.Sound();	// 가능 (상위 클래스형 참조변수로 오버라이딩된 하위클래스함수에 접근이 가능하다)
//		ani.move();		// 불가능 (-> Downcasting 을 통한 접근 필요)
		
		
	}

}
